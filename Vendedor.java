public class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor() {
        super();
        this.percentualComissao = 0;
    }

    public Vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    public float calcularSalario(){
        return super.getSalario() + super.getSalario() * (getPercentualComissao()/100);
    }
    @Override
    public String toString() {
        return "\n\nNome do vendedor: " + getNome()
        + "\nsalario sem comicao: R$" + getSalario()
        + "\n(%) de comicao: " + getPercentualComissao() + "%"
        + "\nsalario com comicao: R$" + calcularSalario();
    }
}

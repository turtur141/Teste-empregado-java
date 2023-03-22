public class Gerente extends Empregado {
    private String departamento;

    public Gerente() {
        super();
        this.departamento = "(Não iniciado)";
    }

    public Gerente(String nome, int salario, String departamento) {
        super(nome,salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return "\n\nNome do gerente: " + getNome()
        + "\nsalario: R$" + getSalario()
        + "\ndepartamento:" + getDepartamento();
    }
}

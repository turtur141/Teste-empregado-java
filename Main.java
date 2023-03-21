public class App {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        System.out.print(e.toString());
        Gerente g = new Gerente();
        System.out.print(g.toString());
        Vendedor v = new Vendedor();
        System.out.print(v.toString());
        ConsoleComands.pauseConsole();
        ConsoleComands.clearConsole();
        e.setNome("Alice");
        e.setSalario(1100);
        System.out.print(e.toString());
        g.setNome("Artur");
        g.setSalario(1200);
        g.setDepartamento("Computador");
        System.out.print(g.toString());
        v.setNome("Claudia");
        v.setPercentualComissao(10);
        v.setSalario(17000);
        System.out.print(v.toString());
    }
}


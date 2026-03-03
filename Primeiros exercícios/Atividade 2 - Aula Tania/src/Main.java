public class Main {
    public static void main(String[] args) {
        Projeto p1 = new Projeto();
        Projeto p2 = new Projeto();

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        p1.setCodigo("print('Hello World!')");
        p1.setTitulo("Hello World!");
        p1.setDescricao("Imprime 'Hello World' em Python");
        p1.setDiasDuracao(1);

        p2.setCodigo("print('Olá Mundo!')");
        p2.setTitulo("Olá Mundo!");
        p2.setDescricao("Imprime 'Olá Mundo!' em Python");
        p2.setDiasDuracao(1);

        f1.setCodigo("print('Hello World!')");
        f1.setNome("Hello World!");
        f1.setCargo("Imprime 'Hello World' em Python");
        f1.setTempoServico(5);

        f2.setCodigo("print('Olá Mundo!')");
        f2.setNome("Olá Mundo!");
        f2.setCargo("Imprime 'Olá Mundo!' em Python");
        f2.setTempoServico(10);

        System.out.printf("\n\nTitulo projeto: %S\nCódigo: \n\n%s\nDescrição: %s\nDias de desenvolvimento: %d", p2.getTitulo(), p2.getCodigo(), p2.getDescricao(), p2.getDiasDuracao());
        System.out.printf("\n\nTitulo projeto: %S\nCódigo:\n\n%s\n\nDescrição: %s\nDias de desenvolvimento: %d", p2.getTitulo(), p2.getCodigo(), p2.getDescricao(), p2.getDiasDuracao());

        System.out.printf("\n\nNome Funcionário: %s\nCódigo: \n\n%s\n\nCargo: %s\nAnos de serviço: %d", f1.getNome(), f1.getCodigo(), f1.getCargo(), f1.getTempoServico());
        System.out.printf("\n\nNome Funcionário: %s\nCódigo: \n\n%s\nCargo: %s\nAnos de serviço: %d", f2.getNome(), f2.getCodigo(), f2.getCargo(), f2.getTempoServico());
    }
}

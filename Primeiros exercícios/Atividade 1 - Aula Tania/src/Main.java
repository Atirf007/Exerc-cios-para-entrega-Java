public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        Motorista m1 = new Motorista();
        Motorista m2 = new Motorista();

        v1.setMarca("Fiat");
        v1.setModelo("Uno");
        v1.setCor("Branco");
        v1.setAnoFabricacao(1983);

        v2.setMarca("Honda");
        v2.setModelo("HB20");
        v2.setCor("Preto");
        v2.setAnoFabricacao(2015);

        m1.setNome("Maria");
        m1.setNumeroHabilitacao(111222);

        m2.setNome("Joana");
        m2.setNumeroHabilitacao(222333);

        System.out.printf("\n\nNome: %s\nNumero Habilitação: %d", m1.getNome(), m1.getNumeroHabilitacao());
        System.out.printf("\n\nNome: %s\nNumero Habilitação: %d", m2.getNome(), m2.getNumeroHabilitacao());

        System.out.printf("\n\nMarca: %s\nModelo: %s\nCor: %s\nAno de fabricação: %d", v1.getMarca(), v1.getModelo(), v1.getCor(), v1.getAnoFabricacao());
        System.out.printf("\n\nMarca: %s\nModelo: %s\nCor: %s\nAno de fabricação: %d", v2.getMarca(), v2.getModelo(), v2.getCor(), v2.getAnoFabricacao());
    }
}

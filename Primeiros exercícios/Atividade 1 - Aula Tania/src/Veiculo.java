public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getCor(){
        return cor;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }
}


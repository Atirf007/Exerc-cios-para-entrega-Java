public class Funcionario {
    private String codigo;
    private String nome;
    private int tempoServico;
    private String cargo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCodigo() {
        return codigo;
    }
}

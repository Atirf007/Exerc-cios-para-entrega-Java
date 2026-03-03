public class Projeto {
    private String codigo;
    private String titulo;
    private int diasDuracao;
    private String descricao;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiasDuracao(int diasDuracao) {
        this.diasDuracao = diasDuracao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDiasDuracao() {
        return diasDuracao;
    }

    public String getDescricao() {
        return descricao;
    }
}

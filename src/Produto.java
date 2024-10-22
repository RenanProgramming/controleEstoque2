public class Produto {
    private String nome;
    private int qte_estoque;
    private double valor_unitario;
    private int codigo_barras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQte_estoque() {
        return qte_estoque;
    }

    public void setQte_estoque(int qte_estoque) {
        this.qte_estoque = qte_estoque;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public int getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(int codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", qte_estoque=" + qte_estoque +
                ", valor_unitario=" + valor_unitario +
                ", codigo_barras=" + codigo_barras +
                '}';
    }
}

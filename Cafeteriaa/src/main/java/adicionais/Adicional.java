package adicionais;


public class Adicional {
    private String nome;
    private double valor;

    protected void setNome(String nome) {
        this.nome = nome;
    }    

    public String getNome() {
        return nome;
    }

    protected void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
}

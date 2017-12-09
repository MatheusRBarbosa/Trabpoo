package Model;

public class Eletronico extends Produto{
    
    private String marca;
    private String peso;
    private String cor;
    
    public Eletronico (int codigo, String nome, String marca, String peso, String cor){
        super(codigo, nome);
        this.marca = marca;
        this.peso = peso;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }
    
    
}

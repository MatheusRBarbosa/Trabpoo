package Model;

public class Item {
    private Produto produto;
    private Loja loja;
    private double valor;
    
    public Item(Produto produto, Loja loja, double valor){
        this.produto = produto;
        this.loja = loja;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public Loja getLoja() {
        return loja;
    }

    public Produto getProduto() {
        return produto;
    }
    
}

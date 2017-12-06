package Model;

import java.util.HashMap;
import java.util.Map;

public class Item {

    private Produto produto;
    private Loja loja;
    private double valor;

    private static Map<Integer, Item> itens = new HashMap<>();

    public Item(){}
    
    public Item(Produto produto, Loja loja, double valor) {
        this.produto = produto;
        this.loja = loja;
        this.valor = valor;
    }

    public Map<Integer, Item> getItens() {
        return itens;
    }

    public void setItens(Map<Integer, Item> itens) {
        this.itens = itens;
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
    
    public Item buscaCodigo(int codigo){
        if(this.itens.containsKey(codigo)){
            return itens.get(codigo);
        }
        return null;
    }

}

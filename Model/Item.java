package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Item implements Serializable{
    private static final long serialVerionUID = 1L;
    private Produto produto;
    private Loja loja;
    private double valor;
    private int quantidade;

    private static Map<Integer, ArrayList<Item>> itens = new HashMap<>();

    public Item(){}
    
    public Item(Produto produto, Loja loja, double valor, int quantidade) {
        this.produto = produto;
        this.loja = loja;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Map<Integer, ArrayList<Item>> getItens() {
        return itens;
    }

    public void setItens(Map<Integer, ArrayList<Item>> itens) {
        this.itens = itens;
    }

    public Double getValor() {
        return valor;
    }

    public Loja getLoja() {
        return loja;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public ArrayList<Item> buscaCodigo(int codigo){
        if(this.itens.containsKey(codigo)){
            return itens.get(codigo);
        }
        return null;
    }
    
    @Override
    public String toString(){
        return "["+this.getProduto().getCodigo()+"]"+
                " Produto: "+this.getProduto().getNome()+
                " - "+this.getLoja().getNome()+
                " - R$"+this.getValor()+
                " - "+this.getQuantidade()+" un.";
    }

}

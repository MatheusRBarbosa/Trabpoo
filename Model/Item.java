package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Item {

    private Produto produto;
    private Loja loja;
    private double valor;

    private static Map<Integer, ArrayList<Item>> itens = new HashMap<>();

    public Item(){}
    
    public Item(Produto produto, Loja loja, double valor) {
        this.produto = produto;
        this.loja = loja;
        this.valor = valor;
    }

    public Map<Integer, ArrayList<Item>> getItens() {
        return itens;
    }

    public void setItens(Map<Integer, ArrayList<Item>> itens) {
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
                " - R$"+this.getValor()+"\n";
    }

}

package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable{
    private static final long serialVerionUID = 1L;
    private static List<String> produtos = new ArrayList<>();
    private String nome;
    private int codigo;

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public static List<String> getProdutos() {
        return produtos;
    }
    
    public static void setProdutos(List<String> produtos) {
        Produto.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class Loja implements Serializable{
    private static final long serialVerionUID = 1L;
    private String codigo;
    private String nome;
    private int avaliacao;
    private static List<Loja> lojas = new ArrayList<>();
    
    public Loja(){}

    public Loja(String codigo, String nome, int avaliacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.avaliacao = avaliacao;
    }
    
    public void setLojas(List<Loja> lojas){
        this.lojas = lojas;
    }
    
    public List<Loja> getLojas() {
        return lojas;
    }
     
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    
    @Override
    public String toString(){
        return getNome()+" - Nota: "+getAvaliacao();
    }

}

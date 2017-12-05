/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class Loja {

    private String codigo;
    private String nome;
    private int avaliacao;
    private static List<String> lojas = new ArrayList<>();

    public Loja(String codigo, String nome, int avaliacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

}

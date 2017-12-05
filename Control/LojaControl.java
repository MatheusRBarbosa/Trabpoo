/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Loja;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mathe
 */
public class LojaControl {
    private List<Loja> lojas = new ArrayList<>();
    public void setLojas(){
        lojas.add(new Loja("AMER", "Americanas.com", 5));
        lojas.add(new Loja("SARA", "Livraria Saraiva", 5));
        lojas.add(new Loja("SUBM", "Submarino.com", 4));
        lojas.add(new Loja("RICE", "Ricardo Eletro", 4));
        lojas.add(new Loja("MAGA", "Magazine Luiza", 5));
        lojas.add(new Loja("MEGA", "Megaloja Palace", 1));
    }
    
    public Loja buscaLoja(String codigo){
        for(int i=0;i<lojas.size();i++){
            if(lojas.get(i).getCodigo().equals(codigo)){
                return lojas.get(i);
            }
        }
        return null;
    }
    
}

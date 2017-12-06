/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mathe
 */
public class TesteDeHash {

    public static void main(String args[]) {
        Map<Integer, String> ex = new HashMap<>();
        ex.put(1001, "PROD1");
        ex.put(1002, "PROD2");
        ex.put(2002, "produto 3");
        ex.put(2002, "AAAAA");
        
        int chave = 2002;
        String sr = "PROD";
        
        if(ex.containsKey(chave)){
            System.out.println("Chave: "+ex.get(chave));
        }
        
        for(Integer i : ex.keySet()){
            if(ex.get(i).contains(sr)){
                System.out.println("Chave: "+ex.hashCode()+" - Conteudo: "+ex.get(i));
            }
            
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mathe
 */
public class TesteDeHash {

    public static void main(String args[]) {
        Map<Integer, List<String>> ex = new HashMap<>();
        ex.put(1001, Arrays.asList("PROD1iow PROD100", "PROD!IO!@JIO!"));
        ex.put(1002, Arrays.asList("PROD fwe wwwwwwwww", "PROD!IO!@JIO!"));
        ex.put(2002, Arrays.asList("PRAAAAAAOD fw BBBBBB", "CCCCCC!IO!@JIO!"));
        
        int chave = 1001;
        String sr = "PROD";
        
        
        if(ex.containsKey(chave)){
            List<String> exArray = ex.get(chave);
            for(int i=0;i<exArray.size();i++){
                System.out.println(exArray.get(i));
            }
            //System.out.println("Chave: "+ex.get(chave));
        }
        
       /* for(Integer i : ex.keySet()){
            if(ex.get(i).contains(sr)){
                System.out.println("Chave: "+ex.hashCode()+" - Conteudo: "+ex.get(i));
            }
            
        }*/
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Item;
import Model.Produto;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author mathe
 */
public class ProdutoControl {
    
    public ArrayList<Item> buscaProduto(int codigo, Map<Integer, ArrayList<Item>> itens){
        if(itens.containsKey(codigo)){
            return itens.get(codigo);
        }
        return null;
    }
}

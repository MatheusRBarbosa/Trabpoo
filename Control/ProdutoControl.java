/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Item;
import Model.Produto;
import java.util.List;

/**
 *
 * @author mathe
 */
public class ProdutoControl {
    
    public Produto buscaProduto(int codigo, List<Item> itens){
        for(int i=0;i<itens.size();i++){
            if(itens.get(i).getProduto().getCodigo() == codigo){
                return itens.get(i).getProduto();
            }
        }
        return null;
    }
}

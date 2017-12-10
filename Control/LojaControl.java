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
    Loja loja = new Loja();

    public void setLojas(List<String> lojasFile) {
 
        for (int i = 0; i < lojasFile.size(); i++) {
            String[] dados = lojasFile.get(i).split(";");
            
            lojas.add(new Loja(dados[0], dados[1], Integer.parseInt(dados[2])));
        }
        loja.setLojas(lojas);

    }

    public Loja buscaLoja(String codigo) {
        lojas = loja.getLojas();
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).getCodigo().equals(codigo)) {
                return lojas.get(i);
            }
        }
        return null;
    }

}

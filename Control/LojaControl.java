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

    private static List<Loja> lojas = new ArrayList<>();
    Loja loja;

    public void setLojas(List<String> lojasFile) {

        for (int i = 0; i < lojasFile.size(); i++) {
            String[] dados = lojasFile.get(i).split(";");
            int nota = Integer.parseInt(dados[2]);
            loja = new Loja(dados[0], dados[1], nota);
            lojas.add(loja);
        }
    }

    public static List<Loja> getLojas() {
        return lojas;
    }

    public Loja buscaLoja(String codigo) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).getCodigo().equals(codigo)) {
                return lojas.get(i);
            }
        }
        return null;
    }
}

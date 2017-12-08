/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Eletronico;
import Model.Item;
import Model.ItemCasa;
import Model.Livro;
import Model.Loja;
import Model.Produto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mathe
 */
public class ItemControl {

    Map<Integer, ArrayList<Item>> itens = new HashMap<>();
    Item item;
    LojaControl lojaControl = new LojaControl();
    ProdutoControl produtoControl = new ProdutoControl();
    String[] dados;

    public void setItens(List produtos) {

        lojaControl.setLojas();//ler no arquivo
        Produto prod = null;

        for (int i = 0; i < produtos.size(); i++) {
            dados = produtos.get(i).toString().split(";");

            Loja loja = lojaControl.buscaLoja(dados[0]);

            int codigo = Integer.parseInt(dados[1]);
            String nome = dados[3];

            ArrayList<Item> prodItem = produtoControl.buscaProduto(codigo, itens);
            //0 - Loja, 1 - Codigo, 2 - Nome, 3 - Valor, 4 - 7 Especifico
            if (prodItem == null) {
                prodItem = new ArrayList<>();
            }
            switch (dados[2]) {
                case "ItemCasa":
                    prod = new ItemCasa(codigo, nome, dados[5], dados[6], dados[7]);
                    break;
                case "Eletronico":
                    prod = new Eletronico(codigo, nome, dados[5], dados[6], dados[7]);
                    break;
                case "Livro":
                    prod = new Livro(codigo, nome, dados[5], dados[6]);
                    break;
            }

            double valor = Double.parseDouble(dados[4].replace(',', '.'));
            item = new Item(prod, loja, valor);
            prodItem.add(item);
            itens.put(codigo, prodItem);
        }
        item.setItens(itens);
    }
}

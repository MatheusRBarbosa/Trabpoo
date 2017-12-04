/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import View.Menu;

import java.util.ArrayList;
import java.util.List;

import Model.Item;
import Model.Produto;

/**
 *
 * @author mathe
 */
public class app {
    public static void main(String args[]){
        Menu menu = new Menu();
        menu.show();
        
        List item = new ArrayList<Item>();
        
        Produto produtos = new Produto();
        List p = produtos.getProdutos();
        
        for(int i=0; i<p.size(); i++){
        	String[] line = p.get(i).toString().split(";");
        	switch (line[2]) {
			case "ItemCasa":
				
				break;
			case "Eletronico":
				
				break;
				
			case "Livro":
				
				break;

			}
        }
    }
}




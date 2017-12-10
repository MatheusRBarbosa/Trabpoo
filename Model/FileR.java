/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mathe
 */
public class FileR {

    private List<String> file = new ArrayList<>();

    public List<String> readFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        while (br.ready()) {
            String line = br.readLine();
            file.add(line);
        }
        br.close(); 
        return file;
    }
    
    public static void escrever_dat(List<Item> lista) {
		try {
			File arqprod = new File("C:/Users/PC/Downloads/Teste.dat"); //cria ou sobrescreve o arquivo
			PrintStream writer = new PrintStream(arqprod); //cria writer
			
			for (Item i:lista) { //percorre arraylist
				//writer.println(i.getloja() + ";" + i.gettipo() + ";" + i.getid());
				if (i.getProduto() instanceof Livro) {
					Livro iprod = (Livro)i.getProduto();
					writer.println(i.getLoja().getNome() + ";" + i.getProduto().getCodigo() + ";" + "Livro" + ";" + i.getProduto().getNome() + ";" + i.getQuantidade() + ";" + i.getValor() + ";" + iprod.getAutor() + ";" + iprod.getNumPag());
                                }
				if (i.getProduto() instanceof ItemCasa) {
					ItemCasa iprod = (ItemCasa)i.getProduto();
					writer.println(i.getLoja().getNome() + ";" + i.getProduto().getCodigo() + ";" + "ItemCasa" + ";" + i.getProduto().getNome() + ";" + i.getQuantidade() + ";" + i.getValor() + ";" + iprod.getMaterial() + ";" + iprod.getCor() + ";" + iprod.getTipo());
				}
				if (i.getProduto() instanceof Eletronico) {
					Eletronico iprod =(Eletronico)i.getProduto();
					writer.println(i.getLoja().getNome() + ";" + i.getProduto().getCodigo() + ";" + "Eletronico" + ";" + i.getProduto().getNome() + ";" + i.getQuantidade() + ";" + i.getValor() + ";" + iprod.getMarca() + ";" + iprod.getPeso() + ";" + iprod.getCor());
				}
			}
			writer.close();
		} catch(FileNotFoundException fnf) {
			System.err.println("NÃ£o encontrou o file");
		}
		
	}
}

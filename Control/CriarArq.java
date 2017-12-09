package Control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class CriarArq {
	
	public static void write_dat(List<Produto> lista) {
		try {
			File arqprod = new File("C:/Users/PC/Downloads/Teste.dat"); //cria ou sobrescreve o arquivo
			PrintStream writer = new PrintStream(arqprod); //cria writer
			
			for (Produto i:lista) { //percorre arraylist
				writer.println(i.getloja() + ";" + i.gettipo() + ";" + i.getid()); //digita linha no .dat
			}
			writer.close();
		} catch(FileNotFoundException fnf) {
			System.err.println("Não encontrou o file");
		}
		
	}
	
}

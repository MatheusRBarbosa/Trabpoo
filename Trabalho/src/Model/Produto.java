package Model;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private static List<String> produtos = new ArrayList<>();
	
	private String nome;
	private int codigo;
	
	public static List<String> getProdutos() {
		return produtos;
	}
	
	public static void setProdutos(List<String> produtos) {
		Produto.produtos = produtos;
	}
}

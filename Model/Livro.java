package Model;

public class Livro extends Produto{
    
    private String autor;
    private String numPag;
    
    public Livro(int codigo, String nome, String autor, String numPag){
        super(codigo, nome);
        this.autor = autor;
        this.numPag = numPag;
    }
}

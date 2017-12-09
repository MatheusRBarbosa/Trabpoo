package Model;

public class ItemCasa extends Produto{
    
    private String material;
    private String cor;
    private String tipo;
    
    public ItemCasa(int codigo, String nome, String material, String cor, String tipo){
        super(codigo, nome);
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }
    
    

}

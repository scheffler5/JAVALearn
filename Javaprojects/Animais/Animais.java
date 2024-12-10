package animais;

/**
 *
 * @author gabri
 */


public class Animais {
    protected String nome;

    public Animais(String nome) {
        this.nome = nome;
    }

    public void emitirsom() { // Nome em minúsculas
        System.out.println("Emitiu Som!");
    }

    public void locomover() {
        System.out.println("Se locomoveu");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

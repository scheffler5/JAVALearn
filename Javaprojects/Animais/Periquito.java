package animais;

public class Periquito extends Animais {

    public Periquito(String nome) {
        super(nome);
    }

    @Override
    public void emitirsom() { 
        System.out.printf("O %s (Periquito) emitiu som\n", getNome());
    }
    
    @Override
    public void locomover(){
        System.out.printf("O %s (Periquito) locomoveu-se\n",getNome());
    }
}

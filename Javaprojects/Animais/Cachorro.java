/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;

/**
 *
 * @author gabri
 */
public class Cachorro extends Animais{
     public Cachorro(String nome) {
        super(nome);
    }
     
    @Override
    public void emitirsom() { 
        System.out.printf("O %s (Periquito) emitiu som\n", getNome());
    }
    
    @Override
    public void locomover(){
        System.out.printf("O %s (Cachorro) locomoveu-se\n",getNome());
    }
}

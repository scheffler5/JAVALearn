/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animais;

/**
 *
 * @author gabri
 */
public class NewMain {
    public static void main(String[] args) {
        Animais a = new Animais("Animal");
        a.emitirsom();
        a.locomover();
        
        Periquito p = new Periquito("Olavo");
        p.emitirsom();
        p.locomover();
        
        Cachorro c = new Cachorro("Bethoven");
        c.emitirsom();
        c.locomover();
        
        Gato g = new Gato("Minhau");
        g.emitirsom();
        g.locomover();
    }
    
}

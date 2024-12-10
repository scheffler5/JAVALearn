package calc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora(3, 5, 10.1, 3.7);

        
        c.somar();             
        c.somar(3);            
        c.somar(3, 5);         
        c.somar(10.1);         
        c.somar(10.1, 3.7);    
    }
}


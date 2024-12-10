/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author gabri
 */
public class livroBiblioteca extends Livro {
    
    public livroBiblioteca(String titulo,String author,int ano,boolean empres) {
        super(titulo,author,ano,empres);
    }
    
    @Override
    public void verificar_localizacão(String loc){
        System.out.printf("Seu livro esta no %s\n",loc);
    }
    
    @Override
    public void verificar_emprestimo(){
        if (empres == true){
            System.out.println("Seu livro escolhido ja foi emprestado! ");
        }
        else {
            System.out.println("Seu livro esta apto a ser emprestado a voce! ");
        }
    }
    @Override
    public void dias_restantes(int dias_corridos){
        Max_dias = 30;
        int dias_restantes = Max_dias - dias_corridos;
        System.out.printf("Os dias retantes sao: %d",dias_restantes);
    }
    @Override
    public void Informacoes(){ 
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+author);
        System.out.println("Ano de publicação: "+ano);
        verificar_emprestimo();
        verificar_localizacão("estante 2");
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.biblioteca;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String titulo1 = "hackeando tudo";
        livroBiblioteca l1 = new livroBiblioteca(titulo1, "Raiam santos", 2004, false);

        String titulo2 = "Sun Tzu";
        livroBiblioteca l2 = new livroBiblioteca(titulo2, "Mestre", 1512, true);

        String titulo3 = "Biblia";
        livroBiblioteca l3 = new livroBiblioteca(titulo3, "Deus", -2000, false);

        String titulo4 = "Introdução a Ciencia da computação";
        livroBiblioteca l4 = new livroBiblioteca(titulo4, "Gabriel Scheffler", 2024, false);

        System.out.println("Olá, seja bem-vindo à nossa biblioteca!");
        System.out.print("Digite o nome do livro requisitado: ");
        String n = s.nextLine();

        // Comparações corrigidas usando .equals()
        if (n.equals(titulo1)) {
            l1.Informacoes();
        } else if (n.equals(titulo2)) {
            l2.Informacoes();
        } else if (n.equals(titulo3)) {
            l3.Informacoes();
        } else if (n.equals(titulo4)) {
            l4.Informacoes();
        } else {
            System.out.println("Este livro não está em nossa biblioteca!");
        }
    }
}


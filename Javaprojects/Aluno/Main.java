/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Olá Professor, Cadastre as notas dos alunos ");
            System.out.print("Digite o nome do aluno(ou 'sair' para sair): ");
            String nome = s.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            } else {
                System.out.print("Digite a nota da prova 1: ");
                double n1 = s.nextDouble();
                System.out.print("Digite a nota da prova 2: ");
                double n2 = s.nextDouble();
                s.nextLine();  

                Aluno al = new Aluno(nome, n1, n2);  
                aluno.adicionarAluno(nome, al);
            }
        
            }
        System.out.println("\n--- Exibindo Notas  ---");
        aluno.ExibirNotas();
        System.out.println("\n--- Exibindo Aprovação/Reprovação ---");
        aluno.ExbirAprov();
        System.out.println("\n--- Exibindo Médias ---");
        aluno.exibirMedias();
}
}


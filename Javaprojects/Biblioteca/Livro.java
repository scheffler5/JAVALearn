package com.mycompany.biblioteca;

/**
 *
 * @author gabri
 */
public class Livro implements itemBiblioteca{
    protected String titulo;
    protected String author;
    protected int ano;
    protected int Max_dias;
    protected String loc;
    protected boolean empres;

    public Livro(String titulo,String author,int ano,boolean empres) {
        this.titulo = titulo;
        this.author = author;
        this.ano = ano;
        this.empres = empres;
    }
    
    public void verificar_emprestimo(){
        if (empres == true){
            System.out.println("Seu livro escolhido ja foi emprestado! ");
        }
        else {
            System.out.println("Seu livro esta apto a ser emprestado a voce! ");
        }
    }
    public void verificar_localizacão(String loc){
        System.out.printf("Seu livro esta no %s\n",loc);
    }
    public void dias_restantes(int dias_corridos){
        Max_dias = 30;
        int dias_restantes = Max_dias - dias_corridos;
        System.out.printf("Os dias retantes sao: %d",dias_restantes);
    }
    public void Informacoes(){ 
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+author);
        System.out.println("Ano de publicação: "+ano);
        verificar_emprestimo();
        verificar_localizacão("estante 2");
        
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void dias_restantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

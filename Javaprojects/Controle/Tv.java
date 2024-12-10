/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class Tv implements iControleRemoto{
    protected String modelo;
    protected double tamanho;
    protected int canal;
    protected int volume;
    protected boolean estado;

    public Tv(String modelo, double tamanho) {
        this.modelo = modelo;
        this.tamanho = tamanho;
    }
    

    
    public void Mudar_canal(){
    canal ++;
        System.out.println("Sua televisao subiu um canal!");
    }
    public void AumentarVol(){
        volume ++;
        System.out.println("Sua televisao subiu um ponteiro de volume!");
    }
    public void DiminuirVol(){
        volume --;
        System.out.println("Sua televisao diminuiu um ponteiro de volume!");
    }
    public void ligar(){
        estado = true;
        System.out.println("Sua televisao esta ligada!");
    }
    public void Desligar(){
        estado = false;
        System.out.println("Sua televisao esta desligada!");
    }
    
}

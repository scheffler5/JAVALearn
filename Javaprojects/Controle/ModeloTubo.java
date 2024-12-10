/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class ModeloTubo extends Tv{
    
    public ModeloTubo(String modelo, double tamanho) {
        super(modelo, tamanho);
    }

    @Override
    public void Mudar_canal(){
    canal ++;
        System.out.println("Sua televisao subiu um canal!");
    }
    @Override
    public void AumentarVol(){
        volume ++;
        System.out.println("Sua televisao subiu um ponteiro de volume!");
    }
    @Override
    public void DiminuirVol(){
        volume --;
        System.out.println("Sua televisao diminuiu um ponteiro de volume!");
    }
    @Override
    public void ligar(){
        estado = true;
        System.out.println("Sua televisao esta ligada!");
    }
    @Override
    public void Desligar(){
        estado = false;
        System.out.println("Sua televisao esta desligada!");
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class Media {
    private Aluno aluno;
    public Media(Aluno aluno){
        this.aluno = aluno;
    }
    public double MediaSimples(){
        return(aluno.getN1() + aluno.getN2())/2;
    }
    public double MediaPonderada(){
        double peso1 = 0.6;
        double peso2 = 0.4;
        return ((aluno.getN1()*peso1)+(aluno.getN2()*peso2))/(peso1 +peso2);
    }
    public double MediaGeometrica(){
        double soma = Math.sqrt(aluno.getN1() * aluno.getN2());
        return soma;
    }
    
    
}

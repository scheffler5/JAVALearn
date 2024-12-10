import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ModeloTubo t = new ModeloTubo("Turbo",32.4);
        
        ModeloSmart m = new ModeloSmart("Smart",50.0);
        
        System.out.println("Abrindo Controle.......");
        System.out.println("Qual o modelo de televisao voce quer assumir? (Smart/Turbo)");
        String modelo = s.nextLine();
        if (modelo.toLowerCase().equals("smart")){
            m.ligar();
            m.AumentarVol();
            m.DiminuirVol();
            m.Mudar_canal();
            m.AbrirNetflix();
            m.Desligar();
        }else if (modelo.toLowerCase().equals("tubo")){
            t.ligar();
            t.AumentarVol();
            t.DiminuirVol();
            t.Mudar_canal();
            t.Desligar();
        }else{
            System.out.println("Voce nao digitou nenhum numero correspondente! ");
        }
        
                
               
                
                
                
                
    }
    
}

package calc;
public class Calculadora {
    private int a;
    private int b;
    private double c; 
    private double d; 

    // Construtor corrigido para inicializar os atributos
    public Calculadora(int a, int b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Sobrecarga de métodos para diferentes formas de soma
    public void somar() {
        int S = a + a + b;
        System.out.println("Sua Soma é " + S);
    }

    public void somar(int a) {
        int S = a + a + a;
        System.out.println("Sua Soma é " + S);
    }

    public void somar(int a, int b) {
        int S = a + b + b;
        System.out.println("Sua Soma é " + S);
    }

    public void somar(double c) {
        double z = c + c + c + c;
        System.out.println("Sua Soma é " + z);
    }

    public void somar(double c, double d) {
        double z = c + c + d + d;
        System.out.println("Sua Soma é " + z);
    }
}

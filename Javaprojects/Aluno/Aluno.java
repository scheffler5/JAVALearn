import java.util.HashMap;

public class Aluno {
    private String nome;
    private HashMap<String, Aluno> classe = new HashMap<>();
    private double n1;
    private double n2;
    private Media medias;
    
    public Aluno(String nome,double n1,double n2){
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }
    public Aluno(){
        
    }
    public Aluno(Media medias){
        this.medias = new Media(this);
    }
    public void ExibirNotas(){
        for (Aluno alunu : classe.values()) {
            System.out.println(alunu);
    }
    }
    public void ExbirAprov(){
        for (Aluno alunu : classe.values()) {
            medias = new Media(alunu);
            if (medias.MediaSimples() >= 6.5 && medias.MediaPonderada() >= 6) {
                System.out.printf("O aluno %s Foi aprovado\n",alunu.getNome());
            } else {
                System.out.printf("O aluno %s Foi reprovado\n",alunu.getNome());
            }
    }
    }
    
    public void exibirMedias() {
        for (Aluno alunu : classe.values()) {
            medias = new Media(alunu);
            System.out.println("Médias para " + alunu.getNome() + ":");
            System.out.println("Media Simples: " + medias.MediaSimples());
            System.out.println("Media Ponderada: " + medias.MediaPonderada());
            System.out.println("Media Geometrica: " + medias.MediaGeometrica());
            System.out.println();
        }
    }
   public void adicionarAluno(String nome, Aluno aluno) {
        classe.put(nome, aluno);
    }  
    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public Media getMedia() {
        return medias;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota 1: " + n1 + ", Nota 2: " + n2;
    }
    
}

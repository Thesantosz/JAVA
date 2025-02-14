public class Aluno {

    private String nome;
    private double cansaco;

    public  Aluno(String nome, double cansaco){

        this.nome = nome;
        this.cansaco = cansaco;
    }

    public String getNome(){
        return nome;
    }

    public double getCansaco(){
        return cansaco;
    }

    public void setCansaco(double cansaco){
        this.cansaco = cansaco;
    }

}

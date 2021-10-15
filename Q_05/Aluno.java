package Q_05;

public class Aluno {
    private String nome;
    private String cpf;
    private double nota1, nota2, nota3, m;

    //MÉTODO CONSTRUTOR
    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //MÉTODOS GETs and SETs

    /* --- nome --- */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /* --- cpf --- */
    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    /* --- nota1 --- */
    public double getNota1(){
        return nota1;
    }

    public void setNota1(double n1){
        this.nota1 = n1;
    }

    /* --- nota2 --- */
    public double getNota2(){
        return nota2;
    }

    public void setNota2(double n2){
        this.nota2 = n2;
    }

    /* --- nota3 --- */
    public double getNota3(){
        return nota3;
    }

    public void setNota3(double n3){
        this.nota3 = n3;
    }

    //MÉTODOS PERSONALIZADOS
    public void calcularMedia(){
        m = (nota1 + nota2 + nota3) / 3;
    }

    public double getMedia(){
        return m;
    }

}

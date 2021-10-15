package Q_05;

public class objaluno {
    public static void main(String[] args) {
        double m;
        Aluno aluno = new Aluno("Joedson Souza", "123.456.987-51");

        aluno.setNota1(7);
        aluno.setNota2(8);
        aluno.setNota3(6);

        aluno.calcularMedia();
        m = aluno.getMedia();

        System.out.println("Média: " + m);

        aluno.setNota2(3);
        aluno.calcularMedia();
        System.out.println("Média: " + aluno.getMedia());
    }
}

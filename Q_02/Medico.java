package Q_02;

public class Medico {
    private int codigo;
    private String nome;
    private String sexo;
    private String especialidade;
    private Endereco endereco;

    //MÉTODO CONSTRUTOR
    public Medico(int codigo, String nome, String sexo, String especialidade, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    //MÉTODOS GETs and SETs

    /* --- codigo --- */
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    /* --- nome --- */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /* --- sexo --- */
    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    /* --- especialidade --- */
    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    /* --- endereco --- */
    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    //MOSTRAR DADOS
    public void mostMedico(){
        System.out.println("-----> Dados do Médico <-----");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("");
        endereco.mostEndereco();
    }
}

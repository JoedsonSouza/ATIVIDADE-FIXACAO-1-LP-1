package Q_02;

public class objendereco {
    public static void main(String[] args) {

        //INSTANCIAR OBJETO ENDEREÇO
        Endereco endereco = new Endereco("Monsenhor Berenguer", 476, "Praça da Igreja Matriz", "Centro", "Monte Santo", "BA", "48800-000");

        //INSTANCIAR OBJETO MÉDICO
        Medico medico = new Medico(007, "Breno Araújo", "Masculino", "Cardiologia", endereco);

        //IMPRIMIR OS DADOS DOS DOIS OBJETOS
        medico.mostMedico();
        System.out.println("");

        //MODIFICAR OS DADOS DO OBJETO ENDEREÇO
        endereco.setBairro("Centro");
        endereco.setCEP("48500-000");
        endereco.setCidade("Euclides da Cunha");
        endereco.setComplemento("Praça");
        endereco.setNumero(14);
        endereco.setRua("Joaquim Santana Lima");
        endereco.setUF("BA");

        //MODIFICAR OS DADOS DO OBJETO MÉDICO
        medico.setCodigo(1977558);
        medico.setEndereco(endereco);
        medico.setEspecialidade("Ortopedia");
        medico.setNome("Lúcia Carvalho");
        medico.setSexo("Feminino");

        //IMPRIMIR OS DADOS DOS DOIS OBJETOS
        medico.mostMedico();

    }
}

package Q_03;

public class Lutador {
    private String nome;
    private int energia;
    private int forca;
    static int g;

    //MÉTODO CONSTRUTOR
    public Lutador(String nome, int energia, int forca){
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    //MÉTODOS GETs and SETs

    /* --- nome --- */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /* --- energia --- */
    public int getEnergia(){
        return energia;
    }

    public void mostEnergia(){
        System.out.println("Energia de " + getNome() + ": " + getEnergia());
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    /* --- forca --- */
    public int getForca(){
        return forca;
    }

    public void setForca(int forca){
        this.forca = forca;
    }
    
    //MÉTODOS PERSONALIZADOS
    /*
    public void reduzirEnergia(Lutador lut1, Lutador lut2){
        lut2.energia = lut2.energia - lut1.forca;
    }

    public void aplicarGolpe(Lutador lut1, Lutador lut2){
        lut2.reduzirEnergia(lut1, lut2);
    }
    */
    public void reduzirEnergia(){
        this.energia -= g;
    }

    public void aplicarGolpe(Lutador lut1){
        g = this.forca;
        lut1.reduzirEnergia();
    }
}

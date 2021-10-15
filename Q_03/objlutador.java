package Q_03;

public class objlutador {
    public static void main(String[] args) {
        Lutador ryu =  new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);

        /*for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(ryu, bison);    
        }
        bison.mostEnergia();

        for (int i = 0; i < 8; i++) {
            bison.aplicarGolpe(bison, ryu);    
        }
        ryu.mostEnergia();*/

        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);    
        }
        bison.mostEnergia();

        for (int i = 0; i < 8; i++) {
            bison.aplicarGolpe(ryu);    
        }
        ryu.mostEnergia();
        
    }
}

public class main {

    public static void main(String[] args) {
        Personagem prota = new Personagem();
        prota.nome = "prota";
        prota.vida = 100;
        prota.forca = 20;
        Personagem boss = new Personagem();
        boss.nome = "boss";
        boss.vida = 80;
        boss.forca = 10;

        prota.ficha();
        boss.ficha();

        while(boss.estaVivo() && prota.estaVivo()){
            prota.atacar(boss);
            System.out.printf("\nVida boss: %d\n", boss.vida);
            if(boss.estaVivo()){
                boss.atacar(prota);
                System.out.printf("\nVida protagonista: %d\n", prota.vida);
            }
        }
        prota.ficha();
        boss.ficha();
        if(boss.estaVivo()){
            System.out.println("\nboss vence");
        } else{
            System.out.println("\nprotagonista vence");
        }
    }
}
public class Main {

    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();

        System.out.println("Personagem 1: " + personagem1.getNome());
        personagem1.atacar();
        personagem1.atacar(20);

        System.out.println();

        Personagem personagem2 = new Personagem("Guerreiro", 100, 5);

        System.out.println("Personagem 2: " + personagem2.getNome());
        personagem2.atacar();
        personagem2.atacar(50);
    }
}

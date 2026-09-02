public class Main {
    public static void main(String[] args) {
        Mago elara = new Mago("Elara", 100, 10, 200);
        Item espada1 = new Item("Espada de Aço", 3);
        elara.pegar(espada1);
        elara.ficha();

        Guerreiro bran = new Guerreiro("Bran", 100, 10, 5);
        bran.receberDano(8);
        bran.ficha();

        elara.setMana(-10);
    }
}

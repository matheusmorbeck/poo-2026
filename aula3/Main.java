public class Main {

    public static void main(String[] args) {

        Personagem p = new Personagem();

        p.setNome("Mario");
        p.setVida(100);
        p.setNivel(5);

        System.out.println(p.getNome());
        System.out.println(p.getVida());
        System.out.println(p.getNivel());
        
        p.setNome("");
        p.setVida(-50);
        p.setNivel(0);
    }
}

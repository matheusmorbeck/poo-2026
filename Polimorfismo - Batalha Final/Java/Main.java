import java.util.ArrayList;

/*
Uso de IA:

Foi utilizada IA apenas para corrigir erros na definicao do construtor da classe Chefe e para tirar duvidas da sintaxe e estrutura do instanceof
Ferramenta: ChatGPT
Link da conversa: https://chatgpt.com/share/6a9e2e3c-4dbc-83e9-80a7-08b5c9a3e5ad
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> herois = new ArrayList<>();

        Guerreiro bran = new Guerreiro("Bran", 100, 10, 5);
        Mago elara = new Mago("Elara", 100, 10, 200);

        herois.add(elara);
        herois.add(bran);

        Item espada1 = new Item("Espada de Aço", 3);
        bran.pegar(espada1);

        Chefe lich = new Chefe("Lich");

        for (Personagem p : herois) {
            p.ficha();
            p.habilidade();
            p.atacar(lich, 10);
        }

        System.out.printf("Vida do chefe: %d", lich.getVida());


        //esse uso é permitido pois acessa atributos de apenas dos objetos de uma das subclasses da lista, já no caso da batalha não seria possivel
        //pois usa atributos e metodos envolvendo as duas subclasses
        for (Personagem p : herois) {
            if (p instanceof Mago) {
                System.out.printf("%nMana do mago %s: %d%n", p.nome, ((Mago) p).getMana());
            }
        }
    }
}

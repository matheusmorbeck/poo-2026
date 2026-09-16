import java.util.ArrayList;

/*
Uso de IA:

Foi utilizada IA para corrigir erros na estrutura do codigo e tirar duvidas sobre criação de interface e organização dos elementos na grid
Ferramenta: Claude
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> herois = new ArrayList<>();

        Guerreiro bran = null;
        Mago elara = null;

        try {
            bran = new Guerreiro("Bran", 100, 10, 5);
            elara = new Mago("Elara", 100, 10, 15);
            System.out.println("Heróis criados com sucesso: " + bran.getNome() + " e " + elara.getNome());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar personagem: " + e.getMessage());
        }

        try {
            Guerreiro invalido = new Guerreiro("Herói Quebrado", -50, 1, -5);
            herois.add(invalido);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar personagem: " + e.getMessage());
        }

        if (bran == null || elara == null) {
            System.out.println("Não foi possível iniciar a batalha: heróis principais não foram criados.");
            return;
        }

        herois.add(elara);
        herois.add(bran);

        Item espada1 = new Item("Espada de Aço", 3);
        bran.pegar(espada1);

        try {
            bran.usarItem("Espada de Aço");
        } catch (ItemNaoEncontradoException e) {
            System.out.println("Erro ao usar item: " + e.getMessage());
        }

        try {
            bran.usarItem("Poção Mágica");
        } catch (ItemNaoEncontradoException e) {
            System.out.println("Erro ao usar item: " + e.getMessage());
        }

        Chefe lich = new Chefe("Lich");

        for (Personagem p : herois) {
            try {
                p.ficha();

                if (p instanceof Mago mago) {
                    try {
                        System.out.println(mago.lancarFeitico());
                        p.atacar(lich, 10);
                    } catch (SemManaException e) {
                        System.out.println(e.getMessage());
                        System.out.println(mago.getNome() + " perde o turno! " + bran.getNome() + " ataca em seu lugar.");
                        bran.atacar(lich, 10);
                    }
                } else {
                    System.out.println(p.habilidade());
                    p.atacar(lich, 10);
                }
            } finally {
                System.out.println("--- Fim do turno de " + p.nome + " ---");
            }
        }

        System.out.printf("Vida do chefe: %d%n", lich.getVida());

        for (Personagem p : herois) {
            if (p instanceof Mago) {
                System.out.printf("%nMana do mago %s: %d%n", p.nome, ((Mago) p).getMana());
            }
        }
    }
}

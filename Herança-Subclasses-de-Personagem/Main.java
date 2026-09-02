/*
USO IA:

Modelos utilizados: Copilot e ChatGPT.

Nesse projeto foi utilizada IA para consulta da sintaxe da linguagem Java,
para pedir ajuda em problemas quando o VSCode indicava erro em alguma linha que eu escrevia
e para traduzir todo o programa e a lógica feita em Java para Python, já que eu optei por fazer apenas em Java e pedi para a IA traduzir para Python, então apenas revisei o código e interpretei
após isso, usei o chatGPT para tentar fazer o commit para o GitHub via Git Bash, mas acabou dando errado e fiz o commit diretamente na pasta raiz do repositório,
então eu apenas fiz a mudança de pastas pelo próprio GitHub Web.

O que você modificou ou validou manualmente: Tudo envolvendo a lógica eu produzi manualmente, o uso de IA foi apenas por sintaxe.
*/

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

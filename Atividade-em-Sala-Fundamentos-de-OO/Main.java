// Arquivo criado com uso de IA devido ao tempo para fechar a atividade e para ter mais precisão com os testes

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TESTE 1: CRIAÇÃO VÁLIDA COM CONSTRUTORES =====");

        // Criando o tutor usando o construtor vazio
        Tutor tutor1 = new Tutor();

        tutor1.setTutorNome("Matheus");
        tutor1.setCPF("12345678900");
        tutor1.setTelefone("64999999999");


        // Criando o animal usando o construtor com parâmetros
        Animal animal1 = new Animal(
            "Rex",
            "Cachorro",
            "Vira-lata",
            "Caramelo",
            tutor1
        );


        // Relacionando o tutor ao animal
        tutor1.setAnimal(animal1);


        System.out.println("\nDados do animal:");

        System.out.println("Nome: " + animal1.getAnimalNome());
        System.out.println("Espécie: " + animal1.getEspecie());
        System.out.println("Raça: " + animal1.getRaca());
        System.out.println("Cor: " + animal1.getCor());
        System.out.println("Tutor: " + animal1.getNomeTutor());


        System.out.println("\nDados do tutor:");

        System.out.println("Nome: " + tutor1.getTutorNome());
        System.out.println("CPF: " + tutor1.getCPF());
        System.out.println("Telefone: " + tutor1.getTelefone());
        System.out.println("Animal: " + tutor1.getNomeAnimal());


        // =============================================
        // TESTE DE VALIDAÇÕES
        // =============================================

        System.out.println("\n===== TESTE 2: VALORES INVÁLIDOS =====");


        // Tentativa de inserir nome vazio no animal
        System.out.println("\nTentando inserir nome vazio no animal:");
        animal1.setAnimalNome("");


        // Tentativa de inserir espécie vazia
        System.out.println("\nTentando inserir espécie vazia:");
        animal1.setEspecie("");


        // Tentativa de inserir nome vazio no tutor
        System.out.println("\nTentando inserir nome vazio no tutor:");
        tutor1.setTutorNome("");


        // Tentativa de inserir CPF vazio
        System.out.println("\nTentando inserir CPF vazio:");
        tutor1.setCPF("");


        // =============================================
        // SEGUNDA FORMA DE CRIAÇÃO
        // =============================================

        System.out.println("\n===== TESTE 3: SEGUNDA FORMA DE CRIAÇÃO =====");


        // Criando outro tutor com construtor vazio
        Tutor tutor2 = new Tutor();

        tutor2.setTutorNome("Maria");
        tutor2.setCPF("98765432100");
        tutor2.setTelefone("64988888888");


        // Criando outro animal com construtor vazio
        Animal animal2 = new Animal();

        animal2.setAnimalNome("Mia");
        animal2.setEspecie("Gato");
        animal2.setRaca("Siamês");
        animal2.setCor("Branca");

        // Relacionando os dois objetos
        animal2.setTutor(tutor2);
        tutor2.setAnimal(animal2);


        System.out.println("\nDados do segundo animal:");

        System.out.println("Nome: " + animal2.getAnimalNome());
        System.out.println("Espécie: " + animal2.getEspecie());
        System.out.println("Tutor: " + animal2.getNomeTutor());


        System.out.println("\nDados do segundo tutor:");

        System.out.println("Nome: " + tutor2.getTutorNome());
        System.out.println("Animal: " + tutor2.getNomeAnimal());


        System.out.println("\n===== FIM DOS TESTES =====");
    }
}

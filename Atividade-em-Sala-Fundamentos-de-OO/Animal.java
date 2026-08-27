/*
DOMÍNIO: PetShop

CLASSES E ATRIBUTOS:

1. Classe Animal
   - nome
   - especie
   - raça
   - cor
   - tutor

2. Classe Tutor
   - nome
   - CPF
   - animal
   - telefone

VALIDAÇÕES:
1. O nome e a espécie do animal não podem ser vazios.
2. O nome do tutor e o CPF não podem ser vazios.

USO DE IA PRETENDIDO:
- Interpretação da proposta do Moodle;
- Relembrar sintaxe básica de POO para Java;
*/

public class Animal{
    private String nome;
    private String especie;
    private String raca;
    private String cor;
    private Tutor tutor;

    public Animal() {

    }

    public Animal(String nome, String especie, String raca, String cor, Tutor tutor) {
        setAnimalNome(nome);
        setEspecie(especie);
        setRaca(raca);
        setCor(cor);
        this.tutor = tutor;

    }

     // Getters
    public String getAnimalNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaca() {
        return raca;
    }

    public String getCor() {
        return cor;
    }

    public String getNomeTutor() {
        return tutor.getTutorNome();
    }

    // Setters
    public void setAnimalNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("insira um nome para o animal");
        }
    }

    public void setEspecie(String especie) {
        if (especie != null && !especie.trim().isEmpty()) {
            this.especie = especie;
        } else {
            System.out.println("insira a especie do animal");
        }
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Sugestão da IA para melhorar o fluxo do código na hora de instanciar os objetos

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}

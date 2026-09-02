public class Tutor{
    private String nome;
    private String CPF;
    private String telefone;
    private Animal animal;

    public Tutor() {

    }

    public Tutor(String nome, String CPF, String telefone, Animal animal) {
        setTutorNome(nome);
        setCPF(CPF);
        setTelefone(telefone);  
        this.animal = animal;
    }

     // Getters
     public String getTutorNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNomeAnimal() {
        return animal.getAnimalNome();
    }

    // Setters
    public void setTutorNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("insira o nome do tutpr");
        }
    }

    public void setCPF(String CPF) {
        if (CPF != null && !CPF.trim().isEmpty()) {
            this.CPF = CPF;
        } else {
            System.out.println("insira o CPF do tutor");
        }
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Sugestão da IA para melhorar o fluxo do código na hora de instanciar os objetos
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}

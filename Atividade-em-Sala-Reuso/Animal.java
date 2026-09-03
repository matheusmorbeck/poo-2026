public abstract class Animal {
    private String nome;
    private String especie;
    private String raca;
    private String cor;
    private Tutor tutor;

    public Animal() {

    }

    public Animal(String nome, String especie, String raca, String cor) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
    }

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
    
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    //abstrato
    public abstract String emitirSom();

    //concreto
    public void descricao() {
        System.out.printf("%nNome: %s, Especie: %s, Raça: %s, Cor: %s", nome, especie, raca, cor);
    }    
}
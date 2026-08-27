class Personagem {

    private String nome;
    private int vida;
    private int nivel;
    
    public Personagem() {
        nome = "Sem nome";
        vida = 100;
        nivel = 1;
    }

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nome + " atacou causando 10 de dano!");
    }

    public void atacar(int dano) {
        System.out.println(nome + " atacou causando " + dano + " de dano!");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

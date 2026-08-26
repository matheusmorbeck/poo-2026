class PersonagemEncapsuladoAt {

    private String nome;
    private int vida;
    private int nivel;
    
    public PersonagemEncapsuladoAt() {
        nome = "Sem nome";
        vida = 100;
        nivel = 1;
    }

    public PersonagemEncapsuladoAt(String nome, int vida, int nivel) {
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
}
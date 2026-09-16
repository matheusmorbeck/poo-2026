class Guerreiro extends Personagem {
    protected int defesa = 5;

    public Guerreiro(String nome, int vida, int nivel, int defesa) {
        super(nome, vida, nivel);
        setdefesa(defesa);
    }

    // Getters
    public int getdefesa() {
        return (defesa);
    }

    // Setters
    public void setdefesa(int defesa) {
        if (defesa >= 0) {
            this.defesa = defesa;
        } else {
            throw new IllegalArgumentException(
                "Defesa inválida! Insira um valor maior ou igual a 0 (valor informado: " + defesa + ")"
            );
        }
    }

    @Override
    public int receberDano(int dano) {
        return super.receberDano(Math.max(0, dano - defesa));
    }

    @Override
    public void ficha() {
        super.ficha();
        System.out.printf("%nDefesa: %d%n", defesa);
    }

    @Override
    public String habilidade() {
        return nome + " usa Escudo de Aço";
    }
}

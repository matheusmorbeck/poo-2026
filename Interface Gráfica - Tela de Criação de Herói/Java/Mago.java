class Mago extends Personagem {
    protected int mana;
    private static final int CUSTO_FEITICO = 10;

    public Mago(String nome, int vida, int nivel, int mana) {
        super(nome, vida, nivel);
        setMana(mana);
    }

    // Getters
    public int getMana() {
        return (mana);
    }

    // Setters
    public void setMana(int mana) {
        if (mana >= 0) {
            this.mana = mana;
        } else {
            throw new IllegalArgumentException(
                "Mana inválida! Insira um valor maior ou igual a 0 (valor informado: " + mana + ")"
            );
        }
    }

    // Metodos
    
    @Override
    public void ficha() {
        super.ficha();
        System.out.printf("%nMana: %d%n", mana);
    }

    @Override
    public String habilidade() {
        return nome + " usa Rajada Arcana";
    }

    public String lancarFeitico() throws SemManaException {
        if (mana < CUSTO_FEITICO) {
            throw new SemManaException(mana);
        }
        mana -= CUSTO_FEITICO;
        return nome + " usa Rajada Arcana! (mana restante: " + mana + ")";
    }

}

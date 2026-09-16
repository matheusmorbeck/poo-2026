class Chefe extends Personagem {

    public Chefe(String nome) {
        super(nome, 200, 20);
    }

    @Override
    public void ficha() {
        System.out.printf("%n[CHEFE]:%n");
        super.ficha();

    }

    @Override
    public String habilidade() {
        return nome + " usa Ataque devastador";
    }

}

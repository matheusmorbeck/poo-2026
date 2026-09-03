public class Gato extends Animal {

    private String corOlhos;

    public Gato(String nome, String especie, String raca, String cor, String corOlhos) {
        super(nome, especie, raca, cor);
        this.corOlhos = corOlhos;
    }

    public String getcorOlhos() {
        return corOlhos;
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public void descricao() {
        super.descricao();
        System.out.printf(", Cor dos Olhos: %s - ", corOlhos);
    }
}
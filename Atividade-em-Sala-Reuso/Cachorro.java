public class Cachorro extends Animal {

    private String porte;

    public Cachorro(String nome, String especie, String raca, String cor, String porte) {
        super(nome, especie, raca, cor);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public String emitirSom() {
        return "Au";
    }

    @Override
    public void descricao() {
        super.descricao();
        System.out.printf(", Porte: %s - ", porte);
    }
}
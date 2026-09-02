import java.util.ArrayList;
import java.util.List;

public class Personagem {
    protected  String nome;
    protected  int vida;
    protected  int nivel;
    protected  List<Item> inventario;
    
    public Personagem() {
        nome = "";
        vida = 100;
        nivel = 1;
        inventario = new ArrayList<>();
    }

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.inventario = new ArrayList<>();
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

    // Metodos
    boolean estaVivo(){
        if(vida > 0){
            return(true);
        } else{
            return(false);
        }
    }

    public void atacar() {
        System.out.println(nome + " atacou causando 10 de dano!");
    }

    public void atacar(int dano) {
        System.out.println(nome + " atacou causando " + dano + " de dano!");
    }

    public void ficha(){
        System.out.printf("Nome: %s", nome);
        System.out.printf("%nVida: %d", vida);
        System.out.printf("%nNível: %d%n", nivel);

        System.out.printf("%nInventário: ");
        if (inventario.isEmpty()){
            System.err.printf("%nVazio");
        } else {
            for (Item item : inventario){
                item.descricao();
            }
        }
    }

    public int receberDano(int dano){
        return(vida = vida - dano);
    }

    public void pegar(Item item){
        inventario.add(item);
    }
}
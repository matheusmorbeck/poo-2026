public class Personagem{
    String nome;
    int vida;
    int forca;

    int receberDano(int forca){
        return(vida = vida - forca);
    }
    boolean estaVivo(){
        if(vida > 0){
            return(true);
        } else{
            return(false);
        }
    }
    void ficha(){
        System.out.println(nome);
        System.out.println(vida);
        System.out.println(forca);
    }
    void atacar(Personagem alvo){
        alvo.receberDano(forca);
    }
}
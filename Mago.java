class Mago extends Personagem{
    protected  int mana;

    public Mago(String nome, int vida, int nivel, int mana){
        super(nome, vida, nivel);
        this.mana = mana;
    }

    //Getters
    public int getMana(){
        return(mana);
    }

    //Setters
    public void setMana(int mana){
        if (mana >= 0){
            this.mana = mana;
        } else{
            System.out.printf("%nInsira um valor válido para mana%n");
        }
    }
    
    @Override
    public void ficha(){
        super.ficha();
        System.out.printf("%nMana: %d%n", mana);
    }
    
}
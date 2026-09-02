public class Item{
    private String nome;
    private int bonus;

    public Item(String nome, int bonus){
        this.nome = nome;
        if(bonus >=0){
            this.bonus = bonus;
        }
    }

    //Getters
    public String getNomeItem() {
        return nome;
    }

    public int getBonusItem() {
        return bonus;
    }


    //Setters
    public void setNomeItem(String nome){
        this.nome = nome;
    }

    public void setBonusItem(int bonus){
        if(bonus >= 0){
            this.bonus = bonus;
        } else{
            System.out.printf("%nInsira um valor válido para o bônus%n");
        }
    }
    
    //Metodos
    public void descricao(){
        System.out.printf("%s (+%d)%n", nome, bonus);
    }

}
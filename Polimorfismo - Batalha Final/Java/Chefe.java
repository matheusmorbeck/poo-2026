class Chefe extends Personagem{

    public Chefe(String nome){
        super(nome, 200, 20);
    }
    
    @Override
    public void ficha(){
        System.out.println("%n[CHEFE]:%n");
        super.ficha();
        
    }
    
    @Override
    public String habilidade(){
        return nome + "usa Ataque devastador";
    }
    
}

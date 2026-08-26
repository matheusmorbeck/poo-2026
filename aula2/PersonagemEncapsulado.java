class PersonagemEncapsulado {

    private String nome;
    private int vida;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        } else {
            System.out.println("inválido");
        }
    }

    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        } else {
            System.out.println("inválido");
        }
    }

    public void setNivel(int nivel) {
        if (nivel >= 1) {
            this.nivel = nivel;
        } else {
            System.out.println("inválido");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        PersonagemEncapsulado p = new PersonagemEncapsulado();

        p.setNome("Mario");
        p.setVida(100);
        p.setNivel(5);

        System.out.println(p.getNome());
        System.out.println(p.getVida());
        System.out.println(p.getNivel());
        
        p.setNome("");
        p.setVida(-50);
        p.setNivel(0);
    }
}
import java.util.ArrayList;

/*
Dominio: PetShop

Super:
- Animal
  nome
  especie
  raça
  cor
  tutor

Sub:
- Cachorro
  atributo próprio: porte 

- Gato
  atributo próprio: corOlhos

Abstrato: emitirSom()
Reuso: descricao()

A saída mostra o mesmo comando do laço produzindo resultados diferentes para cada tipo de animal    
*/

public static void main(String[] args) {
    ArrayList<Animal> animais = new ArrayList<>();

    animais.add(new Cachorro("Ronaldo", "cachorro", "salsicha", "merle", "pequeno"));
    animais.add(new Gato("Cotoco", "gato", "vira-lata", "branca e preta", "marrom"));
    animais.add(new Cachorro("Cacau","cachorro", "salsicha", "marrom", "pequeno"));
    animais.add(new Gato("Samantho", "gato", "vira-lata", "branca e preta", "marrom"));

    for (Animal a : animais) {
        a.descricao();
        System.out.printf("Som: " + a.emitirSom());
    }
}
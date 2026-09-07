from Personagem import Personagem
from Mago import Mago
from Guerreiro import Guerreiro
from Item import Item
from Chefe import Chefe


class Main:

    def main():
        herois = []

        bran = Guerreiro("Bran", 100, 10, 5)
        elara = Mago("Elara", 100, 10, 200)

        herois.append(elara)
        herois.append(bran)

        espada1 = Item("Espada de Aço", 3)
        bran.pegar(espada1)

        lich = Chefe("Lich")

        for p in herois:
            p.ficha()
            p.habilidade()
            p.atacar(lich, 10)

        print("Vida do chefe: " + str(lich.getVida()))

        # esse uso é permitido pois acessa atributos de apenas dos objetos de uma das subclasses da lista, já no caso da batalha não seria possivel
        # pois usa atributos e metodos envolvendo as duas subclasses
        for p in herois:
            if isinstance(p, Mago):
                print("\nMana do mago " + p.nome + ": " + str(p.getMana()))
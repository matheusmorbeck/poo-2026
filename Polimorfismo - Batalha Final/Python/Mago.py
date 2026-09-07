from Personagem import Personagem

class Mago(Personagem):
    mana = 0

    def __init__(self, nome, vida, nivel, mana):
        super().__init__(nome, vida, nivel)
        self.mana = mana

    # Getter
    def getMana(self):
        return self.mana

    # Setter
    def setMana(self, mana):
        if mana >= 0:
            self.mana = mana
        else:
            print("\nInsira um valor válido para mana")

    # Override
    def ficha(self):
        super().ficha()
        print(f"\nMana: {self.mana}")

    def habilidade(self):
        return self.nome + "usa Rajada Arcana"
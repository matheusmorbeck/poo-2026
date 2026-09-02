from Personagem import Personagem


class Guerreiro(Personagem):

    def __init__(self, nome, vida, nivel, defesa):
        super().__init__(nome, vida, nivel)
        self.defesa = defesa

    # Getter
    def getdefesa(self):
        return self.defesa

    # Setter
    def setdefesa(self, defesa):
        if defesa >= 0:
            self.defesa = defesa
        else:
            print("\nInsira um valor válido para a defesa")

    # Override
    def receberDano(self, dano):
        return super().receberDano(max(0, dano - self.defesa))

    # Override
    def ficha(self):
        super().ficha()
        print(f"\nDefesa: {self.defesa}")

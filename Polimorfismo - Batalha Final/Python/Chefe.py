from Personagem import Personagem

class Chefe(Personagem):

    def __init__(self, nome):
        super().__init__(nome, 200, 20)

    def ficha(self):
        print("\n[CHEFE]:\n")
        super().ficha()

    def habilidade(self):
        return self.nome + "usa Ataque devastador"
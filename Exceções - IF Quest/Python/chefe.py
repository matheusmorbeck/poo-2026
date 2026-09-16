from personagem import Personagem


class Chefe(Personagem):
    def __init__(self, nome):
        super().__init__(nome, 200, 20)

    def ficha(self):
        print("\n[CHEFE]:")
        super().ficha()

    def habilidade(self):
        return f"{self.nome} usa Ataque devastador"

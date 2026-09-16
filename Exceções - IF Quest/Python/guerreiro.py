from personagem import Personagem


class Guerreiro(Personagem):
    def __init__(self, nome, vida, nivel, defesa):
        super().__init__(nome, vida, nivel)
        self.defesa = 5
        self.setdefesa(defesa)

    # Getters
    def getdefesa(self):
        return self.defesa

    # Setters
    def setdefesa(self, defesa):
        if defesa >= 0:
            self.defesa = defesa
        else:
            raise ValueError(
                f"Defesa inválida! Insira um valor maior ou igual a 0 (valor informado: {defesa})"
            )

    def receberDano(self, dano):
        return super().receberDano(max(0, dano - self.defesa))

    def ficha(self):
        super().ficha()
        print(f"\nDefesa: {self.defesa}")

    def habilidade(self):
        return f"{self.nome} usa Escudo de Aço"

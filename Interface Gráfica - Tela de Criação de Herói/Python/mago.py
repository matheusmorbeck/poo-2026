from personagem import Personagem
from sem_mana_exception import SemManaException


class Mago(Personagem):
    CUSTO_FEITICO = 10

    def __init__(self, nome, vida, nivel, mana):
        super().__init__(nome, vida, nivel)
        self.setMana(mana)

    # Getters
    def getMana(self):
        return self.mana

    # Setters
    def setMana(self, mana):
        if mana >= 0:
            self.mana = mana
        else:
            raise ValueError(
                f"Mana inválida! Insira um valor maior ou igual a 0 (valor informado: {mana})"
            )

    # Metodos
    def ficha(self):
        super().ficha()
        print(f"\nMana: {self.mana}")

    def habilidade(self):
        return f"{self.nome} usa Rajada Arcana"

    def lancarFeitico(self):
        if self.mana < self.CUSTO_FEITICO:
            raise SemManaException(self.mana)
        self.mana -= self.CUSTO_FEITICO
        return f"{self.nome} usa Rajada Arcana! (mana restante: {self.mana})"

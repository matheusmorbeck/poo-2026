class Item:
    def __init__(self, nome, bonus):
        self.nome = nome

        if bonus >= 0:
            self.bonus = bonus
        else:
            self.bonus = 0

    # Getters
    def getNomeItem(self):
        return self.nome

    def getBonusItem(self):
        return self.bonus

    # Setters
    def setNomeItem(self, nome):
        self.nome = nome

    def setBonusItem(self, bonus):
        if bonus >= 0:
            self.bonus = bonus
        else:
            print("\nInsira um valor válido para o bônus")

    # Métodos
    def descricao(self):
        print(f"{self.nome} (+{self.bonus})")

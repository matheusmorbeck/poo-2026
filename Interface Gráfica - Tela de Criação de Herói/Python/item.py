class Item:
    def __init__(self, nome, bonus):
        self.__nome = nome
        self.setBonusItem(bonus)

    # Getters
    def getNomeItem(self):
        return self.__nome

    def getBonusItem(self):
        return self.__bonus

    # Setters
    def setNomeItem(self, nome):
        self.__nome = nome

    def setBonusItem(self, bonus):
        if bonus >= 0:
            self.__bonus = bonus
        else:
            raise ValueError(
                f"Bônus inválido! Insira um valor maior ou igual a 0 (valor informado: {bonus})"
            )

    # Metodos
    def descricao(self):
        print(f"{self.__nome} (+{self.__bonus})")

class Personagem:
    def __init__(self, nome="", vida=100, nivel=1):
        self.nome = nome
        self.vida = vida
        self.nivel = nivel
        self.inventario = []

    # Getters
    def getNome(self):
        return self.nome

    def getVida(self):
        return self.vida

    def getNivel(self):
        return self.nivel

    # Setters
    def setNome(self, nome):
        self.nome = nome

    def setVida(self, vida):
        self.vida = vida

    def setNivel(self, nivel):
        self.nivel = nivel

    # Métodos
    def estaVivo(self):
        if self.vida > 0:
            return True
        else:
            return False

    def atacar(self, dano=10):
        print(f"{self.nome} atacou causando {dano} de dano!")

    def ficha(self):
        print(f"Nome: {self.nome}")
        print(f"Vida: {self.vida}")
        print(f"Nível: {self.nivel}")

        print("\nInventário: ")

        if len(self.inventario) == 0:
            print("Vazio")
        else:
            for item in self.inventario:
                item.descricao()

    def receberDano(self, dano):
        self.vida = self.vida - dano
        return self.vida

    def pegar(self, item):
        self.inventario.append(item)
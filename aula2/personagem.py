class Personagem:
    def __init__(self, nome, vida, forca):
        self.nome = nome
        self.vida = vida
        self.forca = forca

    def receberDano(self, forca):
        self.vida = self.vida - forca

    def estaVivo(self):
        if self.vida > 0 :
            return 1
        else:
            return 0
        
    def ficha(self):
        print(self.nome)
        print(self.vida)
        print(self.forca)

    def atacar(self, alvo):
        alvo.receberDano(self.forca)
from abc import ABC, abstractmethod
from item_nao_encontrado_exception import ItemNaoEncontradoException


class Personagem(ABC):
    def __init__(self, nome="", vida=100, nivel=1):
        self.nome = nome
        self.setVida(vida)
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
        if vida < 0:
            raise ValueError(
                f"Vida inválida! Insira um valor maior ou igual a 0 (valor informado: {vida})"
            )
        self.vida = vida

    def setNivel(self, nivel):
        self.nivel = nivel

    # Metodos
    def estaVivo(self):
        if self.vida > 0:
            return True
        else:
            return False

    def atacar(self, alvo, dano):
        alvo.receberDano(dano)
        print(f"{self.nome} atacou {alvo.nome} causando {dano} de dano!")

    def ficha(self):
        print(f"Nome: {self.nome}", end="")
        print(f"\nVida: {self.vida}", end="")
        print(f"\nNível: {self.nivel}")

        print("\nInventário: ", end="")
        if not self.inventario:
            print("\nInventário vazio")
        else:
            for item in self.inventario:
                item.descricao()

    def receberDano(self, dano):
        self.vida = self.vida - dano
        return self.vida

    def pegar(self, item):
        self.inventario.append(item)

    def buscarItem(self, nomeItemBuscado):
        for item in self.inventario:
            if item.getNomeItem().lower() == nomeItemBuscado.lower():
                return item
        raise ItemNaoEncontradoException(nomeItemBuscado)

    def usarItem(self, nomeItemBuscado):
        item = self.buscarItem(nomeItemBuscado)
        print(
            f"{self.nome} usa {item.getNomeItem()} e recebe +{item.getBonusItem()} de bônus!"
        )

    @abstractmethod
    def habilidade(self):
        pass

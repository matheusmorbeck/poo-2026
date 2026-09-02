from Mago import Mago
from Guerreiro import Guerreiro
from Item import Item


elara = Mago("Elara", 100, 10, 200)
espada1 = Item("Espada de Aço", 3)
elara.pegar(espada1)
elara.ficha()


bran = Guerreiro("Bran", 100, 10, 5)
bran.receberDano(8)
bran.ficha()

elara.setMana(-10)

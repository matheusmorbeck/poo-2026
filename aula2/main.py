from personagem import Personagem

prota = Personagem("prota", 100, 20)
boss = Personagem("boss", 80, 10)

prota.ficha()
boss.ficha()

while boss.estaVivo() and prota.estaVivo():

    prota.atacar(boss)

    print(f"\nVida boss: {boss.vida}")

    if boss.estaVivo():

        boss.atacar(prota)

        print(f"\nVida protagonista: {prota.vida}")

prota.ficha()
boss.ficha()

if boss.estaVivo():
    print("\nboss vence")
else:
    print("\nprotagonista vence")
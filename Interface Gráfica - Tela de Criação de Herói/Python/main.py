from guerreiro import Guerreiro
from mago import Mago
from item import Item
from chefe import Chefe
from item_nao_encontrado_exception import ItemNaoEncontradoException
from sem_mana_exception import SemManaException


def main():
    herois = []

    bran = None
    elara = None

    try:
        bran = Guerreiro("Bran", 100, 10, 5)
        elara = Mago("Elara", 100, 10, 15)
        print(f"Heróis criados com sucesso: {bran.getNome()} e {elara.getNome()}")
    except ValueError as e:
        print(f"Erro ao criar personagem: {e}")

    try:
        invalido = Guerreiro("Herói Quebrado", -50, 1, -5)
        herois.append(invalido)
    except ValueError as e:
        print(f"Erro ao criar personagem: {e}")

    if bran is None or elara is None:
        print("Não foi possível iniciar a batalha: heróis principais não foram criados.")
        return

    herois.append(elara)
    herois.append(bran)

    espada1 = Item("Espada de Aço", 3)
    bran.pegar(espada1)

    try:
        bran.usarItem("Espada de Aço")
    except ItemNaoEncontradoException as e:
        print(f"Erro ao usar item: {e}")

    try:
        bran.usarItem("Poção Mágica")
    except ItemNaoEncontradoException as e:
        print(f"Erro ao usar item: {e}")

    lich = Chefe("Lich")

    for p in herois:
        try:
            p.ficha()

            if isinstance(p, Mago):
                try:
                    print(p.lancarFeitico())
                    p.atacar(lich, 10)
                except SemManaException as e:
                    print(e)
                    print(
                        f"{p.getNome()} perde o turno! {bran.getNome()} ataca em seu lugar."
                    )
                    bran.atacar(lich, 10)
            else:
                print(p.habilidade())
                p.atacar(lich, 10)
        finally:
            print(f"--- Fim do turno de {p.nome} ---")

    print(f"Vida do chefe: {lich.getVida()}")

    for p in herois:
        if isinstance(p, Mago):
            print(f"\nMana do mago {p.nome}: {p.getMana()}")


if __name__ == "__main__":
    main()

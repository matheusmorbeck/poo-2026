class SemManaException(Exception):
    def __init__(self, mana):
        super().__init__(f"Mana insuficiente! Mana atual: {mana}")

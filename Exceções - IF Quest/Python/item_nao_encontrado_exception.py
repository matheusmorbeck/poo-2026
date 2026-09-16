class ItemNaoEncontradoException(Exception):
    def __init__(self, nomeItem):
        super().__init__(f'Item "{nomeItem}" não encontrado no inventário!')

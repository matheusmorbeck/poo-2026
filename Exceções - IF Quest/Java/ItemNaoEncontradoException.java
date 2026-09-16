public class ItemNaoEncontradoException extends Exception {

    public ItemNaoEncontradoException(String nomeItem) {
        super(String.format("Item \"%s\" não encontrado no inventário!", nomeItem));
    }
}

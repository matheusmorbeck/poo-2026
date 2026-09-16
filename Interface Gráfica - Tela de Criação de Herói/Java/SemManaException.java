public class SemManaException extends Exception {

    private static final int MANA_NECESSARIA = 10;

    public SemManaException(int manaAtual) {
        super(String.format(
            "Mana insuficiente para lançar o feitiço! Mana atual: %d, mana necessária: %d",
            manaAtual, MANA_NECESSARIA
        ));
    }
}

import java.awt.*;
import javax.swing.*;

public class TelaCriacaoHeroi extends JFrame {

    private JLabel titulo;
    private JTextField campoNome;
    private JTextField campoVida;
    private JTextField campoClasse;
    private JButton botaoCriar;

    public TelaCriacaoHeroi() {
        super("IF Quest");

        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        titulo = new JLabel("Criação de Herói", SwingConstants.CENTER);

        JLabel rotuloNome = new JLabel("Nome:");
        JLabel rotuloVida = new JLabel("Vida inicial:");
        JLabel rotuloClasse = new JLabel("Classe:");

        campoNome = new JTextField();
        campoVida = new JTextField();
        campoClasse = new JTextField();

        JPanel painelFormulario = new JPanel(
                new GridLayout(3, 2, 5, 5)
        );

        painelFormulario.setBorder(
                BorderFactory.createEmptyBorder(10, 20, 10, 20)
        );

        painelFormulario.add(rotuloNome);
        painelFormulario.add(campoNome);

        painelFormulario.add(rotuloVida);
        painelFormulario.add(campoVida);

        painelFormulario.add(rotuloClasse);
        painelFormulario.add(campoClasse);

        botaoCriar = new JButton("Criar Herói");

        botaoCriar.setEnabled(false);

        setLayout(new BorderLayout(5, 5));

        add(titulo, BorderLayout.NORTH);
        add(painelFormulario, BorderLayout.CENTER);
        add(botaoCriar, BorderLayout.SOUTH);

        titulo.setText("Criação de Herói - IF Quest");

        System.out.println("Nome inicial: " + campoNome.getText());
        System.out.println("Vida inicial: " + campoVida.getText());
        System.out.println("Classe inicial: " + campoClasse.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaCriacaoHeroi tela = new TelaCriacaoHeroi();
            tela.setVisible(true);
        });
    }
}
package src;

import javax.swing.*;

public class PanelCadastro extends JFrame {
    JPanel panel = new JPanel();
    Biblioteca biblioteca;

    PanelCadastro() {
        super("Cadastro do livro");

        // Cadastro
        LabelAndText cadastramento = new LabelAndText(panel);
        ButtonCadastro botao = new ButtonCadastro(panel,cadastramento);

        // Biblioteca
        biblioteca = new Biblioteca(panel, new ButtonBiblioteca(botao,cadastramento));

        pack();
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

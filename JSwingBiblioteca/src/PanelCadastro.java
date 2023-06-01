package src;

import javax.swing.*;

public class PanelCadastro extends JFrame {
    JPanel panel = new JPanel();
    Biblioteca biblioteca;

    PanelCadastro() {
        super("Cadastro do livro");

        // Cadastro
        LabelAndText labelAndText = new LabelAndText(this.panel);
        ButtonCadastro cadastro = new ButtonCadastro(this.panel,labelAndText);

        // Biblioteca
        biblioteca = new Biblioteca(this.panel, new ButtonBiblioteca(cadastro,labelAndText));

        pack();
        setContentPane(this.panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

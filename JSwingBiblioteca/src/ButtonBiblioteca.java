package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBiblioteca implements ActionListener {

    JButton button; public JButton getButton() {
        return button;
    }
    ButtonCadastro biblioteca;
    LabelAndText tFieldTitulo;

    // Button
    ButtonBiblioteca(ButtonCadastro biblioteca, LabelAndText tFieldTitulo) {
        this.biblioteca = biblioteca;
        this.tFieldTitulo = tFieldTitulo;

        button = new JButton("Search");
        button.addActionListener(this);
    }

    // Action
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            JOptionPane.showMessageDialog(null,this.biblioteca.getBiblioteca().get(tFieldTitulo.getTextFieldTitulo().getText()));
        }
    }
}

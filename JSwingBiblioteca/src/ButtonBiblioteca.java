package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBiblioteca implements ActionListener {

    JButton button;
    LabelAndText labelAndText;
    ButtonCadastro buttonCadastro;


    ButtonBiblioteca(ButtonCadastro buttonCadastro,LabelAndText text) {
        this.buttonCadastro = buttonCadastro;
        this.labelAndText = text;

        button = new JButton("Search");
        button.addActionListener(this);
    }

    public JButton getButton() {
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            JOptionPane.showMessageDialog(null,this.buttonCadastro.getBiblioteca().get(labelAndText.getTextFieldTitulo().getText()));
        }
    }
}

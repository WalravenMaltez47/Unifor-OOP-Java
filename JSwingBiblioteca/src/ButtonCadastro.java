package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ButtonCadastro implements ActionListener {
    JButton addLivro, retiraLivro;
    LabelAndText textoDoCadastro;


    HashMap<String,String> biblioteca = new HashMap<>();
    public HashMap<String, String> getBiblioteca() {
        return biblioteca;
    }

    // Botao
    ButtonCadastro(JPanel panel, LabelAndText textoDoCadastro) {
        this.textoDoCadastro = textoDoCadastro;

        addLivro = new JButton("add");
        panel.add(addLivro);
        addLivro.addActionListener(this);

        retiraLivro = new JButton("retirar");
        panel.add(retiraLivro);
        retiraLivro.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        // add
        if (e.getSource()==addLivro) {
            biblioteca.put(this.textoDoCadastro.getTextFieldTitulo().getText(), this.textoDoCadastro.getTextFieldAutor().getText());
            JOptionPane.showMessageDialog(null, "Book added successfully!");
        }

        // retira
        else if (e.getSource()==retiraLivro) {
            biblioteca.remove(this.textoDoCadastro.getTextFieldTitulo().getText(), this.textoDoCadastro.getTextFieldAutor().getText());
            JOptionPane.showMessageDialog(null, "Book removed successfully!");
        }
    }
}

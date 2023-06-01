package src;

import javax.swing.*;

public class LabelAndText {
    JLabel titulo, autor;
    JTextField textFieldAutor, textFieldTitulo;

    LabelAndText(JPanel panel) {
        titulo = new JLabel("Titulo"); panel.add(getTitulo());
        textFieldTitulo = new JTextField(5); panel.add(getTextFieldTitulo());
        autor = new JLabel("autor"); panel.add(getAutor());
        textFieldAutor = new JTextField(5); panel.add(getTextFieldAutor());
    }
    public JLabel getTitulo() {return titulo;}
    public JTextField getTextFieldTitulo() {
        return textFieldTitulo;
    }
    public JLabel getAutor() {return autor;}
    public JTextField getTextFieldAutor() {
        return textFieldAutor;
    }
}

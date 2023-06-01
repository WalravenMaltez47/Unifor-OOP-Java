package src;

import javax.swing.*;

public class Biblioteca {

    Biblioteca(JPanel panel, ButtonBiblioteca biblioteca) {
        panel.add(biblioteca.getButton());
    }
}

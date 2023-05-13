import javax.swing.*;

public class MainJFrame {

    public MainJFrame() {
        // Estrutura
        JFrame frame = new JFrame();
        frame.setTitle("Java");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel
        Panel panel = new Panel();
        frame.setContentPane(panel.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}

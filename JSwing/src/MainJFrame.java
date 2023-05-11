import javax.swing.*;

public class MainJFrame {

    public MainJFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Java");
        frame.setSize(400,200);
        // jFrame.setResizable(false); // impede de seu comprimento e largura ser modificado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        frame.setContentPane(panel.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}

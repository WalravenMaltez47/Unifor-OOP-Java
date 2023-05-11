import javax.swing.*;

public class MainJFrame {

    private JFrame frame = new JFrame();
    private Panel panel = new Panel();;

    MainJFrame() {
        frame.setTitle("Java");
        frame.setSize(400,200);
        // jFrame.setResizable(false); // impede de seu comprimento e largura ser modificado
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(panel.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}

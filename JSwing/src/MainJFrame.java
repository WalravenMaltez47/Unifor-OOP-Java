import javax.swing.*;

public class MainJFrame {
    private JFrame jFrame = new JFrame();
    private Panel panel = new Panel();;

    MainJFrame() {
        jFrame.setTitle("Java");
        jFrame.setSize(400,200);
        // jFrame.setResizable(false); // impede de seu comprimento e largura ser modificado
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setContentPane(panel.getjPanel());
        jFrame.pack();
        jFrame.setVisible(true);
    }
}

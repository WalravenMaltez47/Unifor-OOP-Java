import javax.swing.*;
import java.awt.*;

public class MainJFrame extends JFrame {
    JPanel panel;

    public MainJFrame() {
        super("Java");

        // Painel
        panel = new JPanel(new FlowLayout());
        add(panel);

        // Name
        LabelAndText name = new LabelAndText("NAME:",5);
        name.addToPanel(panel);

        // Password
        LabelAndText password = new LabelAndText("PASSWORD:",5);
        password.addToPanel(panel);

        // Button
        Buttons button = new Buttons("GO");
        button.addToPanel(panel);

        // Message
        button.message(name.getTextField(),password.getTextField()/*,this*/);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

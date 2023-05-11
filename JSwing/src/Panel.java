import javax.swing.*;

public class Panel {

    private Buttons buttons = new Buttons();
    private Label label = new Label();
    private JPanel panel = new JPanel();

    protected JPanel getPanel() {
        // Name
        panel.add(label.getjLabelName());
        panel.add(label.getjTextFieldName());
        panel.add(buttons.getName());

        // Password
        panel.add(label.getjLabelPassword());
        panel.add(label.getjTextFieldPassword());
        panel.add(buttons.getPassword());

        return panel;
    }
}

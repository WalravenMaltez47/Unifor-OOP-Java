import javax.swing.*;

public class Panel {

    private final JPanel panel = new JPanel();
    private final Buttons buttons = new Buttons();
    private final Label label = new Label();

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

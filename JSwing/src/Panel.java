import javax.swing.*;

public class Panel {
    private Buttons buttons = new Buttons();
    private Label label = new Label();
    private JPanel jPanel = new JPanel();

    protected JPanel getjPanel() {
        jPanel.add(label.getjLabelName());
        jPanel.add(label.getjTextFieldName());
        jPanel.add(buttons.getjButton1());

        jPanel.add(label.getjLabelPassword());
        jPanel.add(label.getjTextFieldPassword());
        jPanel.add(buttons.getjButton2());
        return jPanel;
    }
}

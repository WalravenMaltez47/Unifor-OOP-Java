import javax.swing.*;

public class LabelAndText  implements  InterfacePanel{

   private final JLabel label;
   private final JTextField textField;

   LabelAndText(String labelText, int textFieldSize) {
      label = new JLabel(labelText,SwingConstants.LEFT);
      textField = new JTextField(textFieldSize);
   }

   public JTextField getTextField() {
      return textField;
   }

   @Override
   public void addToPanel(JPanel panel) {
      panel.add(label);
      panel.add(textField);
   }
}

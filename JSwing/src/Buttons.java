import javax.swing.*;
import java.awt.*;

public class Buttons implements InterfacePanel {

   private final JButton button ;

   Buttons(String buttonText) {
       button = new JButton(buttonText);
   }

   public void message(JTextField textName, JTextField textPassword /*, JFrame frame*/) {
       button.addActionListener(e -> {
           // muda o que tem no textName para textPassword
           textPassword.setText(textName.getText());
           JOptionPane.showMessageDialog(null,textPassword.getText());
           // frame.dispose(); // para encerrar o programa
       });
   }

   @Override
   public void addToPanel(JPanel panel) {
       button.setSize(5,5);
       panel.add(button,BorderLayout.SOUTH);
   }
}

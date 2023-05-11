import javax.swing.*;

public class Label {

   private JLabel jLabelName = new JLabel("NAME:");
   private JTextField jTextFieldName = new JTextField(5);
   private JLabel jLabelPassword = new JLabel("PASSWORD:");
   private JTextField jTextFieldPassword = new JTextField(5);

   // Setters
   public void setjLabelName(JLabel jLabelName) {
      this.jLabelName = jLabelName;
   } public void setjTextFieldName(JTextField jTextFieldName) {
      this.jTextFieldName = jTextFieldName;
   } public void setjLabelPassword(JLabel jLabelPassword) {
      this.jLabelPassword = jLabelPassword;
   } public void setjTextFieldPassword(JTextField jTextFieldPassword) {
      this.jTextFieldPassword = jTextFieldPassword;
   }

   // Getters
   public JLabel getjLabelName() {
      return jLabelName;
   } public JTextField getjTextFieldName() {
      return jTextFieldName;
   } public JLabel getjLabelPassword() {
      return jLabelPassword;
   } public JTextField getjTextFieldPassword() {
      return jTextFieldPassword;
   }
}

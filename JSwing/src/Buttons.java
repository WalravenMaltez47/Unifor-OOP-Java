import javax.swing.*;

public class Buttons {

   private JButton name = new JButton("confirm");
   private JButton password = new JButton("confirm");

   // Setters
   protected void setName(JButton name) {
       this.name = name;
   } protected void setPassword(JButton password) {
       this.password = password;
   }

   // Getters
   protected JButton getName() {
       return name;
   } protected JButton getPassword() {
       return password;
   }
}

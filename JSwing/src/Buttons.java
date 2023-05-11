import javax.swing.*;

public class Buttons {
   private JButton jButton1 = new JButton("confirm");
   private JButton jButton2 = new JButton("confirm");

   // Setters
   protected void setjButton1(JButton jButton1) {
       this.jButton1 = jButton1;
   } protected void setjButton2(JButton jButton2) {
       this.jButton2 = jButton2;
   }

   // Getters
   protected JButton getjButton1() {
       return jButton1;
   } protected JButton getjButton2() {
       return jButton2;
   }
}

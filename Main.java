import javax.swing.*;

class Main {
  public static void Main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Counter();
       }
     } );
  }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {


  Jlabel leftLabel;
  Jlabel rightLabel;
  int leftCount;
  int rightCount;


Counter () {
  Jframe frame = new Jframe("Let's Count");
  fram.setLayout(new FlowLayout());
  frame.setSize(200,110);

  JButton left = new JButton("Left");
    JButton right = new JButton ("Right");

    int leftCount = 0;
    int rightCount = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);
    
     leftLabel = new JLabel("Count" + leftCount);
    rightLabel = new JLabel("Count" + rightCount);
    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);
    frame.setVisible(true);

    public void actionPerformed(ActionEvent ae) {
    if (ae.getActionCommand().equals("Left")){
      leftCount++;
      leftLabel.setText("Count: " + leftCount);
    }
    if(ae.getActionCommand().equals("Right")) {
      rightCount++;
      rightLabel.setText("Count: " + rightCount);
    }
    if(ae.getActionCommand().equals("Reset")) {
      rightCount = 0;
      leftCount = 0;
      leftLabel.setText("Count: " + leftCount);
      rightLabel.setText("Count: " + rightCount);

      }
    }
  }
}
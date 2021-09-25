import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
  Calculator calc = new Calculator();

  JTextField t1 = new JTextField(10);
  JTextField t2 = new JTextField(10);
  JTextField t3 = new JTextField(10);
  JButton b19 = new JButton("=");
  JButton b20 = new JButton("C");

  GUI(){
    BorderLayout border= new BorderLayout();
    JFrame f = new JFrame ("Calculator");

    JTextArea inst = new JTextArea("Input your first number in the first field. (Use your keyboard) " +
    "If the operation needs only one number, enter a random number. " +
    "Input your second number in the second field. " +
    "Enter the symbol of the desired operation in the last field," +
    " then press = to get a result, or C if you would like to start over.", 6, 30);

    inst.setLineWrap(true);

    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    p1.add(inst, BorderLayout.NORTH);
    p1.add(t1, BorderLayout.WEST);
    p1.add(t2, BorderLayout.CENTER);
    p1.add(t3, BorderLayout.EAST);

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("0");
    JButton b11 = new JButton("+");
    JButton b12 = new JButton("-");
    JButton b13 = new JButton("*");
    JButton b14 = new JButton("/");
    JButton b15 = new JButton("POW");
    JButton b16 = new JButton("sqrt");
    JButton b17 = new JButton("ln");
    JButton b18 = new JButton("!");

    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(4, 5));

    f.add(p1, BorderLayout.NORTH);
    f.add(p2, BorderLayout.CENTER);

    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    p2.add(b7);
    p2.add(b8);
    p2.add(b9);
    p2.add(b10);
    p2.add(b11);
    p2.add(b12);
    p2.add(b13);
    p2.add(b14);
    p2.add(b15);
    p2.add(b16);
    p2.add(b17);
    p2.add(b18);
    p2.add(b19);
    p2.add(b20);

    b19.addActionListener(this);
    b19.setActionCommand("=");
    b20.addActionListener(this);
    b20.setActionCommand("C");

    f.pack();
    f.setTitle("Calculator");
    f.setVisible(true);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e){

    String run = e.getActionCommand();
    calc.first = Double.parseDouble(t1.getText()); // the first number to be added
    calc.second = Double.parseDouble(t2.getText()); //
    calc.oP = t3.getText();

    if (run.equals("=")){
      if (calc.oP.equals("+")){
        calc.result = calc.add();
        }
      if (calc.oP.equals("-")){
        calc.subtract();
      }
      if (calc.oP.equals("*")){
        calc.multiply();
      }
      if (calc.oP.equals("/")){
        calc.divide();
      }
      if (calc.oP.equals("POW")){
        calc.pow();
      }
      if (calc.oP.equals("sqrt")){
        calc.rootSquare();
      }
      if (calc.oP.equals("ln")){
        calc.nepLog();
      }
      if (calc.oP.equals("!")){
        calc.factorial();
      }

    t1.setText(Double.toString(calc.result));
    t2.setText("");
    t3.setText("");
    System.out.println(calc.result);
    }

    if (run.equals("C")){
      calc.clear();
      dispose();
      new GUI();
    }
  }

  public static void main(String[] args){
    new GUI();
  }
}

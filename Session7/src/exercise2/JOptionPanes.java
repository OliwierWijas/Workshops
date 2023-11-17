package exercise2;

import javax.swing.*;

public class JOptionPanes
{
  public static void main(String[] args)
  {
    //exercise1
    JOptionPane.showMessageDialog(null, "Follow the instructions!", "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
    //exercise2
    String input = JOptionPane.showInputDialog(null, "Enter your name: ", "Name");
    System.out.println(input);
    //exercise3
    int choice = JOptionPane.showConfirmDialog(null, "Do you want to provide your name?");
    if (choice == JOptionPane.YES_OPTION)
    {
      String name = JOptionPane.showInputDialog(null, "Enter your name: ",
          "Name");
    }
    else if (choice == JOptionPane.NO_OPTION)
    {
      JOptionPane.showMessageDialog(null, "You didn't want to provide your name.", "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
  }
}

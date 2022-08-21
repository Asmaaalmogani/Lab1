import javax.swing.*;

public class DialogViewer3 {
    public static void main(String[] args)
    {
        String name= JOptionPane.showInputDialog("What is your name? ");
        JOptionPane.showMessageDialog(null,"My name is " + name);
        JOptionPane.showMessageDialog(null,name +" , What would you like to do? " );
        JOptionPane.showMessageDialog(null,"I`m sorry    " + name+" , I`m afraid I can`t do that");



    }
}

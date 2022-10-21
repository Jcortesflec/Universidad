package Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class calculadora extends JFrame {
    private static JLabel directionslabel = new JLabel("coloca tu nombre");
    private static JLabel outputJLabel = new JLabel();
    private static JTextField nameBox = new JTextField(25);
    private static JButton nameButton1 = new JButton("*");
    private static JButton nameButton2 = new JButton("*");
    private static JButton nameButton3 = new JButton("*");
    private static JButton nameButton4 = new JButton("*");
    private static JButton nameButton5 = new JButton("*");
    public static void main (String[] args ) throws Exception {
        calculadora calculadora = new calculadora();
        calculadora.setSize(310,464);
        calculadora.setVisible(true);
        calculadora.setTitle("Calculadora");
        
        calculadora.setLayout(new FlowLayout());
        calculadora.getContentPane().add(directionslabel);
        calculadora.getContentPane().add(nameBox);
        calculadora.getContentPane().add(nameButton1);
        calculadora.getContentPane().add(nameButton2);
        calculadora.getContentPane().add(nameButton3);
        calculadora.getContentPane().add(nameButton4);
        calculadora.getContentPane().add(nameButton5);
        calculadora.getContentPane().add(outputJLabel);

        //añadir opciones a los botones
        nameButton1.addActionListener(new ActionListener() {
            public void actionPerormed(ActionEvent e){
                buttonclick(e);
            }
        });
        //calculadora.pack();
        
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void buttonclick(ActionEvent e){
        JOptionPane.showMessageDialog(null, "holi", "holix2", JOptionPane.INFORMATION_MESSAGE);        
    }
}

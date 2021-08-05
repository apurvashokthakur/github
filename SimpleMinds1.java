package simple.minds1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMinds1 extends JFrame implements ActionListener{
    
    JButton b1, b2;
    JTextField t1;
    SimpleMinds1(){
        setBounds(400, 200, 1200, 500); //psition from left,top,length,height of frame
        getContentPane().setBackground(Color.WHITE);  // to set frame color
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds1/Icon/login.jpeg")); //add image in the frame
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 500);  // to set image from starting
        add(l1);
        
        JLabel l2 = new JLabel("Simple Minds"); //label(display name)
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));  //to change font style and size;
        l2.setForeground(new Color(30, 144, 254));  //to change color of font;
        l2.setBounds(750, 60, 300, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));  //to change font style and size;
        l3.setForeground(new Color(30, 144, 254));  //to change color of font;
        l3.setBounds(810, 150, 300, 20);
        add(l3);
        
        t1 = new JTextField(); // text field to enter name;
        t1.setBounds(735, 200, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Rules"); // creating button
        b1.setBounds(735, 270, 120, 25);
        b1.setBackground(new Color(30, 144, 254)); //creating background color
        b1.setForeground(Color.WHITE);  //giving color to text;
        b1.addActionListener(this); //use to tell what happens when click on button;
        add(b1);
        
        b2 = new JButton("Exit"); // creating button
        b2.setBounds(915, 270, 120, 25); //set position of button
        b2.setBackground(new Color(30, 144, 254)); //creating background color
        b2.setForeground(Color.WHITE); //giving color to text;
        b2.addActionListener(this); //use to tell what happens when click on button;
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new SimpleMinds1();
    }
    
}

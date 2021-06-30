/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai01;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //get first input
        String name = JOptionPane.showInputDialog("What is your name?");
        
        //get second input
        String input = JOptionPane.showInputDialog("How old are you?");
        
        //convert string to integer value
        int age = Integer.parseInt(input);
        
        //display output on console
        System.out.println("Hello, " + name + " . Next year, you'll be " + (age + 1));
        
        System.exit(0);
    }
    
}

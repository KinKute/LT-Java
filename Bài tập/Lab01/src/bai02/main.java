/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai02;

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
        //read inpute
        String input = JOptionPane.showInputDialog("How much money do you need to retire?");
        double goal = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("How much money will you contribute every year?");
        double payment = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Interest rate in %: ");
        double interesRate = Double.parseDouble(input);
        
        double balance = 0;
        int years = 0;
        
        //update account balance while goal isn't reached
        while(balance < goal){
            //add this year's payment and interest
            
            balance += payment;
            double interest = balance * interesRate / 10;
            balance += interest;
            years++;
        }
        System.out.println("You can retize in " + years + " years");
        System.exit(0);
    }
    
}

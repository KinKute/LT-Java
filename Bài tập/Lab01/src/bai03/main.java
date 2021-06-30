/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai03;

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
        String input = JOptionPane.showInputDialog("How manu numbers do you need to draw?");
        int k = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("What is the highest number you can draw?");
        int n = Integer.parseInt(input);
        
        /*
         compute binomial coefficient
        n * n (n - 1) * (n - 2) * . . . * (n - k + 1)
        ---------------------------------------------
        1 * 2 * 3 * . . . * k
        */
        
        int lotteyOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteyOdds = lotteyOdds * (n - i + 1 / i);
            
            System.out.println("Your odds are 1 in " + lotteyOdds + " . Good luck!");
            System.exit(0);
        }
    }
    
}

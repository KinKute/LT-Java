/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai06;

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
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);
        System.out.println("name = " + harry.getName()
                + ", salary = " + harry.getSalary()
                + ", hireDay = " + harry.getHireDay());
        System.exit(0);
    }

}

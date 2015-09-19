/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdojo.binding;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author ajax
 */
public class EmployeeTest {
    public static void main(String[] args){
        final Employee e1 = new Employee("Jon Jacobs", 2000.0);
       
        computeTax(e1.getSalary());
        
        e1.addPropertyChangeListener(EmployeeTest::handlePropertyChange);
        
        // Change the salary
        e1.setSalary(3000.00);
        e1.setSalary(3000.00); // No change notification is sent.
        e1.setSalary(6000.00);

    }
    
    public static void handlePropertyChange(PropertyChangeEvent e) {
        String propertyName = e.getPropertyName();
        
        if("salary".equals(propertyName)){
            System.out.print("Salary has changed. ");
            System.out.print("Old :" + e.getOldValue());
            System.out.println(", new: " + e.getNewValue());
            computeTax((Double)e.getNewValue());
        }
    }

    private static void computeTax(double salary) {
        final double TAX_PERCENT = 20.0;
        double tax = salary * TAX_PERCENT/100.0;
        System.out.println("Salary :" + salary + ", tax: " + tax);
    }
}

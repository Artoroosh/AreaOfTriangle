/*
 * Corbin Nash
 * 0/7/09/2018
 * Area Of A Triangle
 */
package areaoftriangle;

import javax.swing.JOptionPane;

public class AreaOfTriangle {
    public static void main(String[] args) {
         //We gather all the users inputs.
         String sideAstr = JOptionPane.showInputDialog("Enter side A");
         String sideBstr = JOptionPane.showInputDialog("Enter side B");       
         String sideCstr = JOptionPane.showInputDialog("Enter side C");
         //We Convert It all into doubles
         double sideA = Double.parseDouble(sideAstr);
         double sideB = Double.parseDouble(sideBstr);
         double sideC = Double.parseDouble(sideCstr);
         //We convert C into sin
         double sinC = (Math.sin(sideC));
         //We do the final conversion  
         double areaOfTriangle = ((sideA + sideB +sinC)/2);
         //We output the area of the user
         System.out.println("The Area of the triangle is "+areaOfTriangle);
    }
    
    
}

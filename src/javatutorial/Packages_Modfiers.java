/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatutorial;

/*
    Systax to import packages. First is the import packagename.class name.
    If you want to import all you can do import packagename.*
*/
import MathFunctions.Math;
import MathFunctions.MathConstants;
/**
 *
 * @author JeromeMarco
 */
public class Packages_Modfiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // need to instantiate packages class name to use it example.
      Math m = new Math();
      MathConstants mc = new  MathConstants();
   
      double pi = mc.pi;
      
      // m because we instantiate the math class into letter m
      // you can also instantiate the it to simplify the codes
      int sum = m.add(2, 3);
      //you can add the instantiate to another.
      int plus = sum + 5;
      System.out.println("-----------------------Math Package--------------------");
      System.out.println(plus);
      System.out.println(m.add(2, 3, 4));
      System.out.println(m.substract(2, 3, 4));
      System.out.println(m.divide(2, 3, 4));
      System.out.println(m.multiply(2, 3, 4));
      System.out.println("Pie " + mc.pi);
      System.out.println("Pie add " + pi);
      
      
    }
    
}

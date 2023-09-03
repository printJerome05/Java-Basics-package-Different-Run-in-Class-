/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */
/*
    This is an example of oop with same class as constructor with parameters.
*/

public class MainProduct {
    
    //define global variables first to store
    String productname;
    int price;
    
    MainProduct(String productname, int price){
        // Use the this. keyword when if the variables have the same name to make the code clean.
        this.productname = productname;
        this.price = price;
        
        // to display created products
        System.out.println(productname + "Created");
    }
}

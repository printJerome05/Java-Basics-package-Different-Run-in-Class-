/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;


/**
 *
 * @author JeromeMarco
 */
public class Inheritance_Todler_OverdingConstructor extends Inheritance_Person_OverdingConstructor{
      //if you want to overide the person constructor you need to input the super for exaample
    // you need the super to not error and will call the constructor in the Inheritance person
    // using this extended inheritance constructor is that you can add another for example we will add string
    // the string can be use in this class only not in the Inheritance Person because we extended it 
    // inheritance summary the inheritance person constructor will function what is inside the class only
    // the extended class like this will function the same as the class inherited and will function the class it self 
    
    String Favorite;
    Inheritance_Todler_OverdingConstructor(int age, String fname,String lname,String Favorite){
        super(fname,lname,age);
        this.Favorite = Favorite;
    }
    
    
    void SPEAK(){
        System.out.println("Hello");
    }
    
    void say(){
        
        System.out.println(" Lastname: "+lname + " FirstName: "+fname+" Age: "+age+" Favorite: "+Favorite);
  
    }
    
    // inheritance of Method example
    //need to be the same class name and same super
    // use super to not overide the existing method in the super class
    // BEST USE FOR ADDING DATA 
    void example(){
        super.example();
        System.out.println("HOLLA");
        
    }
    
}

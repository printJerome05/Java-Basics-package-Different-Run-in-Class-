/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial;

/**
 *
 * @author JeromeMarco
 */
public class Variables {
    
    public static void main(String[] args) {
        
        //Data types and Variables
        //variables string int boolean 
        //  
        char letter = 'A';
        String name = "jerome";
        int num = 12312;
        byte num1 = 12;
        long num2 = 123123;
        
        //float needs f to function float float can be a double but double cant be float
        float num3 = 123.4f;
        
        double num4 = 123.142;
         
        boolean isName = false;
        
        
        
            System.out.println(letter); 
            System.out.println(name); 
          
          
            System.out.println(num); 
            System.out.println(num3); 
            System.out.println(num4); 
                
                
            // you can change the data types bellow, if you like yo change name example below;
            name = "marco";
            num = 123;
            
            System.out.println(name);
            System.out.println(num);
            
            
            
            //concantenation process of joining strings
                     System.out.println("awdaw " + "awdawd"); 
            
                           System.out.println("awdaw " + name); 
                           
                           
         // Example
         String name1 ="Jerome Marco";
         int age = 22;
         double gpa = 1.75;
         char blood = 'A';
            
         // the "\n" function is to get the next statement to the nextline
              System.out.println("Hi my name is "+ name1 + "\n" + "I am " + age + "\n" + "My GPA is " + gpa + "\n" + "My blood type is " + blood); 
              
              
              
            
            
            //if else example
            if(isName == true){
                System.out.println("is Name is True");
            }
            else{
                  System.out.println("is Name is false");
            }
          
          
          
        
    }
}

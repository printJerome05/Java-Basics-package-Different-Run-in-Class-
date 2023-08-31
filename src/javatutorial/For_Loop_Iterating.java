/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial;
import java.util.Scanner;
/**
 *
 * @author JeromeMarco
 */


//for loop with iterations
//for loop is used when you want a code block to run repeatedly while conditon is met
// it is specialized for array and collections
public class For_Loop_Iterating {
    public static void main (String []args){
        
        //for loops systax
        // for(initialization;condition;operation){}
        //example of for loop
        // simplified version of while loop
        // but it for loop it is comapct version like below
        for(int i = 0;i < 5;i++){
            //true syntax 
            System.out.println(i);
        }
        //for loop arrays example
        String[] fruits ={"apple","mango","grapes"};
       
        for(int f = 0;f < fruits.length;f++){
            System.out.println(fruits[f]);
        }
        
        //for loop example with break keyword
        // same arrayused fruits
        String[] fruits1 ={"apple","mango","grapes"};
        
         for(int i = 0;i < fruits.length;i++){
             
           if(fruits1[i].equals("grapes")){
               System.out.println("We found: " + fruits1[i]);
               break;
           }else{
               System.out.println(fruits1[i]);
           }  
        }
         
        //for loop with search 
        
        String[] fruits2 = {"apple","mango","grapes","lemon","orange"};
        
        Scanner f2 = new Scanner(System.in);
        
        System.out.print("Search fruit: ");
        String Search = f2.nextLine();
        
        for(int q = 0;q < fruits2.length; q++){
            // the q in the fruits represent the index or array by itterate 
            //the euqaulsIgnoreCase mean it ignores the string being capitalization and not capitalize words
            //if the letter matchs whether it is capital or not it will print the value
            if(fruits2[q].equalsIgnoreCase(Search)){
                System.out.println("There is: " + fruits2[q]);
                break;
            }else{
                System.out.println(fruits2[q]);
            }
            
        }
        
        
        //Example of For loop itereations with authentication simulation
        // 2 array email and password
        // the email should match the password index for example index 0 jerome and index 0 password should be jerome123
        
        String[] Email ={"jerome","marco","mara"};
        String[] Password={"jerome123","marco123","mara123"};
        
        String enterEm, enterPa;
        
        Scanner em = new Scanner(System.in);
        Scanner pa = new Scanner(System.in);
        
        System.out.print("Enter Email: ");
        enterEm = em.nextLine();
        System.out.print("Enter Password: ");
        enterPa = pa.nextLine();
        
        boolean succes = false;
        // int a serves as an index for Email and password they have both lenght
        for(int a = 0;a < Email.length;a++) {
            if(Email[a].equals(enterEm)){
                if(Password[a].equals(enterPa)){
                    System.out.println("Welcome: " + Email[a]);
                    succes = true;
                    break;
                }else{
                    System.out.println("Wrong Password");
                     break;
                }    
                
            }succes = false;  
            if(succes = false){
                    System.out.println("Invalid Email");
        }
       
        }
         
            
        }
    }


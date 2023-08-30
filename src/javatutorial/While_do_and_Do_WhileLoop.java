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
public class While_do_and_Do_WhileLoop {
    public static void main (String []args){
        
        //While loop it is use if you want a codeblock/statement to run repeatedly while condition is met
        
        //EXAMPLE IS 
        
       
        int age = 1;
        
        // you can use break; statement while loop
        // this can count if it is > it  the number will go high
        //statement summary if age is less than 20 stated that age is 1, age will add 1 until the condition is met
        // like the condition bellow ( age is 1 ) is it will print the do until it go to 20
        while(age < 20){
            //do is stated here
            //this age++ means add 1 to age int;

            System.out.println("Age: " + age);
            age++;
        }
       
        
       //Iterating while loop into array
       //Example 
       
       String[] names = {"jerome","Marco","MARA"};
       
       // to represent the array   int i = 0; define an int to define the index and loop it
       int i = 0;
       
       // to simplify it and for simplier code you can use the comment next to the number 3
       // array.lenght means it will count how many index you have
       // replace 3 with array.length to simplify version
       while(i < 3 ){
        //noted that in the println names it is i for the index of array
        // at the bottom i++ means add 1 so
        // the i in the names will add 1 until it met the condtion
        System.out.println(names[i]);
        i++;
       }
       
       
       
       //Do while 
       // Execute first then the condition best use in input checking example
       
       Scanner s = new Scanner(System.in);
       String answer;
       
       do{
           System.out.println("If you answer yes it will loop again");
           System.out.println("If no It will do the next code block bellow the while");
           System.out.println("Yes/No to continue");
           answer = s.nextLine();
           
           
           
       }while(answer.equals("Yes"));
       
       
       //While do example with break statement array typE
       String[] name1 = {"JEROME1", "jerome2", "jerome3"};
       
       int index = 0;
      //FINDING the specific array then displaying it 
      //the break staops the operation in while and do loop if the statement is met
       while(index < name1.length){
           if(name1[index].equals("jerome2")){
               System.out.println("We Found " + name1[index]);
               break;
           }else{
                  System.out.println(name1[index]);
           }
       
           index++;
           
       }
       
       
      //Example of while with input
      // Answering the question with real answer
      int answer1;
      int ansnum = 3;
      Scanner ans = new Scanner(System.in);
      
     
      System.out.println("Only got 3 lives");
      
      while(ansnum > 0){
         System.out.println("What is next to 2");
         answer1 = ans.nextInt();
         System.out.println("");
            if(answer1 == 3){
            System.out.println("Correct");
            break;
            }else ansnum--;    {
                if(ansnum == 1){
                System.out.println("Lives Left: 3/1");
                    }else if(ansnum == 2){
                    System.out.println("Lives Left: 3/2");
                    }else{
                    System.out.println("Out of lives");
                    break;
          }
      }     
                    } 
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */


public class ObjectMethod_STUDENT {
    
    String firstname,lastName,course,section;
    int year,midtermGrade,finalGrade;
    
    ObjectMethod_STUDENT(String firstname,String lastName,String course,String section,int year,int midtermGrade,int finalGrade){
        this.firstname = firstname;
        this.lastName = lastName;
        this.course = course;
        this.section = section;
        this.year = year;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
        
    }
    
    void introduceSelf(){
        System.out.println("Name is "+firstname+" "+lastName +" My Course is "+ course +" "+ year +" "+ section);
    }
    
    void evaluateGrade(){
    int midfinGrade = midtermGrade + finalGrade;
    int result = midfinGrade  / 2;
        if(result > 100){
            System.out.println("Invalid Grade");
        }
        else if(result > 98){
             System.out.println("With Highest Honors");
        }
        else if(result > 95){
             System.out.println("With High Honors");
        }
        else if(result > 90){
             System.out.println("With Honors");
        }
        else if(result > 75){
             System.out.println("Passed");
        }
        else if(result < 75){
             System.out.println("failed");
        }
}
}



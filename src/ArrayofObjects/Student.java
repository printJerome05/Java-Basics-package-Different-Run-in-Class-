/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayofObjects;

/**
 *
 * @author JeromeMarco
 */
public class Student {
    String fname, lastname, Course;
    int year;
    char Section;
    
    Student(String fname, String lastname, String Course, int year, char Section){
        this.fname = fname;
        this.lastname = lastname;
        this.Course = Course;
        this.year = year;
        this.Section = Section;
    }
    
    void Introduce(){
        
        System.out.println("Iam "+ fname +", "+ lastname);
        System.out.println("My course is: " + Course);
        System.out.println("My year is: " + year);
        System.out.println("My Section is: " + Section);
        
    }
}

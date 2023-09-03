/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */
// overloading gets you how many kind of data you want for example all, two , or three like that see example at the mainOO.java

public class OverLoadingConstructor {
    private String firstname,lastname,middlename,gender;
    private int age;
    
    //this is a full info
    OverLoadingConstructor(String firstname, String lastname,String middlename,String gender, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.gender = gender;
        this.age = age;
    }
    
    //if you want two only you can
    OverLoadingConstructor(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    
    }
    
     //if you want three only you can 
    OverLoadingConstructor(String firstname, String lastname, String middlename){
        this.firstname = firstname;
        this.lastname = lastname;
        this.lastname = middlename;
        // note u can define a value if this overlaoding is been called for example they only input 3 so the other will be no value or null
        this.gender = "N/A";
        this.age = 0;
    
    }
    
    String getFirstname(){
        return firstname;
    }
    String getlastname(){
        return lastname;
    }
    String middletname(){
        return middlename;
    }   
    String gender(){
        return gender;
    }
    int getage(){
        return age;
    }
            
}

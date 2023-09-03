/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */

//is an oop technique used to hide data from direct access.
// Encapsulation means by privating attributes can be access withing a class only.
public class Encapsulation {
    
private int Id;
private String name, username;

//constructive 
Encapsulation(int Id,String name,String username){
    this.Id = Id;
    this.name = name;
    this.username = username;
}

/////////////GETTER AND SETTER - is use to not acess the main constructive. But it can change the value in the main class using this getter and setter
//Ecapsulation Setter to access individual in main
void setId(int Id){
    this.Id = Id;  
}
//get id using return keyword
int GetId(){
    return Id;
}

//example this getter is use for readonly not rewrite or anything just read it only
String username(){
    return username;
}
}

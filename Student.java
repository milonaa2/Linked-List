/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststudent;
public class Student {
    private int rollno;
    private String name;
    private char gender;
    Student()
    {
        rollno= 0;
        name= " ";
        gender= ' ';
    }
    Student(int r, String n, char g)
    {
        rollno= r;
        name= n;
        gender= g;
    }
    String get()
    {
        return rollno + name + gender ;
    }
}

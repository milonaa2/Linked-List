/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststudent;
public class LinkedListStudent {
    public static void main(String[] args) {
        Student student0= new Student(153, "Siddique", 'm');
        Student student1= new Student(154, "Ahmad", 'm');
        Student student2= new Student(155, "Ayesha", 'f');
        Student student3= new Student(156, "Qadeer", 'm');
        Student student4= new Student(157, "Salman", 'm');
        Student student5= new Student(158, "Junaid", 'm');
        Student student6= new Student(159, "CATTY", 'm');
        Student student7= new Student(160, "Thomas", 'm');
        
        List l= new List();
        l.add(student0);
        l.add(student1);
        l.add(student2);
        l.add(student3);
        l.add(student4);
        l.add(student5);
        l.add(student6);
        l.add(student7);
        
        l.displayList();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststudent;
public class Node {
    private Student student;
    private Node address;
    Node()
    {
        student= null;
        address= null;
    }
    Node(Student object)
    {
        student= object;
        address= null;
    }
    Node getAddress()
    {
        return address;
    }
    void setAddress(Node n)
    {
        address= n;
    }
    void getData()
    {
        System.out.println(student.get());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststudent;
public class List implements ListInterface{
    private Node head;
    private Node tail;
    private Node lastNode;
    List()
    {
        head= null;
        tail= null;
        lastNode= null;
    }
    @Override
    public void add(Student student) {
        Node n= new Node(student);
        if(head== null)
        {
            head= n;
        }
        else
        {
            lastNode= head;
            while(lastNode.getAddress()!= null)
            {
                lastNode= lastNode.getAddress();
            }
            lastNode.setAddress(n);
            tail= lastNode;
        }
    }

    @Override
    public void displayList() {
        lastNode= head;
        while(lastNode.getAddress()!= null)
        {
            lastNode.getData();
            lastNode= lastNode.getAddress();
        }
        lastNode.getData();
            
    }
    
}

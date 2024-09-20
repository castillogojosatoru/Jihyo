/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author Rhodz
 */
public class main {
    
    public static void main(String[] args) {
        doubleLinkedList linkedlist = new doubleLinkedList();
        
        linkedlist.addNode(1);
        linkedlist.addNode(2);
        linkedlist.addNode(3);
        linkedlist.addNode(4);
        linkedlist.addNode(5);
        
        System.out.println("Elements of array: ");
        linkedlist.display();
        System.out.println("\nFirst Node Deleted.");
        linkedlist.deleteFirstNode();
        linkedlist.display();
        System.out.println("\nLast Node Deleted.");
        linkedlist.deleteLastNode();
        linkedlist.display();
        System.out.println("\nNumber 3 Node Deleted.");
        linkedlist.deleteAnywhere(3);
        linkedlist.display();
    }
}

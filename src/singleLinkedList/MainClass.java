/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleLinkedList;

/**
 *
 * @author Rhodz
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        SingleLinkedList singlelinkedlist = new SingleLinkedList();;
        SingleLinkedList.Node node = singlelinkedlist.new Node(5);
        
        singlelinkedlist.addNode(100);
        singlelinkedlist.addNode(100);
        singlelinkedlist.addNode(100);
        singlelinkedlist.addNode(100);
        singlelinkedlist.addNode(100);
        System.out.println("");
        System.out.println("Linked List: ");
        singlelinkedlist.display();
        System.out.println("");
        singlelinkedlist.deleteFirstNode();
        System.out.println("First Node deleted.");
        singlelinkedlist.display();
        System.out.println("");
        singlelinkedlist.deleteLastNode();
        System.out.println("Last Node deleted.");
        singlelinkedlist.display();
        System.out.println("");
        singlelinkedlist.deleteAnywhere(100);
        System.out.println("Node 100 deleted.");
        singlelinkedlist.display();
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author Rhodz
 */
public class doubleLinkedList {
    
    class Node {
        private int data;
        private Node previous;
        private Node next;
        
        public Node(int value) {
            this.data = value;
            this.previous = null;
            this.next = null;
        }
    }
    
    private Node head = null;
    private Node tail = null;
    
    public void addNode(int addValue) {
        Node node = new Node(addValue);
        if (head == null) {
            head = tail = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }
    
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty.");
        }
        else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty.");
        }
        else {
            if (head == null) {
                head = tail = null;
            }
            else {
                head = head.next;
                head.previous = null;
            }
        }
    }
    
    public void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty.");
        }
        else {
            if (head == tail) {
                head = tail = null;
            }
            else {
                tail = tail.previous;
                tail.next = null;
            }
        }
    }
    
    public void deleteAnywhere(int value) {
        if (head == null) {
            System.out.println("List is empty.");
        }
        else {
            Node current = head;
            while (current != null && current.data == value) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("The Node value " + value + "is not found.");
            }
            if (current == tail) {
                deleteLastNode();
            }
            if (current == head) {
                deleteFirstNode();
            }
        }
    }
}

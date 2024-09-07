/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleLinkedList;

/**
 *
 * @author Rhodz
 */
public class SingleLinkedList {
    
    class Node {
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head = null;
    private Node tail = null;
    
    public void addNode(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }
    
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("EMPTY.");
        }
        else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }
    
    public void deleteLastNode() {
        if (head == null) {
            System.out.println("EMPTY.");
        }
        else if (head == tail) {
            head = tail = null;
        }
        else {
            Node node = head;
            while (node.next != tail) {
                node = node.next;
            }
            node.next = null;
            tail = node;
        }
    }
    public void deleteAnywhere(int value) {
        if (head == null) {
            System.out.println("EMPTY.");
        }
        else if (head.data == value) {
            deleteFirstNode();
        }
        else {
            Node current = head;
            Node previous = null;
            while (current != null && current.data != value) {
                previous = current;
                current = current.next;
            }
            if (current == null) {
                System.out.println("Value is not here.");
            }
            else {
                previous.next = current.next;
                if (current == tail) {
                    tail = previous;
                }
            }
        }
    }
    
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("EMPTY.");
        }
        else {
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}

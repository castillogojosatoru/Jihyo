/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivityTwo;

import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassOne {
     private int max;
     private double[] Stack;
     private int top;
     Stack<Double> stacknew = new Stack<>();
     
    public ActivityTwoClassOne(int size) {
       max = size;
       Stack = new double[max];
       top = -1;
    }
    public void push(double num) {
        if (!isFull()) {
            Stack[++top] = num;
        }
    }
    public double pop() {
        if (!isEmpty()) {
            return Stack[top--];
        }
        else {
            System.out.println("STACK IS EMPTY.");
            return -1;
        }
    }
    public double peek() {
        if (!isEmpty()) {
            return Stack[top];
        }
        else {
            System.out.println("TOP IS EMPTY.");
            return -1;
        }
    }
    public double bot() {
        if(!isEmpty()) {
            return Stack[0];
        }
        else {
            System.out.println("BOT IS EMPTY.");
            return -1;
        }
    }
    public void count() {
        if (!isEmpty()) {
                int sum = top + 1;
                System.out.println("STACK ELEMENT: " +sum);
            }
        else {
            System.out.println("STACK IS EMPTY.");
        }
    }
    public void removedup() {
        HashSet <Double> set = new HashSet<>();
        ActivityTwoClassOne remove = new ActivityTwoClassOne(max);
        int newtop = -1;
        boolean dup = false;
        for (int i = 0; i <= top; i++) {
            if(set.contains(Stack[i])) {
                System.out.println("Stack Duplicate removed.");
                Stack[++newtop] = Stack[i];
                top = newtop;
                display();  
                dup = true;
                
            }
            set.add(Stack[i]);
            remove.push(i);
        }
        if (dup == false) {
            System.out.println("No Duplicate Stack detected.");      
        }
    }
    public void loop() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY.");
        }
        else {
            System.out.println("\nSTACK: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i]);
            }
            System.out.println(stacknew);
        }
    }
    public void addstack() {
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("STACK ADDED TO ANOTHER STACK: " +Stack[i]);
                stacknew.push(Stack[i]);
            }
            else {
                System.out.println("STACK IS FULL.");
            }
        }
       
    }
    public void display() {
        if (!isEmpty()) {
            System.out.println("ELEMENTS OF STACK: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("ELEMENTS OF STACK IS EMPTY.");
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == max - 1);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivityTwo;

import java.util.HashSet;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassThree {
    private int max;
    private double[] Stack1;
    private int top;
    
    public ActivityTwoClassThree(int size) {
        max = size;
        Stack1 = new double[max];
        top = -1;
    }
    public void push(double num) {
        if (!isFull()) {
            Stack1[++top] = num;
        }
    }
    public double pop() {
        if (!isEmpty()) {
            return Stack1[top--];
        }
        else {
            System.out.println("CAN'T POP STACK.");
            return -1;
        }
    }
    public void removedup() {
        HashSet <Double> set = new HashSet<>();
        ActivityTwoClassThree remove = new ActivityTwoClassThree(max);
        int newtop = -1;
        boolean dup = false;
        for (int i = 0; i <= top; i++) {
            if(set.contains(Stack1[i])) {
                System.out.println("Stack Duplicate removed.");
                Stack1[++newtop] = Stack1[i];
                top = newtop;
                display();  
                dup = true; 
            }
            set.add(Stack1[i]);
            remove.push(i);
        }
        if (dup == false) {
            System.out.println("No Duplicate Stack detected.");      
        }
    }
    public void display() {
        if (!isEmpty()) {
            System.out.println("ELEMENTS OF STACK: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack1[i] + " ");
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

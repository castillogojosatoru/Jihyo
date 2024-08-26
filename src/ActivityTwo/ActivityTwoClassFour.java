/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivityTwo;

import java.util.Stack;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassFour{
    private int max;
    private double[] Stack;
    private int top;
    Stack<Double> stacknew = new Stack<>();
    public ActivityTwoClassFour(int size) {
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
    
    public void display() {
        if (!isEmpty()) {
            System.out.println("ELEMENTS OF STACK: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i] + " ");
            }
            System.out.println(stacknew);
        }
        else {
            System.out.println("ELEMENTS OF STACK IS EMPTY.");
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
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == max - 1);
    }
}

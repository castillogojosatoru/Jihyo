/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivityTwo;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassFive {
    private int max;
    private double[] Stack;
    private int top;
    
    public ActivityTwoClassFive(int size) {
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

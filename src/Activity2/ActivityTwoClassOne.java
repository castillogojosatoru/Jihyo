/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;

import java.util.Stack;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassOne {
    int max;
    double[] Stack;
    int top;
    Stack<Double> newstack = new Stack<>();
    public ActivityTwoClassOne(int Size) {
        max = Size;
        Stack = new double[max];
        top = -1;
    }
    public void push(double number) {
        if (!isFull()) {
            Stack[++top] = number;
        } 
        else {
            System.out.println("STACK IS FULLL.");
        }
    }
    public double pop() {
        if (!isEmpty()) {
            return Stack[top--];
        }
        else {
            System.out.println("STACK IS EMPTY. CANNOT POP.");
            return -1;
        }
    }
    public void loopstack() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY. CANNOT LOOP.");
        }
        else {
            System.out.println("STACK: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i]);
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActivityTwo;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassMain {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int STACK;
        boolean kundisyon = false;
        System.out.print("Input the size of your Stack: ");
        STACK = scn.nextInt();
        ActivityTwoClassOne stack = new ActivityTwoClassOne(STACK);
        ActivityTwoClassTwo stack2 = new ActivityTwoClassTwo(STACK);
        ActivityTwoClassThree stack3 = new ActivityTwoClassThree(STACK);
        ActivityTwoClassFour stack4 = new ActivityTwoClassFour(STACK);
        ActivityTwoClassFive stack5 = new ActivityTwoClassFive(STACK);
        System.out.print("The size of your Stack is: " + STACK);
        
        int choose;
        while (true) {
            System.out.println("\nSelect which one would you choose: ");
            System.out.println("1. PUSH Element in the STACK PROGRAM.");
            System.out.println("2. COUNT Element from the STACK PROGRAM.");
            System.out.println("3. REMOVE DUPLICATE STACK PROGRAM.");
            System.out.println("4. ADD STACK COLLECTION TO ANOTHER STACK COLLECTION PROGRAM.");
            System.out.println("5. PEEK THE TOP AND BOTTOM ELEMENT FROM STACK PROGRAM.");
            System.out.println("0. Exit.");
            System.out.print("\nYour choice: ");
            choose = scn.nextInt();
            switch (choose) {
                
                case 1:
                    int pili;
                    System.out.println("POP OR PUSH? 1. POP. 2. PUSH.");
                    pili = scn.nextInt();
                    if (pili == 1) {
                        stack.pop();
                        stack.display();
                    }
                    else if (pili == 2) {
                        System.out.print("\nInput number to PUSH in the STACK: ");
                        int val;
                        val = scn.nextInt();
                        stack.push(val);
                        stack.display();
                        break;
                    }
                    else {
                        System.out.println("WRONG INPUT.");
                        break;
                    }
                    break;
                case 2:
                    int number;
                    System.out.println("POP OR PUSH? 1. POP. 2. PUSH.");
                    number = scn.nextInt();
                    if (number == 1) {
                        stack2.pop();
                        stack2.display();
                        stack2.count();
                    }
                    else if (number == 2) {
                        System.out.println("Input number to PUSH in the STACK.");
                        int value;
                        value = scn.nextInt();
                        stack2.push(value);
                        stack2.display();
                        stack2.count();
                        break;
                    }
                    else {
                        System.out.println("WRONG INPUT.");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("POP OR PUSH? 1. POP. 2. PUSH.");
                    int numero;
                    numero = scn.nextInt();
                    if (numero == 1) {
                        stack3.pop();
                        stack3.display();
                    }
                    else if (numero == 2) {
                        System.out.println("Input number to PUSH in the STACK.");
                        int balyu;
                        balyu = scn.nextInt();
                        stack3.push(balyu);
                        stack3.display();
                        int decide;
                        System.out.println("REMOVE DUPLICATED STACKS?\nType 1 if Yes. Type 2 if No.");
                        decide = scn.nextInt();
                        if (decide == 1) {
                        stack3.removedup();
                        break;
                        }
                        else if (decide == 2) {
                        break;
                        }
                        else {
                        System.out.println("WRONG INPUT.");
                        break;
                        }
                    }
                    else {
                        System.out.println("WRONG INPUT.");
                        break;
                    }
                    break;
                case 4:
                    System.out.println("POP OR PUSH? 1. POP. 2. PUSH.");
                    int namber;
                    namber = scn.nextInt();
                    if (namber == 1) {
                        stack4.pop();
                        stack4.display();
                    }
                    else if (namber == 2) {
                        System.out.println("Input number to PUSH in the STACK.");
                        int bal;
                        bal = scn.nextInt();
                        stack4.push(bal);
                        stack4.display();
                        System.out.println("ADD STACK COLLECTION TO ANOTHER STACK COLLECTION? 1. YES. 2. NO.");
                        int yot;
                        yot = scn.nextInt();
                        if (yot == 1) {
                            stack4.addstack();
                            stack4.display();
                            break;
                        }
                        else if (yot == 2) {
                            break;
                        }
                        else {
                            System.out.println("WRONG INPUT.");
                            break;
                        }
                    }
                    else {
                        System.out.println("WRONG INPUT.");
                        break;
                    }
                    break;
                case 5:
                    int hehe;
                    System.out.println("POP OR PUSH? 1. POP. 2. PUSH.");
                    hehe = scn.nextInt();
                    if (hehe == 1) {
                        stack5.pop();
                        stack5.display();
                    }
                    else if (hehe == 2) {
                        int haha;
                        System.out.println("Input number to PUSH in the STACK.");
                        haha = scn.nextInt();
                        stack5.push(haha);
                        stack5.display();
                        int yaya;
                        System.out.println("PEEK BOTTOM OR TOP? 1. BOTTOM. 2. TOP. 0. Exit.");
                        yaya = scn.nextInt();
                        if (yaya == 1) {
                            stack5.peek();
                            break;
                        }
                        else if (yaya == 2) {
                            stack5.bot();
                            break;
                        }
                        else if (yaya == 0) {
                            break;
                        }
                        else {
                            System.out.println("WRONG INPUT.");
                            break;
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("WRONG INPUT. TRY AGAIN.");
                    kundisyon = false;
                    break;
            }
        } 
    }
}

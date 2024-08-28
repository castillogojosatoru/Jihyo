/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2;

import java.util.Scanner;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassMain {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int istak;
        int pili;
        boolean condition = false;
        System.out.println("INPUT SIZE OF STACK: ");
        istak = scn.nextInt();
        ActivityTwoClassFive stack = new ActivityTwoClassFive(istak);
        System.out.println("SIZE OF STACK: " + istak);
        
        while(!condition) {
            System.out.println("\nWHICH STACK OPTION WOULD YOU CHOOSE?\n");
            System.out.println("1. PUSH ELEMENT IN THE STACK.");
            System.out.println("2. POP ELEMENT FROM THE STACK.");
            System.out.println("3. PEEK TOP ELEMENT FROM THE STACK.");
            System.out.println("4. PEEK BOTTOM ELEMENT FROM THE STACK.");
            System.out.println("5. LOOP STACK INPUT.");
            System.out.println("6. COUNT ELEMENTS FROM THE STACK.");
            System.out.println("7. REMOVE DUPLICATE ELEMENTS FROM THE STACK.");
            System.out.println("8. ADD STACK COLLECTION TO ANOTHER STACK COLLECTION.");
            System.out.println("9. PEEK OTHER STACK COLLECTION.");
            System.out.println("0. EXIT.");
            System.out.println("\nYOUR CHOICE: ");
            pili = scn.nextInt();
            
            switch (pili) {
                case 1: 
                    System.out.println("INPUT NUMBER TO PUSH IN THE STACK.");
                    int push = scn.nextInt();
                    stack.push(push);
                    break;
                case 2:
                    System.out.println("STACK POPPED: " + stack.pop());
                    break;
                case 3:
                    System.out.println("TOP ELEMENT FROM THE STACK: " + stack.peek());
                    break;
                case 4:
                    System.out.println("BOTTOM ELEMENT FROM THE STACK: " + stack.bot());
                    break;
                case 5:
                    stack.loopstack();
                    break;
                case 6:
                    stack.count();
                    break;
                case 7:
                    stack.remove();
                    break;
                case 8:
                    stack.addStack();
                    break;
                case 9:
                    stack.newloopstack();
                    break;
                case 0:
                    System.exit(pili);
                default:
                    System.out.println("WRONG INPUT.");
                    condition = false;
                    break;
            }
        }
    }
}

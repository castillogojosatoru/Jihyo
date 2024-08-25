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
public class ActivityTwoClassTwo {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int STACK; 
        System.out.print("Input the size of your Stack: ");
        STACK = scn.nextInt();
        ActivityTwoClassOne stack = new ActivityTwoClassOne(STACK);
        System.out.print("The size of your Stack is: " + STACK);
        
        int choose;
        while (true) {
            System.out.println("\nSelect which one would you choose: ");
            System.out.println("1. PUSH Element in the STACK.");
            System.out.println("2. POP Element from the STACK.");
            System.out.println("3. PEEK the TOP Element from the STACK.");
            System.out.println("4. PEEK the BOT Element from the STACK.");
            System.out.println("5. Display the Element.");
            System.out.println("6. Loop STACK.");
            System.out.println("7. Count all the STACKS.");
            System.out.println("8. Remove duplicate STACK.");
            System.out.println("9. Add STACK to another STACK.");
            System.out.println("0. Exit.");
            System.out.print("\nYour choice: ");
            choose = scn.nextInt();
            switch (choose) {
                
                case 1:
                    System.out.print("\nInput number to PUSH in the STACK: ");  
                    int val;
                    val = scn.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    double poppa = stack.pop();
                    System.out.println("Popped Element: "+poppa);
                    break;
                case 3:
                    double peeking = stack.peek();
                    System.out.println("TOP Element: "+peeking);
                    break;
                case 4:
                    double bot = stack.bot();
                    System.out.println("BOT Element: "+bot);
                case 5:
                    stack.display();
                    break;
                case 6:
                    stack.loop();
                    break;
                case 7:
                    stack.count();
                    break;
                case 8:
                    stack.removedup();
                    break;
                case 9:
                    stack.addstack();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("WRONG INPUT. TRY AGAIN.");
                    break;
            }
        } 
    }
}

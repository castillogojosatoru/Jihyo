/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexam;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MAIN {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number of users: ");
        int users = scn.nextInt();
        friends f = new friends(users);
        boolean selection = false;
        
        while (!selection) {
            System.out.println("Input number of friends: ");
            int friends = scn.nextInt();
            
            System.out.println("Input User IDs to connect each other (Ex. '1 2' to connect between User 1 and User 2): ");
            for (int i = 0; i < friends; i++) {
                int ID1 = scn.nextInt();
                int ID2 = scn.nextInt();
                f.connect(ID1, ID2);
            }
            System.out.println("Input a USER ID to get friends recommendation: ");
            int id = scn.nextInt();
            f.printUsers(id);
            
            System.out.println("\nContinue? (Input 1 for YES/Input 2 for NO): ");
            int choose = scn.nextInt();
            
            switch (choose) {
                case 1:
                    break;
                case 2:
                    System.out.println("GOODBYE!");
                    selection = true;
                    break;
                default:
                    System.out.println("Incorrect Input. Try Again.");
                    break;
            }
        }
    }
}

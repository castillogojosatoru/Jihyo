/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edefferjohn;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MAIN {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Number of Users: ");
        int user = scn.nextInt();
        fourthexam edeffer = new fourthexam(user);
        boolean select = false;
        
        while(!select) {
            System.out.println("Enter number of friendships: ");
            int users = scn.nextInt();
            
            System.out.println("Enter each friendship (e.g., '1 2' to create a friendship between user 1 and user 2): ");
            for (int i = 0; i < users; i++) {
                int userID1 = scn.nextInt();
                int userID2 = scn.nextInt();
                edeffer.addfriend(userID1, userID2);
            }
            
            System.out.println("Enter the ID of the user to get friend recommendations for: ");
            int userid = scn.nextInt();
            edeffer.printRecommend(userid);
            
            System.out.println("Would you like to continue? (Type 1 for YES. Type 2 for NO.)");
            System.out.println("\nAnswer: ");
            int choices = scn.nextInt();
            
            switch (choices) {
                case 1:
                    break;
                case 2:
                    System.out.println("SAYONARA!");
                    select = true;
                    break;
                default:
                    System.out.println("TRY AGAIN.");
                    break;
            }
        }
    }
}

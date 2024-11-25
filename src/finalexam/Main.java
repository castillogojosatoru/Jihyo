
package finalexam;

import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Number of Users: ");
        int user = scn.nextInt();
        FinalExam sub = new FinalExam(user);
        boolean choose = false;
        
        while(!choose) {
            System.out.println("Enter number of friendships: ");
            int friend = scn.nextInt();
            
            System.out.println("Enter each friendship (e.g., '1 2' to create a friendship between user 1 and user 2): ");
            for (int i = 0; i < friend; i++) {
                int userID1 = scn.nextInt();
                int userID2 = scn.nextInt();
                sub.addFriendship(userID1, userID2);
            }
            
            System.out.println("Enter the ID of the user to get friend recommendations for: ");
            int id = scn.nextInt();
            sub.print(id);
            
            System.out.println("Would you like to continue? (Type 1 for YES. Type 2 for NO.)");
            System.out.println("\nAnswer: ");
            int choices = scn.nextInt();
            
            switch (choices) {
                case 1:
                    break;
                case 2:
                    System.exit(choices);
                default:
                    System.out.println("ERROR.");
                    break;
            }
        }
    }
  }



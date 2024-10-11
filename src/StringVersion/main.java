/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringVersion;

import StringVersion.practice.Node;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        practice prac = new practice();
        Node root = prac.new Node("Yawa");
        prac.insertNode(root, "Oten");
        prac.insertNode(root, "Justyn");
        prac.insertNode(root, "Zed");
        System.out.println("\nDisplay: ");
        prac.display(root);
        System.out.println("\nPre-Order: ");
        prac.pre_order(root);
        System.out.println("\nIn-Order: ");
        prac.in_order(root);
        System.out.println("\nPost-Order: ");
        prac.post_order(root);
        System.out.println("\nInput value of Parent Node: ");
        String val = scn.nextLine();
        Node parent = prac.findParent(root, val);
        if (parent != null) {
            System.out.println("\nParent of " + val + ": " + parent.data);
        }
        else {
            System.out.println("\nParent not found.");
        }
        System.out.println("\nRoot: " + root.data);
        System.out.print("\nLeaf Nodes: ");
        prac.printLeafNodes(root);
        System.out.println();
        System.out.println("\nInput value of Parent Node: ");
        String text = scn.nextLine();
        prac.printLeafOfParent(root, text);
    }
}

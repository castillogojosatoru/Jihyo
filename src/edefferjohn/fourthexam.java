/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edefferjohn;

/**
 *
 * @author Admin
 */
public class fourthexam {
    
    class Node {
        int userID;
        Node prev;
        Node next;
        
        public Node(int userID) {
            this.userID = userID;
            this.prev = null;
            this.next = null;
        }
    }
    private class friends {
        private Node head = null;
        private Node tail = null;
        
        public void add(int userID) {
            Node add = new Node(userID);
            if (head == null) {
                head = tail = add;
            }
            else {
                tail.next = add;
                add.prev = tail;
                tail = add;
            }
        }
    
    public boolean get(int userID) {
        Node current = head;
        while (current != null) {
            if (current.userID == userID) {
                return true;
            }
            current = current.next;
        }
        return false;
        }
    }
    
    private friends[] arrayuser;
    
    
    
    public fourthexam(int numUsers) {
        arrayuser = new friends[numUsers];
        for (int i = 0; i < numUsers; i++) {
            arrayuser[i] = new friends();
        }
    }
    
    public void addfriend(int userID1, int userID2) {
        arrayuser[userID1 - 1].add(userID2);
        arrayuser[userID2 - 1].add(userID1);
    }
    
    public friends recommended(int userID) {
        friends recommendation = new friends();
        friends direct = arrayuser[userID - 1];
        Node friendship = direct.head;
        
        while (friendship != null) {
            friends frienddd = arrayuser[friendship.userID - 1];
            Node bayaw = frienddd.head;
            
            while (bayaw != null) {
                int friendshipgoals = bayaw.userID;
                if (friendshipgoals != userID && !direct.get(friendshipgoals) && !recommendation.get(friendshipgoals)) {
                    recommendation.add(friendshipgoals);
                }
                bayaw = bayaw.next;
            }
            friendship = friendship.next;
        }
        return recommendation;
    }
    
    public void printRecommend(int userID) {
        friends recommend = recommended(userID);
        System.out.println("Friend recommendations for " + userID + ": ");
        Node current = recommend.head;
        while (current != null) {
            System.out.println(current.userID + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexam;

/**
 *
 * @author Admin
 */
public class friends {
    
    class Node {
        int userid;
        Node prev;
        Node next;
        
        public Node(int userid) {
            this.userid = userid;
            this.prev = null;
            this.next = null;
        }
    }
    
    private userarr[] user;
    
    class userarr {
        private Node head = null;
        private Node tail = null;
        
        public void add(int ID) {
            Node friend = new Node(ID);
            if (head == null) {
                head = tail = friend;
            }
            else {
                tail.next = friend;
                friend.prev = tail;
                tail = friend ;
            }
        }
        public boolean getID(int ID) {
            Node current = head;
            while (current != null) {
                if (current.userid == ID) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }
    
    public friends(int userid) {
        user = new userarr[userid];
        for (int i = 0; i < userid; i++) {
            user[i] = new userarr();
        }
    }
    
    public void connect(int user1, int user2) {
        user[user1 - 1].add(user2);
        user[user2 - 2].add(user1);
    }
    
    public userarr recommend(int ID) {
        userarr recommendation = new userarr();
        userarr mutual = new userarr();
        Node mutualfriends = mutual.head;
        
        while (mutualfriends != null) {
            userarr recomm = user[mutualfriends.userid - 1];
            Node userrecommendation = recomm.head;
            
            while (userrecommendation != null) {
                int users = userrecommendation.userid;
                if (users != ID && !mutual.getID(users) && !recommendation.getID(users)) {
                    recommendation.add(users);
                }
                userrecommendation = userrecommendation.next;
            }
            mutualfriends = mutualfriends.next;
        }
        return recommendation;
    }
    
    public void printUsers(int ID) {
        userarr recommended = recommend(ID);
        System.out.println("Friend Recommendation: ");
        Node current = recommended.head;
        while (current != null) {
            System.out.println(ID + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fourthexam;

/**
 *
 * @author Admin
 */
public class finalexam {
    
    class friends {
        int ID;
        friends prev;
        friends next;
        
        public friends(int ID) {
            this.ID = ID;
            this.prev = null;
            this.next = null;
        }
    }
    
    private friendsrami[] user;
    
    class friendsrami {
        private friends head = null;
        private friends tail = null;
        
        public void add(int ID) {
            friends langlang = new friends(ID);
            if (head == null) {
                head = tail = langlang;
            }
            else {
                tail.next = langlang;
                langlang.prev = tail;
                tail = langlang ;
            }
        }
        public boolean getter(int ID) {
            friends current = head;
            while (current != null) {
                if (current.ID == ID) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }
    }
    
    public finalexam(int users) {
        user = new friendsrami[users];
        for (int i = 0; i < users; i++) {
            user[i] = new friendsrami();
        }
    }
    
    public void friendship(int ID1, int ID2) {
        user[ID1 - 1].add(ID2);
        user[ID2 - 2].add(ID1);
    }
    
    public friendsrami recommend(int ID) {
        friendsrami recommendation = new friendsrami();
        friendsrami mutual = new friendsrami();
        friends facebook = mutual.head;
        
        while (facebook != null) {
            friendsrami recomm = user[facebook.ID - 1];
            friends userrecomm = recomm.head;
            
            while (userrecomm != null) {
                int USER = userrecomm.ID;
                if (USER != ID && !mutual.getter(USER) && !recommendation.getter(USER)) {
                    recommendation.add(USER);
                }
                userrecomm = userrecomm.next;
            }
            facebook = facebook.next;
        }
        return recommendation;
    }
    
    public void print(int ID) {
        friendsrami recommended = recommend(ID);
        System.out.println("Friend Recommendation: ");
        friends current = recommended.head;
        while (current != null) {
            System.out.println(ID + " ");
            current = current.next;
        }
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fourthexam;

/**
 *
 * @author Admin
 */
public class subclass {
    
    class friendzone {
        int userID;
        friendzone prev;
        friendzone next;
        
        public friendzone(int userID) {
            this.userID = userID;
            this.prev = null;
            this.next = null;
        }
    }
    private class friendslangtayo {
        private friendzone head = null;
        private friendzone tail = null;
        
        public void addUser(int userID) {
            friendzone friendslang = new friendzone(userID);
            if (head == null) {
                head = tail = friendslang;
            }
            else {
                tail.next = friendslang;
                friendslang.prev = tail;
                tail = friendslang;
            }
        }
    
    public boolean get(int userID) {
        friendzone current = head;
        while (current != null) {
            if (current.userID == userID) {
                return true;
            }
            current = current.next;
        }
        return false;
        }
    }
    
    private friendslangtayo[] users;
    
    
    
    public subclass(int numUsers) {
        users = new friendslangtayo[numUsers];
        for (int i = 0; i < numUsers; i++) {
            users[i] = new friendslangtayo();
        }
    }
    
    public void addFriendship(int userID1, int userID2) {
        users[userID1 - 1].addUser(userID2);
        users[userID2 - 1].addUser(userID1);
    }
    
    public friendslangtayo getRecommendation(int userID) {
        friendslangtayo recommend = new friendslangtayo();
        friendslangtayo directFriends = users[userID - 1];
        friendzone friends = directFriends.head;
        
        while (friends != null) {
            friendslangtayo friendssaakongcrush = users[friends.userID - 1];
            friendzone friendsnicrush = friendssaakongcrush.head;
            
            while (friendsnicrush != null) {
                int mgafriendsnicrush = friendsnicrush.userID;
                if (mgafriendsnicrush != userID && !directFriends.get(mgafriendsnicrush) && !recommend.get(mgafriendsnicrush)) {
                    recommend.addUser(mgafriendsnicrush);
                }
                friendsnicrush = friendsnicrush.next;
            }
            friends = friends.next;
        }
        return recommend;
    }
    
    public void printRecommend(int userID) {
        friendslangtayo recommend = getRecommendation(userID);
        System.out.println("Friend recommendations for " + userID + ": ");
        friendzone current = recommend.head;
        while (current != null) {
            System.out.println(current.userID + " ");
            current = current.next;
        }
        System.out.println();
    }
}

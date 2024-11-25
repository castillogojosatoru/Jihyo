
package finalexam;


public class FinalExam {

    class friendNode {
        int userID;
        friendNode prev;
        friendNode next;
        
        public friendNode(int ID) {
            this.userID = ID;
            this.prev = null;
            this.next = null;
        }
    }
    private class friend {
        private friendNode head = null;
        private friendNode tail = null;
        
        public void addUser(int ID) {
            friendNode fren = new friendNode(ID);
            if (head == null) {
                head = tail = fren;
            }
            else {
                tail.next = fren;
                fren.prev = tail;
                tail = fren;
            }
        }
    
    public boolean getID(int ID) {
        friendNode current = head;
        while (current != null) {
            if (current.userID == ID) {
                return true;
            }
            current = current.next;
        }
        return false;
        }
    }
    
    private friend[] users;
    
    
    
    public FinalExam(int Users) {
        users = new friend[Users];
        for (int i = 0; i < Users; i++) {
            users[i] = new friend();
        }
    }
    
    public void addFriendship(int ID1, int ID2) {
        users[ID1 - 1].addUser(ID2);
        users[ID2 - 1].addUser(ID1);
    }
    
    public friend Recommendation(int userID) {
        friend recommend = new friend();
        friend direct = users[userID - 1];
        friendNode friends = direct.head;
        
        while (friends != null) {
            friend add = users[friends.userID - 1];
            friendNode input = add.head;
            
            while (input != null) {
                int mgafriendsnicrush = input.userID;
                if (mgafriendsnicrush != userID && !direct.getID(userID) && !recommend.getID(mgafriendsnicrush)) {
                    recommend.addUser(mgafriendsnicrush);
                }
                input = input.next;
            }
            friends = friends.next;
        }
        return recommend;
    }
    
    public void print(int ID) {
        friend recommend = Recommendation(ID);
        System.out.println("Friend recommendations for " + ID + ": ");
        friendNode current = recommend.head;
        while (current != null) {
            System.out.println(current.userID + " ");
            current = current.next;
        }
        System.out.println();
    }
  }



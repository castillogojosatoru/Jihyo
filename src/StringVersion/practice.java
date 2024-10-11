/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringVersion;

/**
 *
 * @author Rhodz
 */
public class practice {
    
    class Node {
        String data;
        private Node left;
        private Node right;
        
        public Node(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public void insertNode(Node node, String data) {
        if (data.compareTo(node.data) < 0) {
            if (node.left != null) {
                insertNode(node.left, data);
            }
            else {
                System.out.println("Inserted " + data + " to the left of Node " + node.data + ".");
                node.left = new Node(data);
            }
        }
        else if (data.compareTo(node.data) > 0) {
            if (node.right != null) {
                insertNode(node.right, data);
            }
            else {
                System.out.println("Inserted " + data + " to the right of Node " + node.data + ".");
                node.right = new Node(data);
            }
        } 
    }
    
    public void display(Node node) {
        if (node != null) {
            display(node.left);
            System.out.println(node.data + " ");
            display(node.right);
        }
    }
    
    public void pre_order(Node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            pre_order(node.left);
            pre_order(node.right);
        }
    }
    
    public void in_order(Node node) {
        if (node != null) {
            in_order(node.left);
            System.out.println(node.data + " ");
            in_order(node.right);
        }
    }
    
    public void post_order(Node node) {
        if (node != null) {
            post_order(node.left);
            post_order(node.right);
            System.out.println(node.data + " ");
        }
    }
    
    public Node findParent(Node node, String data) {
        if (node == null || (node.left == null && node.right == null)) {
            return null;
        }

        if ((node.left != null && node.left.data.equals(data)) || 
            (node.right != null && node.right.data.equals(data))) {
            return node;
        }

        if (data.compareTo(node.data) < 0) {
            return findParent(node.left, data);
        } else {
            return findParent(node.right, data);
        }
    }
    
    public void printLeafNodes(Node node) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
            return;
        }

        if (node.left != null)
            printLeafNodes(node.left);

        if (node.right != null)
            printLeafNodes(node.right);
    }
    
     private Node findNode(Node node, String data) {
        if (node == null) {
            return null;
        }
        if (node.data.equals(data)) {
            return node;
        }
        if (data.compareTo(node.data) < 0) {
            return findNode(node.left, data);
        } else {
            return findNode(node.right, data);
        }
    }
    
    public void printLeafOfParent(Node node, String data) {
        Node parent = findNode(node, data);
        if (parent == null) {
            System.out.println("Parent not found.");
            return;
        }
        System.out.print("Leaf of Parent Node: ");
        printLeafNodes(parent);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaryTree;

/**
 *
 * @author Rhodz
 */
public class practice {
    
    class Node {
        int data;
        private Node left;
        private Node right;
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public void insertNode(Node node, int data) {
        if (data < node.data) {
            if (node.left != null) {
                insertNode(node.left, data);
            }
            else {
                System.out.println("Inserted " + data + " to the left of Node " + node.data + ".");
                node.left = new Node(data);
            }
        }
        else if (data > node.data) {
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
    
    public Node findParent(Node node, int data) {
        if (node == null || (node.left == null && node.right == null)) {
            return null;
        }

        if ((node.left != null && node.left.data == data) || 
            (node.right != null && node.right.data== data)) {
            return node;
        }

        if (data < node.data) {
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
    
     private Node findNode(Node node, int data) {
        if (node == null) {
            return null;
        }
        if (node.data == data) {
            return node;
        }
        if (data < node.data) {
            return findNode(node.left, data);
        } else {
            return findNode(node.right, data);
        }
    }
    
    public void printLeafOfParent(Node node, int data) {
        Node parent = findNode(node, data);
        if (parent == null) {
            System.out.println("Parent not found.");
            return;
        }
        System.out.print("Leaf of Parent Node: ");
        printLeafNodes(parent);
    }
}

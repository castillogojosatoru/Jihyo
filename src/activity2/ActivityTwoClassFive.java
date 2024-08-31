/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassFive extends ActivityTwoClassFour {
    
    public ActivityTwoClassFive(int Size) {
        super(Size);
    }
    
    public void addStack() {
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("STACK COLLECTION ADDED TO ANOTHER STACK COLLECTION: " + Stack[i]);
                stacknew.push(Stack[i]);
            }
            else {
                System.out.println("STACK IS FULL.");
            }
        }
    }
    
    public void newloopstack() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY.");
        }
        else {
            System.out.println("NEW STACK ELEMENT: ");
            int loopLimit = Math.min(top, stacknew.size() - 1);
            for (int i = 0; i <= loopLimit; i++) {
                System.out.println(stacknew.get(i));
            }
        }
    }
}

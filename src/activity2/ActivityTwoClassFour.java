/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassFour extends ActivityTwoClassThree {
    
    public ActivityTwoClassFour(int Size) {
        super(Size);
    }
    
    public double peek() {
        if (!isEmpty()) {
            return Stack[top];
        }
        else {
            System.out.println("TOP IS EMPTY.");
            return -1;
        }
    }
    public double bot() {
        if (!isEmpty()) {
            return Stack[0];
        }
        else {
            System.out.println("BOT IS EMPTY.");
            return -1;
        }
    }
}

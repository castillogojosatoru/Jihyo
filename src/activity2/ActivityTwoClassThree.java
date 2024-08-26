/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rhodz
 */
public class ActivityTwoClassThree extends ActivityTwoClassTwo {
    
    public ActivityTwoClassThree(int Size) {
        super(Size);
    }
    public void removeDup() {
        Set<Double> remove = new HashSet<>();
        int newtop = -1;
        boolean dup = false;
        for (int i = 0; i <= top; i++) {
            if (remove.contains(Stack[i])) {
                System.out.println("STACK DUPLICATED: " + Stack[i]);
                Stack[++newtop] = Stack[i];
                top = newtop;
                dup = true;
            }
            remove.add(Stack[i]);
        }
        if (dup == false) {
            System.out.println("NO DUPLICATE DETECTED.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIBONACCI;

/**
 *
 * @author Rhodz
 */
public class practice {
    public static void main(String[] args) {
        int no1 = 0;
        int no2 = 1;
        
        System.out.println(no1);
        System.out.println(no2);
        
        for(int fibo = 0; fibo < 20; fibo++) {
            int FIBO = no1 + no2;
            System.out.println(FIBO);
            no1 = no2;
            no2 = FIBO;
        }
    }
}

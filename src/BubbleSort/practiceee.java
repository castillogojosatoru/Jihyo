/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BubbleSort;

/**
 *
 * @author Rhodz
 */
public class practiceee {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 3, 5};
        int yawa = array.length;
        
        for(int bilat = 0; bilat < yawa-1; bilat++) {
            boolean oten = false;
            for(int nigga = 0; nigga < yawa-bilat-1; nigga++) {
                if(array[nigga] > array[nigga+1]) {
                    int boyset = array[nigga];
                    array[nigga] = array[nigga+1];
                    array[nigga+1] = boyset;
                    oten = true;
                }
                if(!oten) {
                    break;
                }
            }
        }
        System.out.println("Sorted array: ");
        for (int bilat = 0; bilat < yawa; bilat++) {
            System.out.println(array[bilat] + " ");
        }
        System.out.println();
    }
}

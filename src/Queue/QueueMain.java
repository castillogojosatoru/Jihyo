/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author Rhodz
 */
public class QueueMain {
    
    public static void main(String[] args) {
        
        queue QUEUE = new queue(5);
        
        QUEUE.insertData(5);
        QUEUE.insertData(10);
        QUEUE.insertData(9);
        QUEUE.insertData(6);
        
        QUEUE.queueLoop();
        System.out.println(QUEUE.peekFront());
        System.out.println(QUEUE.peekRear());
        
    }
}

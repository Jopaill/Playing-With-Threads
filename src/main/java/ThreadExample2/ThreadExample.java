/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExample2;

/**
 *
 * @author Jordash
 */
public class ThreadExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        
        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop12;

/**
 * Clase HiloR que implementa la interfaz Runnable
 * 
 * @author Janet Garcia
 */
public class HiloR implements Runnable {
    /**
     * Metodo run que define la tarea del HiloR
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion"+i+Thread.currentThread().getName());
        }
        System.out.println("Termina el"+Thread.currentThread().getName());
   }
    
    
}

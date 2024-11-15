/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop12;

/**
 * Clase Hilo que hereda de Thread 
 * @author Janet Garcia
 */
public class Hilo extends Thread {
    /**
     * Constructor vacio 
     * Asigna un nombre específico al hilo 
     * @param name 
     */
    public Hilo(String name){
       super(name);
    }
    /**
     * Método que define la tarea del Hilo 
     */
    @Override
    public /*synchronized*/ void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion"+i+"hilo"+getName());
        }
        System.out.println("Termina"+getName());
    }
    
    
    
}

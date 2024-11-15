/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop12;

/**
 * Clase principal para crear y gestionar hilos 
 * @author Janet Gracia
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Creacion de instnacias de la clase Hilo - Utilización de Thread
         */
        /*System.out.println("#### Generacion de Hilos ####");
        Hilo h1 = new Hilo("Hilo1"); 
        Hilo h2 = new Hilo("Hilo2"); 
        Hilo h3 = new Hilo("Hilo3");
        
        h1.start();
        h2.start();
        h3.start();
        
        new Hilo("Hilo4").start(); 
        new Hilo("Hilo5").start(); */
        
        /**
         * Creacion de instnacias de la clase Hilo - Utilización de Runnable
         */
        new Thread(new HiloR(), "Hilo1").start();
        new Thread(new HiloR(), "Hilo2").start();
        new Thread(new HiloR(), "Hilo3").start();
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitel;

/**
 *
 * @author user11
 */
public class Hitel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hitel_oszt h = new Hitel_oszt(0.05, 3000000,5);
        System.out.println("Visszafizetendő összeg: " + h.visszafizet());
        System.out.println("Törlesztő: "+ h.torleszto());

        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio1;

/**
 *
 * @author otorradomiguez
 */
public class Psp_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread1 t1=new Thread1("Miguel");
        Thread1 t2=new Thread1("Juan");
        t1.start();
        t2.start();
    }
    
}

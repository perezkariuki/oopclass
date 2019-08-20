/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author user
 */
public class Motorcycle extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped");
    }

    @Override
    public void gas() {
        System.out.println("Motorcycle is on gas");
    }
   
}

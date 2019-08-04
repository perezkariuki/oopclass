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
public class Bus extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Bus is Accelerating");
    }

    @Override
    void stop() {
        System.out.println("Bus has stopped");
    }

    @Override
    void gas() {
        System.out.println("Bus is gassed");
    }
 
}

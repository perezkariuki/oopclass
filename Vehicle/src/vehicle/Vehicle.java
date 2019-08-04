/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author user
 */
public abstract class Vehicle{
    abstract void accelerate();
    abstract void stop();
    abstract void gas();
 
    /**
     * @param args the command line arguments
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

public class Motorcycle extends Vehicle {

        @Override
        void accelerate() {
            System.out.println("Motorcycle is accelerating");
        }

        @Override
        void stop() {
            System.out.println("Motorcycle has stopped");
        }

        @Override
        void gas() {
            System.out.println("Motorcycle is on gas");
        }
    }

interface Automobile {
    public boolean startEngine();
    public void stopEngine();
    public float accelerate(float acc);
    public boolean turn(boolean dir);
    
}

public class Sedan extends Vehicle {

        @Override
        void accelerate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void stop() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void gas() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

public class SportsCar implements Automobile {

        @Override
        public boolean startEngine() {
            System.out.println("Start or stop engine");
        return false;
        }

        @Override
        public void stopEngine() {
        System.out.println("Engine has stopped");
        }

        @Override
        public float accelerate(float acc) {
           System.out.println("accelerating at 200km/h");
        return 0;
        }

        @Override
        public boolean turn(boolean dir) {
           System.out.println("Turn left or right");
        return false;
        }
    }

    public static void main(String[] args) {
       Vehicle Sedan = new Vehicle();
       Sedan.accelerate();
       Sedan.stop();
       Sedan.gas();
        // TODO code application logic here
    }
    
}

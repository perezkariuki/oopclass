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
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bus bus = new Bus();
       bus.accelerate();
       bus.stop();
       bus.gas();
       
       Motorcycle moto = new Motorcycle();
       moto.accelerate();
       moto.stop();
       moto.gas();
       
       Sedan seda = new Sedan();
       seda.accelerate();
       
       seda.accelerate("acceleration is 12km/h *overload*");
       
       

        // TODO code application logic here
    }
    
}

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
interface Automobile {
    public void startEngine();
    public void stopEngine();
    public float accelerate(float acc);
    public boolean turn(boolean dir);
    
}
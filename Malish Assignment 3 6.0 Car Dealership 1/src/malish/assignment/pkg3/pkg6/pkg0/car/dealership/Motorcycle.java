/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malish.assignment.pkg3.pkg6.pkg0.car.dealership;
import java.awt.Color;
/**
 *
 * @author RedPanda13
 */
public class Motorcycle extends Vehicle
{

    private static int motoCount;
    private double motoWeight;
    private String motoType;

    //construcor
    public Motorcycle(String make, String model, Color color, double purchasePrice, double askingPrice)
    {

              super(make, model, color, purchasePrice, askingPrice);
              
              motoCount++;

    }

    private void setMotoWeight(double motoWeight){this.motoWeight = motoWeight;}
    private double getMotoWeight(){return this.motoWeight;}
    
    private void setMotoType(String motoType){this.motoType = motoType;}
    private String getMotoType(){return this.motoType;} 
    

    
    //Override for Commission (Motorcycle)
    @Override
    public double commission()
    {

        return (this.getAskingPrice() * 0.20);
  
    }
}


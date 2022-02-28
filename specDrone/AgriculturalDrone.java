/**
 * @author Anh Tu Chau
 * @version 1
 */

// part: 1
// Written by: Anh Tu Chau 40207791

package assignment_249.assignment_2.specDrone;

import assignment_249.assignment_2.drone.UAV;

public class AgriculturalDrone extends UAV {
    
    private String brand;
    private int carryCapacity;

    /**
     * default constructor
     */
    public AgriculturalDrone(){
        super();
        this.brand = "UAVbrand";
        this.carryCapacity = 50;
    }

    /**
     * parametrized constructor
     * @param weight double the weight
     * @param price double the price
     * @param brand String the brand
     * @param carryCapacity int the carry capacity
     */
    public AgriculturalDrone(double weight, double price, String brand, int carryCapacity){
        super(weight, price);
        this.brand = brand;
        this.carryCapacity = carryCapacity;
    }

    /**
     * copy constructor
     * @param p the agricultural drone being copied
     */
    public AgriculturalDrone(AgriculturalDrone p){
        this.weight = p.weight;
        this.price = p.price;
        this.brand = p.brand;
        this.carryCapacity = p.carryCapacity;
    }

    //getters and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(int carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    /**
     * to String method
     * @return String the info of the agricultural drone
     */
    public String toString(){
        return "\nThis is an agricultural drone."
        +"\nThe weight is: " + weight + " lbs."
        + "\nThe price is: " + price + "$."
        + "\nThe brand is: " + brand + "."
        + "\nThe carry capacity is: " + carryCapacity + " lbs.";
    }

    /**
     * compares an agricultural drone with another object
     * @param Object the other object
     */
    public boolean equals(Object otherObject){

        if(otherObject == null){
            return false;
        }
        
        else if(getClass() != otherObject.getClass()){
            return false;
        }
        
        else{
            AgriculturalDrone otherAgriculturalDrone = (AgriculturalDrone)otherObject;
            return this.weight == otherAgriculturalDrone.weight
            && this.price == otherAgriculturalDrone.price
            && this.brand == otherAgriculturalDrone.brand
            && this.carryCapacity == otherAgriculturalDrone.carryCapacity;
        }
        
    }

    /*test driver
    public static void main(String[] args) {
        AgriculturalDrone au1 = new AgriculturalDrone();
        AgriculturalDrone au2 = new AgriculturalDrone(20, 65464, "lmnop", 50);
        AgriculturalDrone au3 = new AgriculturalDrone(au2);

        System.out.println(au1);
        System.out.println(au2);
        System.out.println(au3);

        System.out.println("------------------------");

        System.out.println(au1.equals(au2)); //false
        System.out.println(au2.equals(au3)); //true
    } */


}

package assignment_249.assignment_2.specDrone;

import assignment_249.assignment_2.drone.UAV;

public class MAV extends UAV{

    private String model;
    private double size;
    
    //default constructor
    public MAV(){
        super();
        this.model = "model 0";
        this.size = 5.0;
    }

    //parametrized constructor
    public MAV(double weight, double price, String model, double size){
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    //copy constructor
    public MAV(MAV p){
        this.weight = p.weight;
        this.price = p.price;
        this.model = p.model;
        this.size = p.size;
    }

    //getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //toString method
    public String toString(){
        return "\nThis is a MAV."
        +"\nThe weight is: " + weight + " lbs."
        + "\nThe price is: " + price + "$."
        + "\nThe model is: " + model + "."
        + "\nThe size is: " + size + " units";
    }

    //equals method
    public boolean equals(Object otherObject){

        if(otherObject == null){
            return false;
        }
        
        else if(getClass() != otherObject.getClass()){
            return false;
        }
        
        else{
            MAV otherMAV = (MAV)otherObject;
            return this.weight == otherMAV.weight
            && this.price == otherMAV.price
            && this.model == otherMAV.model
            && this.size == otherMAV.size;
        }
        
    }

    /*test driver
    public static void main(String[] args) {
        MAV m1 = new MAV();
        MAV m2 = new MAV(13, 333, "model 22", 45);
        MAV m3 = new MAV(m2);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("------------------------");

        System.out.println(m1.equals(m2)); //false
        System.out.println(m2.equals(m3)); //true
    } */

}

/**
 * @author Anh Tu Chau
 * @version 1
 */

// part: 1
// Written by: Anh Tu Chau 40207791 

package assignment_249.assignment_2.drone;

public class UAV {
    
    protected double weight;
    protected double price;

    /**
     * default constructor
     */
    public UAV(){
        this.weight = 50.0;
        this.price = 25000.0; 
    }

    /**
     * parametrized constructor
     * @param weight double the weight
     * @param price double the price
     */
    public UAV(double weight, double price){
        this.weight = weight;
        this.price = price;
    }

    /**
     * copy constructor
     * @param p the UAV being copied
     */
    public UAV(UAV p){
        this.weight = p.weight;
        this.price = p.price;
    }

    //getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * to String methodz
     * @return String of the info of the UAV
     */
    public String toString(){
        return "\nThis is a UAV."
        +"\nThe weight is: " + weight + " lbs."
        + "\nThe price is: " + price + "$.";
    }

    /**
     * compares a UAV with another object
     * @param Object the other object
     * @return boolean of the equality
     */
    public boolean equals(Object otherObject){

        if(otherObject == null){
            return false;
        }
        
        else if(getClass() != otherObject.getClass()){
            return false;
        }
        
        else{
            UAV otherUAV = (UAV)otherObject;
            return this.weight == otherUAV.weight
            && this.price == otherUAV.price;
        }
        
    }

    /*test driver
    public static void main(String[] args) {
        UAV u1 = new UAV();
        UAV u2 = new UAV(25, 150);
        UAV u3 = new UAV(u2);

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        System.out.println("------------------------");

        System.out.println(u1.equals(u2)); //false
        System.out.println(u2.equals(u3)); //true
    } */


}

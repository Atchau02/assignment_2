/**
 * @author Anh Tu Chau
 * @version 1
 */

// part: 1
// Written by: Anh Tu Chau 40207791

package assignment_249.assignment_2.copter;

public class Quadcopter extends Helicopter {
    
    private int maxFlyingSpeed;

    /**
     * default constructor
     */
    public Quadcopter(){
        super();
        this.maxFlyingSpeed = 7500;
    }

    /**
     * parametrized constructor
     * @param brand String the brand
     * @param price double the price
     * @param horsepower int the horsepower
     * @param cylinders int nmb of cylinders
     * @param creationYear int year of creation
     * @param passengerCapacity int the passenger capacity
     * @param maxFlyingSpeed int the max flying speed
     */
    public Quadcopter(String brand, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed){
        super(brand, price, horsepower, cylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    /**
     * copy constructor
     * @param p the quadcopter that is being copied
     */
    public Quadcopter(Quadcopter p){
        setBrand(p.getBrand());
        setPrice(p.getPrice());
        setHorsepower(p.getHorsepower());
        this.cylinders = p.cylinders;
        this.creationYear = p.creationYear;
        this.passengerCapacity = p.passengerCapacity;
        this.maxFlyingSpeed = p.maxFlyingSpeed;
    }

    //getter and setter
    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    /**
     * to String method
     * @return the info of the quadcopter
     */
    public String toString(){
        return "\nThis is a quadcopter."
        +"\nThe brand is: " + getBrand() + "."
        + "\nThe price is: " + getPrice() + "$."
        + "\nThe horsepower is: " + getHorsepower() + "."
        + "\nThe nb of cylinders is: " + cylinders + "."
        + "\nThe creation year is: " + creationYear + "."
        + "\nThe passenger capacity is: " + passengerCapacity + "."
        + "\nThe max flying speed is: " + maxFlyingSpeed + " km/h.";
    }

    /**
     * Compares a quadcopter and another object
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
            Quadcopter otherQuadcopter = (Quadcopter)otherObject;
            return getBrand() == otherQuadcopter.getBrand()
            && getPrice() == otherQuadcopter.getPrice()
            && getHorsepower() == otherQuadcopter.getHorsepower()
            && this.cylinders == otherQuadcopter.cylinders
            && this.creationYear == otherQuadcopter.creationYear
            && this.passengerCapacity == otherQuadcopter.passengerCapacity
            && this.maxFlyingSpeed == otherQuadcopter.maxFlyingSpeed;
        }

    }

    /* test driver
    public static void main(String[] args) {
        Quadcopter q1 = new Quadcopter();
        Quadcopter q2 = new Quadcopter("QWER", 56, 75, 2, 1234, 800, 912);
        Quadcopter q3 = new Quadcopter(q2);

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);

        System.out.println("------------------------");

        System.out.println(q1.equals(q2)); //false
        System.out.println(q2.equals(q3)); //true
    } */

}

package assignment_249.assignment_2.copter;

import assignment_249.assignment_2.Plane.Airplane;

public class Helicopter extends Airplane {
    
    protected int cylinders;
    protected int creationYear;
    protected int passengerCapacity;

    //default constructor
    public Helicopter(){
        super();
        this.cylinders = 6;
        this.creationYear = 2022;
        this.passengerCapacity = 8;
    }

    //parametrized constructor
    public Helicopter(String brand, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity){
        super(brand, price, horsepower);
        this.cylinders = cylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }

    //copy constructor
    public Helicopter(Helicopter p){
        setBrand(p.getBrand());
        setPrice(p.getPrice());
        setHorsepower(p.getHorsepower());
        this.cylinders = p.cylinders;
        this.creationYear = p.creationYear;
        this.passengerCapacity = p.passengerCapacity;
    }

    //getters and setters
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    //toString method
    public String toString(){
        return "\nThe brand is: " + getBrand() + "."
        + "\nThe price is: " + getPrice() + "."
        + "\nThe horsepower is: " + getHorsepower() + "."
        + "\nThe nb of cylinders is: " + cylinders + "."
        + "\nThe creation year is: " + creationYear + "."
        + "\nThe passenger capacity is: " + passengerCapacity + ".";
    }

    //equals method
    public boolean equals(Helicopter otheHelicopter){

        if(otheHelicopter == null){
            return false;
        }
        
        else if(getClass() != otheHelicopter.getClass()){
            return false;
        }
        
        else{
            return getBrand() == otheHelicopter.getBrand()
            && getPrice() == otheHelicopter.getPrice()
            && getHorsepower() == otheHelicopter.getHorsepower()
            && this.cylinders == otheHelicopter.cylinders
            && this.creationYear == otheHelicopter.creationYear
            && this.passengerCapacity == otheHelicopter.passengerCapacity;
        }
    
    }

    /* test driver
    public static void main(String[] args) {
        Helicopter h1 = new Helicopter();
        Helicopter h2 = new Helicopter("LMAO", 50, 25, 7, 2000, 10);
        Helicopter h3 = new Helicopter(h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        System.out.println("------------------------");

        System.out.println(h1.equals(h2)); //false
        System.out.println(h2.equals(h3)); //true
    } */

}

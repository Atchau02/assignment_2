package assignment_249.assignment_2.multi;

import assignment_249.assignment_2.copter.Helicopter;

public class Multirotor extends Helicopter {

    private int rotors;

    //default constructor
    public Multirotor(){
        super();
        this.rotors = 8;
    }

    //parametrized constructor
    public Multirotor(String brand, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity, int rotors){
        super(brand, price, horsepower, cylinders, creationYear, passengerCapacity);
        this.rotors = rotors;
    }

    //copy constructor
    public Multirotor(Multirotor p){
        setBrand(p.getBrand());
        setPrice(p.getPrice());
        setHorsepower(p.getHorsepower());
        setCylinders(p.getCylinders());
        setCreationYear(p.getCreationYear());
        setPassengerCapacity(p.getPassengerCapacity());
        this.rotors = p.rotors;
    }
    
    //getter and setter
    public int getRotors() {
        return rotors;
    }

    public void setRotors(int rotors) {
        this.rotors = rotors;
    }

    //toString method
    public String toString(){
        return "\nThis is a multirotor."
        +"\nThe brand is: " + getBrand() + "."
        + "\nThe price is: " + getPrice() + "$."
        + "\nThe horsepower is: " + getHorsepower() + "."
        + "\nThe nb of cylinders is: " + getCylinders() + "."
        + "\nThe creation year is: " + getCreationYear() + "."
        + "\nThe passenger capacity is: " + getPassengerCapacity() + "."
        + "\nThe number of rotors is: " + rotors + ".";
    }

   //equals method
   public boolean equals(Multirotor otherMultirotor){

        if(otherMultirotor == null){
            return false;
        }
        
        else if(getClass() != otherMultirotor.getClass()){
            return false;
        }
        
        else{
            return getBrand() == otherMultirotor.getBrand()
            && getPrice() == otherMultirotor.getPrice()
            && getHorsepower() == otherMultirotor.getHorsepower()
            && getCylinders() == otherMultirotor.getCylinders()
            && getCreationYear() == otherMultirotor.getCreationYear()
            && getPassengerCapacity()== otherMultirotor.getPassengerCapacity()
            && this.rotors == otherMultirotor.rotors;
        }

    }

    /*test driver
    public static void main(String[] args) {
        Multirotor m1 = new Multirotor();
        Multirotor m2 = new Multirotor("ZXCV", 15, 23, 54, 1999, 50, 78);
        Multirotor m3 = new Multirotor(m2);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("------------------------");

        System.out.println(m1.equals(m2)); //false
        System.out.println(m2.equals(m3)); //true
    } */
    
}

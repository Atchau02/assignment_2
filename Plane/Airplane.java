package assignment_249.assignment_2.Plane;

public class Airplane {

    private String brand;
    private double price;
    private int horsepower;
    
    //default constructor
    public Airplane(){
        brand = "Boeing";
        price = 10000000;
        horsepower = 50000;
    }

    //parametrized constructor
    public Airplane(String brand, double price, int horsepower){
        this.brand = brand;
        this.price = price;
        this.horsepower = horsepower;
    }

    //copy constructor
    public Airplane(Airplane p){
        this.brand = p.brand;
        this.price = p.price;
        this.horsepower = p.horsepower;
    }

    //getters and setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    //toString method
    public String toString(){
        return "\nThis is a plane."
        +"\nThe brand is: " + brand + "."
        + "\nThe price is: " + price + "$."
        + "\nThe horsepower is: " + horsepower + ".";
    }

    //equals method
    public boolean equals(Airplane otherAirplane){

        if(otherAirplane == null){
            return false;
        }
        
        else if(getClass() != otherAirplane.getClass()){
            return false;
        }
        
        else{
            return this.brand == otherAirplane.brand
            && this.price == otherAirplane.price
            && this.horsepower == otherAirplane.horsepower;
        }
        
    }
    
    /* test driver
    public static void main(String[] args) {
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane("ASDF", 5000.0, 50);
        Airplane a3 = new Airplane(a2);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("------------------------");

        System.out.println(a1.equals(a2)); //false
        System.out.println(a2.equals(a3)); //true
    } */

}


package assignment_249.assignment_2;
import assignment_249.assignment_2.Plane.Airplane;
import assignment_249.assignment_2.copter.*;
import assignment_249.assignment_2.drone.*;
import assignment_249.assignment_2.multi.*;
import assignment_249.assignment_2.specDrone.*;

public class driverPart1 {

    private static void findLeastAndMostExpensiveUAV(){

    }

    public static void main(String[] args) {
        
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane("ASDF", 5000.0, 50);
        Airplane a3 = new Airplane(a2);

        Helicopter h1 = new Helicopter();
        Helicopter h2 = new Helicopter("LMAO", 50, 25, 7, 2000, 10);
        Helicopter h3 = new Helicopter(h2);

        Quadcopter q1 = new Quadcopter();
        Quadcopter q2 = new Quadcopter("QWER", 56, 75, 2, 1234, 800, 912);
        Quadcopter q3 = new Quadcopter(q2);

        Multirotor m1 = new Multirotor();
        Multirotor m2 = new Multirotor("ZXCV", 15, 23, 54, 1999, 50, 78);
        Multirotor m3 = new Multirotor(m2);

        UAV u1 = new UAV();
        UAV u2 = new UAV(25, 150);
        UAV u3 = new UAV(u2);

        AgriculturalDrone ag1 = new AgriculturalDrone();
        AgriculturalDrone ag2 = new AgriculturalDrone(20, 65464, "lmnop", 50);
        AgriculturalDrone ag3 = new AgriculturalDrone(ag2);

        MAV ma1 = new MAV();
        MAV ma2 = new MAV(13, 333, "model 22", 45);
        MAV ma3 = new MAV(ma2);

        //printing out info
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(ag1);
        System.out.println(ag2);
        System.out.println(ag3);
        System.out.println(ma1);
        System.out.println(ma2);
        System.out.println(ma3);

        System.out.println("---------------------------------------------------");
        System.out.println("Equality of a1(airplane) and h1(helicopter) is : " + a1.equals(otherAirplane));
        

    }
    
}
package assignment_249.assignment_2;
import assignment_249.assignment_2.Plane.Airplane;
import assignment_249.assignment_2.copter.*;
import assignment_249.assignment_2.drone.*;
import assignment_249.assignment_2.multi.*;
import assignment_249.assignment_2.specDrone.*;


public class driverPart2 {

    public static Object[] copyFlyingObjects(Object[] theArray){
        
        
        Object[] copyArray = new Object[theArray.length];

        /*not possible using copy constructors without knowing the type of the object
        for(int i = 0; i < copyArray.length; i++){
            copyArray[i] = new (theType) (theArray[i]);
        }*/

        // not using copy constructors
        for(int i = 0; i < copyArray.length; i++){
            copyArray[i] = theArray[i];
        }

        return copyArray;
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
        
        AgriculturalDrone ag1 = new AgriculturalDrone();
        AgriculturalDrone ag2 = new AgriculturalDrone(20, 65464, "lmnop", 50);
        AgriculturalDrone ag3 = new AgriculturalDrone(ag2);

        MAV ma1 = new MAV();
        MAV ma2 = new MAV(13, 333, "model 22", 45);

        Object[] arrayWithUAV = {a1,a2,a3,h1,h2,h3,q1,q2,q3,m1,m2,m3,u1,u2,ag1,ag2,ma1,ma2};
        
        Object[] theCopy = copyFlyingObjects(arrayWithUAV);

        System.out.println("This is the original array.");
        for(int i = 0; i < arrayWithUAV.length; i++){
            System.out.println(arrayWithUAV[i]);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("\nThis is the copy array.");
        for(int i = 0; i < theCopy.length; i++){
            System.out.println(theCopy[i]);
        }
        
    }
    
}

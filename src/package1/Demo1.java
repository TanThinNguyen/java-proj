package package1;

import package2.*;

public class Demo1 {
    public static void main(String[] args) {
        //Bicycle bc = new Bicycle(5, 30);
        MountainBike mb = new MountainBike(3, 35, 10);

        //System.out.println(bc.toString());
        System.out.println(mb.toString());
        System.out.println("-----------------------------------");

        mb.applyBrake(10);
        System.out.println(mb.toString());
        System.out.println("-----------------------------------");
        
        mb.speedUp(25);
        System.out.println(mb.toString());
    }
}
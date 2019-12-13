package package1;

import package3.*;

public class Demo2 {
    public static void main(String[] args) {
        Lecturer lt = new Lecturer("Java", 19, 1.99f, "BKU");
        lt.getInfo();
        System.out.println("-----------------------------------");

        lt.setHeight(2.14f);
        lt.setUniversityName("HCMUS");
        lt.setLevel(Lecturer.Level.HIGH);
        lt.getInfo();
        System.out.println("-----------------------------------");

        Lecturer lt1 = new Lecturer("C++", 20, 2.01f, "UIT", Lecturer.Level.MEDIUM);
        lt1.getInfo();
        System.out.println("-----------------------------------");

        lt1.setLevel(Lecturer.Level.LOW);
        lt1.setUniversityName("PTIT");
        lt1.getInfo();
    }
}
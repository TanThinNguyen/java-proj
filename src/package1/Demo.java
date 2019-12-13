package package1;

import package2.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("HelloJava");
        Person.sayHello();
        System.out.println(Person.country); // country là biến static, đươc gọi trực tiếp từ class

        Person ps1 = new Person("Nguyễn", 19, 1.71f);
        Person ps2 = new Person("Ja", 20);

        ps1.getInfo();
        ps1.eat("Noodle");
        ps2.getInfo();
        ps2.eat("Pizza");

        System.out.println("Num of person: " + Person.numOfPer);
        
        // Person ps3 = ps1.getInstance();
        // System.out.println(ps1);
        // System.out.println(ps3);
        System.out.println("-----------------------------------");


        Student st1 = new Student("Geeks", 21, 1.81f, "HCMUS");
        st1.setAge(50);
        st1.getInfo();
        
        float[] grades = {2.3f, 4.5f, 3.6f};
        st1.setGrades(grades);
        System.out.print("Grades: ");
        st1.displayGrades();

        st1.eat("Pho", "Bun");
        System.out.println("Num of person: " + Student.numOfPer);   // System.out.println(Person.numOfPer);
    }
}
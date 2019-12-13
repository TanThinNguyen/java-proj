package package3;

public class Animal {
    public static void main(String[] args) {
        // Pig và Dog là 2 class implement interface AnimalAct
        Pig pig = new Pig();
        Dog dog = new Dog();
        
        // static field được gọi bằng static way thông qua tên interface
        System.out.println(AnimalAct.type);
        pig.animalSound();
        pig.sleep();
        pig.run();

        dog.animalSound();
        dog.sleep();

    }
}

// Interface theo một cách đầy đủ là 1 "abstract class",
// nó dùng để nhóm những method (ko có body) có liên quan với nhau
// Interface ko chứa constructer bới interface ko dùng để tạo object
// Để truy cập imterface methods, interface phải được implements bởi class khác
// Phần body của interface method được định nghĩa ở "implement" class
// Giống abstract class, interface ko thể tạo object
interface AnimalAct {
    // Methods của interface mặc định là public asbtract method và ko có phần body
    void animalSound();
    void sleep();

    // Attributes của interface mặc định là public static final và được khai báo giá trị
    String type = "Animal";
}

interface OtherAnimalAct {
    void run();
}

// Một class có thể implement nhiều interface, tên các interface cách nhau bởi dấu phẩy
// Đây là hình thức thay thế cho multiple inheritance,
// trong java một class chỉ inherit duy nhất 1 superclass
class Pig implements AnimalAct, OtherAnimalAct {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("ZzZzZ");
    }

    public void run() {
        System.out.println("The pig is running");
    }
}

class Dog implements AnimalAct {
    public void animalSound() {
        System.out.println("The dog says: gau gau");
    }

    public void sleep() {
        System.out.println("zZz");
    }
}
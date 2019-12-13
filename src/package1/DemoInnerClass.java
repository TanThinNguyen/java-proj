package package1;

// Một file .java có thể chứa nhiều class nhưng chỉ có 1 public class và nó trùng tên của file
class OuterClass {
    public int a = 3;

    public void sayHello() {
        System.out.println("Hello");
    }

    // Không giống class thông thường chỉ có 2 access modifier là public và default,
    // inner class còn có thêm private và protected
    // khi inner class là private thì không thể truy cập từ hàm main
    class InnerClass {
        public int b = 9;

        public void sayHi() {
            System.out.print("Hi");
            // Sử dụng method của outer class
            sayHello();
        }

        // inner class có thể truy cập attributes và methods của outer class
        public int sum() {
            return  a + b;
        }
    }

    // static inner class, chúng ta có thể truy cập, tạo đối tượng của innerclass mà không cần tạo đối tượng của outer class
    static class OtherInnerClass {
        public int c = 10;
    }
}

public class DemoInnerClass {
    public static void main(String[] args) {
        // Tạo object của static inner class
        OuterClass.OtherInnerClass other = new OuterClass.OtherInnerClass();
        System.out.println("c: " + other.c);

        //Để tạo object cho inner class, ta tạo object của outer class trước
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        System.out.println("a: " + outer.a);
        System.out.println("b: " + inner.b);
        outer.sayHello();
        inner.sayHi();
        System.out.println("a + b = " + inner.sum());
    }
}
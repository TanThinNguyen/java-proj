package package2;

public class Person {
    public String name;
    private int age;
    public float height;

    // Các biến static được sử dụng chung cho tất cả đối tượng của lớp,
    // có thể được gọi mà ko cần tạo đối tượng
    public static int numOfPer;
    public static String country;

    // Khối static, dùng để khởi tạo các biến static,
    // nó được chạy khi class được load vào bộ nhớ
    static {
        numOfPer = 0;
        country = "Vietnam";
    }

    // Khai báo constructor, code được tái sử dụng nhờ từ khóa this
    public Person(String name) {
        this.name = name;
        numOfPer++;
    }
    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
    public Person(String name, int age, float height) {
        this(name, age);
        this.height = height;
    }

    // Phương thức tĩnh, thuộc về bản thân lớp, có thể gọi mà ko cần tạo đối tượng
    public static void sayHello() {
        System.out.print("Hello");
    }
    
    // Từ khóa final giúp cho phương thức này ko bị ghi đè ở lớp kế thừa lớp Person
    public final void eat(String foodName) {
        System.out.println(name + " is eating " + foodName);
    }

    // Overloading, phương thức này có chung tên với phương thức trên,
    // nhưng khác nhau về tham số
    public final void eat(String foodName1, String foodName2) {
        System.out.println(name + " is eating " + foodName1 + " and " + foodName2);
    }

    /**
     * Setter và Getter là 2 phương thức dùng để cập nhật và lấy ra giá trị
     * thuộc tính, đặc biệt dành cho thuộc tính ở phạm vi private
     */

    /**
     * Cú pháp sử dụng setter
    public void set<tên thuộc tính> (tham số giá trị mới) {
        this.<tên thuộc tính> = <tham số giá trị mới>;
    }
     */

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }

    public void setAge(long age) {
        if (age >= 0 && age <= 100) {
            this.age = (int)age;
        }
    }

    public void setHeight(float height) {
        if (height > 0) {
            this.height = height;
        }
    }

    /**
     * Cú pháp sử dụng getter
    public <kiểu dữ liệu của thuộc tính> get<tên thuộc tính>() {
        return this.<tên thuộc tính>
    }
     */

    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    // Trả về kiểu dữ liệu tham chiếu dạng [tên lớp]@[vị trí lưu trữ]
    public Person getInstance() {
        return this;
    }

    // Hàm tạo ra 1 bản sao của đối tượng và trả về giá trị tham chiếu.
    public Object clone() {
        Person ps = new Person(this.name, this.age, this.height);
        return ps;
    }
}
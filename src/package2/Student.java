package package2;

public class Student extends Person {
    // class Student kế thừa thuộc tính và phương thức của class Person,
    // bổ sung thêm thuộc tính universityName, grades của riêng class Student
    public String universityName;
    private float[] grades;

    // Từ khóa super giúp ta gọi lại constructor của class Person,
    // bổ sung thêm lệnh nhập universityName
    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    // Hàm clone tạo ra bản sao. Điều này giúp cho đảm bảo giá trị của biến 
    // tham chiếu grades ko bị thay đổi
    public void setGrades(float[] grades) {
        this.grades = grades.clone();
    }

    public float[] getGrades() {
        return this.grades.clone();
    }

    // Từ khóa super giúp ta gọi lại method của class Person,
    // bổ sung thêm lệnh in universityName.
    // Đây gọi là overriding (ghi đè), đối tượng của class Student sẽ gọi phương
    // thức getInfo của class Student thay vì của class Person
    public void getInfo() {
        super.getInfo();
        System.out.println("University name: " + this.universityName);
    }

    public void displayGrades() {
        for (float elem : this.grades) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public Object clone() {
        // Vì age có modifier là private nên phải dùng method getAge để truy cập giá trị của nó
        Student st = new Student(this.name, this.getAge(), this.height, this.universityName);
        return st;
    }
}
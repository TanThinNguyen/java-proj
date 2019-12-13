package package3;

// enum giống class, có thể có attributes và methods,
// điểm khác duy nhất là enum constants là public static final (ko bị thay đổi, override)
// enum ko dùng để tạo object, ko thể kế thừa class khác, nhưng có thể implement interface
// enum đc dùng khi có các dữ liệu ko thay đổi như ngày, tháng, màu sắc, số lượng thẻ card,...

// Khi enum khai báo ở ngoài class thì ko có từ khóa public
enum Quality {
    BAD,
    GOOD,
    EXCELLENT
}

// Lecturer kế thừa abstract class People
public class Lecturer extends People {
    // enum là special "class", nó biểu diễn 1 group các constants (ko thể thay đổi, giống final variables)
    // Nếu khai báo enum với modifier là default thì class khác package ko thể sử dụng được
    // Các constants trong enum được cách nhau bởi dấu phẩy và nên ghi in toàn bộ
    // enum lầ viết gọn của enumerations, nghĩa là "specifically listed" (được liệt kê cụ thể)
    public enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    private String universityName;
    private Level level;

    public Lecturer(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    public Lecturer(String name, int age, float height, String universityName, Level level) {
        this(name, age, height, universityName);
        this.level = level;
    }

    // static method của class, nó thuộc về class
    public static Lecturer initDefault() {
        Lecturer lt = new Lecturer("Nguyen", 19, 1.71f, "HCMUS", Level.MEDIUM);
        return lt;
    }

     // Method .values() của enum trả về mảng các enum constants, đc dùng trong vòng foreach
     public static void showQualityList() {
        for (Quality var : Quality.values()) {
            System.out.println(var);
        }
    }

    public static void showLevelList() {
        for (Level var : Level.values()) {
            System.out.println(var);
        }
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getUniversityName() {
        return this.universityName;
    }

    public Level getLevel() {
        return this.level;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("UniversityName: " + this.universityName);
        System.out.println("Level: " + this.level);
    }

    // Override lại abstract method ở abstract class People
    public Object _clone() {
        Lecturer lt = new Lecturer(this.name, this.age, this.height, this.universityName);
        return lt;
    }
}

// Kiểm tra phạm vi truy cập tới enum Level và Quality
class Test {
    // Nếu đã import package3.Lecturer.Level; thì chỉ cần ghi Level l = Level.MEDIUM;
    Lecturer.Level lv = Lecturer.Level.MEDIUM;
    Quality qual = Quality.GOOD;
}
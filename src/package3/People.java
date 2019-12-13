package package3;

// Abstract class ko thể tạo đối tượng,
// chỉ nêu ra những thứ chung nhất cho các class khác kế thừa
// Abstract class có thể chứa đồng thời regular methods và abstract methods
public abstract class People {
    protected String name;
    protected int age;
    protected float height;

    public People(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Height: " + this.height);
    }

    // Abstract class chỉ được dùng trong abstract class, nó ko chứa body,
    // body được cung cấp ở subclass
    public abstract Object _clone();
}
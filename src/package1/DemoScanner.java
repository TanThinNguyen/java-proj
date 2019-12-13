package package1;

import java.util.Scanner;
import package3.*;
import package3.Lecturer.Level;

public class DemoScanner {
    public static void main(String[] args) {
        // Tạo đối tượng của lớp Scanner để sử dụng các phương thức của class
        Scanner input = new Scanner(System.in);

        Lecturer lt = new Lecturer(null, 0, 0, null, Level.MEDIUM);

        System.out.print("Input your name: ");
        // method nextLine() để đọc nguyên dòng
        lt.setName(input.nextLine());

        System.out.print("Input your age: ");
        lt.setAge(input.nextInt());

        System.out.print("Input your height: ");
        lt.setHeight(input.nextFloat());
        input.nextLine();

        System.out.print("Input your university name: ");
        // Nếu dùng input.nextLine() sẽ bị ảnh hưởng từ kí tự "\n" của lần nhập trước,
        // kết quả là chtr bỏ qua việc nhập university name

        // Dùng input.next() như sau sẽ ko bị lỗi trên
        // lt.setUniversityName(input.nextLine());

        // Một cách khác là thêm dòng input.nextLine(); vào ngay sau lệnh nhập chiều cao,
        // lệnh đó sẽ "nhận lấy" kí tự "\n" rồi ta có thể nhập university name như bth
        lt.setUniversityName(input.nextLine());

        // Xuất các thông tin đã ghi được
        System.out.println("-- Student info --");
        lt.getInfo();

        // Demo statci method của class Lecturer
        System.out.println("-- Student info --");
        Lecturer lt1 = Lecturer.initDefault();
        lt1.getInfo();

        System.out.println("-- Level List --");
        Lecturer.showLevelList();
        System.out.println("-- Quality List --");
        Lecturer.showQualityList();
    
        // hủy đối tượng khi ko sử dụng nữa
        input.close();
    }
}
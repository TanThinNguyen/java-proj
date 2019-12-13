package package4;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // ArrayList lưu items theo 1 danh sách có thứ tự,
        // các phần tử được truy cập qua chỉ số (index) kiểu int
        ArrayList<String> cars = new ArrayList<String>();
        // .add() để thêm phần tử
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Ford");
        // In toàn bộ array list
        System.out.println(cars);
        // .size() để lấy kích thước 
        System.out.println("Size: " + cars.size());
        System.out.println("---------------------------------");

        // .get() để truy cập phần tử
        System.out.println("Index 1: " + cars.get(1));

        // .set() để thay đổi giá trị phần tử
        cars.set(0, "Toyota");
        // Lặp qua các phần từ dùng for hoặc for each
        for (String var : cars) {
            System.out.print(var + " ");
        }
        System.out.println("\n---------------------------------");

        // .remove() để xóa phần tử
        cars.remove(0);
        System.out.print("Remove 0: ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        // .clear() để xóa toàn bộ phần từ
        cars.clear();
        System.out.print("Remove all: ");
        System.out.println(cars);
    }
}
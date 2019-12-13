package package4;

import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        // HashMap lưu trữ items theo cặp key/value, phần tử có thể truy cập thông qua
        // index có thể là kiểu int hoặc String (ở ArrayList thì index là kiểu int)
        // Trong cặp index/value, một object được dùng làm key tới một object khác,
        // đó có thể là căp String key và int value, hoặc là String key và String value

        // Tạo một HashMap lưu String key và String value
        HashMap<String, String> capitalCities =  new HashMap<String, String>();
        // Dùng .put() để thêm cặp key/value
        capitalCities.put("England", "London");
        capitalCities.put("Vietnam", "Hanoi");
        capitalCities.put("France", "Paris");
        capitalCities.put("USA", "Washington DC");
        System.out.println("HashMap: " + capitalCities);
        System.out.println("Size: " + capitalCities.size());

        // Truy cập phần tử qua .get(<key>)
        System.out.println("Value of key England: " + capitalCities.get("England"));

        // Lặp qua HashMap dùng .keySet() để trả về mảng các key của hashmap
        System.out.print("Keys: ");
        for (String var : capitalCities.keySet()) {
            System.out.print(var + " ");
        }
        System.out.println();
        // Lặp qua HashMap dùng .values() để trả về mảng các value của hashmap
        System.out.print("Values: ");
        for (String var : capitalCities.values()) {
            System.out.print(var + " ");
        }
        System.out.println();

        // 
        System.out.println("--------------------------------\nHashMap:");
        for (String var : capitalCities.keySet()) {
            System.out.println(" " + var + ":" + capitalCities.get(var));
        }

        // Xóa phần tử qua .remove(<key>)
        capitalCities.remove("England");
        // Xóa toàn bộ phần tử bằng .clear()
        capitalCities.clear();
        if (capitalCities.isEmpty()) {
            System.out.println("HashMap is now empty");
        }
        else {
            System.out.println(capitalCities);
        }
        
        /**
         * wrapped classes
         * int      Integer
         * double   Double
         * float    Float
         * char     Character
         * bool     Boolean
         */
        
    }
}
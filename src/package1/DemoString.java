package package1;

public class DemoString {
    public static void main(String[] args) {
        // Demo String methods
        String greeting = "Hello \'Java\' VSCode";
        System.out.println("String: " + greeting + ", lenght: " + greeting.length());
        // Viết hoa/thường tất cả
        System.out.println("UpperCase: " + greeting.toUpperCase());
        System.out.println("LowerCase: " + greeting.toLowerCase());

        // Tìm chuỗi con xuất hiện trong chuỗi
        String java = "Java";
        System.out.println("Index of Java in string: " + greeting.indexOf(java));
        
        // Nối chuỗi (concatenation)
        System.out.println("String after concatenation: " + greeting.concat(" world") + ", lenght: " + greeting.length());
        
    }
}
package package1;

public class DemoArray {
    public static void main(String[] args) {
        // 1-ldimensional arrays
        String[] day = { "Sunday", "Saturday", "Monday"};
        System.out.println("Array: day, length: " + day.length);
        for (String i : day) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Mutildimensional arrays
        int[][] matrix = { {2, 4, 5, 8}, {1, 6}, {3, 4, 6} };
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
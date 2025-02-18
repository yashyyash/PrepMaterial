public class RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            // Outer loop controls the number of rows
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Use print instead of println
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

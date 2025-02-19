public class PatternCombined {
    public static void main(String[] args) {
        System.out.println("This is a Rightangled traiangle \n");
        RightAngleTriangle();
        System.out.println("\nThis is a Rightangled traiangle with increasing number\n");
        IncreaseNumberTriangle();
        System.out.println("\nThis is a Inverted Rightangled traiangle with increasing number\n");
        InvertedRightAngleTriangle();
    }

    public static void RightAngleTriangle() {
        int row , col;  
        // i want triangle having 5 rows and 5 columns
        // row 1 ---> 1 row , 1 col
        for ( row = 1; row <= 5 ; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void IncreaseNumberTriangle() {
        int row , col;  
        // i want triangle having 5 rows and 5 columns
        // row 1 ---> 1 row , 1 col
        for ( row = 1; row <= 5 ; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void InvertedRightAngleTriangle(){
        int row , col, space,totalrow = 5;
        for (row = 1; row <=5; row++) {
            for (space = 1; space <= totalrow-row; space++){
                System.out.print(" ");
            }
            for (col = 1; col<= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        
        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
        } else {
            int spaces = rows / 2;
            int stars = 1;
            
            // Upper half of the diamond
            for (int i = 0; i < rows / 2 + 1; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
                spaces--;
                stars += 2;
            }
            
            // Lower half of the diamond
            spaces = 1;
            stars = rows - 2;
            for (int i = 0; i < rows / 2; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
                spaces++;
                stars -= 2;
            }
        }
        
        scanner.close();
    }
}
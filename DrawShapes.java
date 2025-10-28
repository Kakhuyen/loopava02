import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            // Hiển thị menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (corner at 4 different angles)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // In hình chữ nhật
                    System.out.print("Enter rectangle height: ");
                    int rectHeight = input.nextInt();
                    System.out.print("Enter rectangle width: ");
                    int rectWidth = input.nextInt();

                    for (int i = 1; i <= rectHeight; i++) {
                        for (int j = 1; j <= rectWidth; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // In tam giác vuông ở 4 góc
                    int size = 5; // Kích thước mặc định
                    System.out.println("Square triangle with bottom-left corner:");
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nSquare triangle with top-left corner:");
                    for (int i = size; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nSquare triangle with bottom-right corner:");
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size - i; j++) {
                            System.out.print("  "); // Khoảng trắng
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nSquare triangle with top-right corner:");
                    for (int i = size; i >= 1; i--) {
                        for (int j = 1; j <= size - i; j++) {
                            System.out.print("  "); // Khoảng trắng
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // In tam giác cân
                    System.out.print("Enter the height of isosceles triangle: ");
                    int isoHeight = input.nextInt();

                    for (int i = 1; i <= isoHeight; i++) {
                        for (int j = 1; j <= isoHeight - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("No choice! Please select from 0 to 3.");
            }
        }

        input.close();
    }
}

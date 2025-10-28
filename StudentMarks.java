import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng (tối đa 30)
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);

        // Nhập điểm cho các sinh viên
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // In danh sách điểm và đếm số sinh viên thi đỗ
        int count = 0;
        System.out.print("List of marks: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }

        System.out.println("\nThe number of students passing the exam is: " + count);

        scanner.close();
    }
}

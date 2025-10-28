import java.util.Scanner;

public class FindMaxProperty {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng (tối đa 20)
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        // Nhập giá trị cho mảng
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        // In ra danh sách phần tử
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();

        // Tìm giá trị lớn nhất và vị trí
        int max = array[0];
        int index = 1; // Vị trí bắt đầu từ 1
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("The largest property value in the list is " + max + ", at position " + index);

        scanner.close();
    }
}

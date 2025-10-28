import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        // Khởi tạo mảng sinh viên
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", 
                             "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        // Nhập tên sinh viên cần tìm
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String input_name = scanner.nextLine();

        // Duyệt mảng để tìm kiếm
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the student in the list " + input_name + " is: " + i);
                isExist = true;
                break; // Dừng khi tìm thấy
            }
        }

        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list.");
        }

        scanner.close();
    }
}

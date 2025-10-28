import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Enter a: ");
        a = input.nextInt();

        System.out.print("Enter b: ");
        b = input.nextInt();

        // Trả về giá trị tuyệt đối
        a = Math.abs(a);
        b = Math.abs(b);

        // Kiểm tra điều kiện
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else {
            // Tìm ước số chung lớn nhất bằng phương pháp trừ dần
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }

            // In ra kết quả
            System.out.println("Greatest common factor: " + a);
        }

        input.close();
    }
}

import java.util.Scanner;

public class Calculateinterestrate {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        Scanner input = new Scanner(System.in);

        // Nhập số tiền gửi
        System.out.print("Enter investment amount: ");
        money = input.nextDouble();

        // Nhập số tháng gửi
        System.out.print("Enter number of months: ");
        month = input.nextInt();

        // Nhập lãi suất năm (%)
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();

        // Tính tổng lãi
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12;
        }

        // In ra kết quả
        System.out.println("Total of interest: " + totalInterest);

        input.close();
    }
}

package BT;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        try {
            int number1 = scanner.nextInt();

            System.out.print("Nhập số nguyên thứ hai: ");
            int number2 = scanner.nextInt();

            // Tính tổng của hai số
            int sum = number1 + number2;

            // Hiển thị tổng
            System.out.println("Tổng của hai số là: " + sum);
        } catch (Exception e) {
            System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên.");
        }
    }
}

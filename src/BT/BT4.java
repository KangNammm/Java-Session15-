package BT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Tạo danh sách số nguyên
        List<Integer> list = new ArrayList<>();

        // Duyệt chuỗi và ép kiểu từng phần tử về Integer
        for (int i = 0; i < input.length(); i++) {
            try {
                list.add(Integer.parseInt(input.charAt(i) + ""));
            } catch (NumberFormatException e) {
                System.out.println("Có 1 ký tự không phải số nguyên, được thay thế bằng 0.");
                list.add(0);
            }
        }

        // Hiển thị danh sách số nguyên
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

package BT;

public class BT3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 3, 40, 50};

        // Tạo biến lưu tổng của mảng
        int sum = 0;

        // Duyệt mảng và cộng các phần tử hợp lệ
        for (int i = 0; i < array.length; i++) {
            try {
                sum += array[i];
            } catch (Exception e) {
                System.out.println("Lỗi: Phần tử thứ " + i + " không phải số nguyên.");
            }
        }

        // Hiển thị tổng
        System.out.println("Tổng của mảng là: " + sum);
    }
}

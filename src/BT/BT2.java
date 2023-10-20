package BT;

public class BT2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // Kiểm tra xem mảng có phần tử nào không
        if (array.length == 0) {
            throw new RuntimeException("Mảng rỗng");
        }

        // Tìm số lớn nhất trong mảng
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }

        // Hiển thị số lớn nhất
        System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
    }
}

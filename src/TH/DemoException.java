package TH;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
       try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào 2 số : ");
            System.out.println("Nhập số a : ");
            Integer a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số b : ");
            Integer b = Integer.parseInt(scanner.nextLine());
            System.out.println(" a / b = " + a / b);
        } catch (ArithmeticException e){
           System.out.println("Không thể chia cho 0.");
       } catch (NumberFormatException e){
           System.out.println("Dữ liệu nhập vào không phải số.");
       }

    }
}

import java.util.Scanner;

public class Th4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm các số nguyên tố nhỏ hơn số: ");
        int a;
        while (true) {
            try{
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e){
                System.out.print("Vui lòng nhập số nguyên: ");
            }
        }
        for (int i = 1; i < a; i++) {
            int m = 0;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    m = 1;
                }
            }
            if (m == 0) {
                System.out.print(i+" ");
            }
        }
    }
}

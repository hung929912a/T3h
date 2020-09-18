import java.util.Scanner;

public class Th2 {
    public static void main(String[] args) {
        int a,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần tính giai thừa: ");
        a = Integer.parseInt(sc.nextLine());
        if (a==0) {
            System.out.printf("Giai thừa của %d là: %d",a,0);
        } else {
            for (int i = 1; i <= a; i++) {
                b*=i;
            }
            System.out.printf("Giai thừa của %d là: %d",a,b);
        }
    }
}

package Th1;

import java.util.Scanner;

public class Th1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Th1 th1 = new Th1();
        while (true) {
            System.out.println("1. Giải pt bậc nhất");
            System.out.println("2. Giải pt bậc 2");
            System.out.println("3. Thoát");
            System.out.println("**************");
            System.out.println();
            System.out.print("Vui lòng chọn chức năng: ");
            int choose;
            while (true) {
                try{
                    choose = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e){
                    System.out.print("Vui lòng nhập số nguyên: ");
                }
            }
            switch (choose) {
                case 1:
                    double a,b;
                    System.out.print("Nhập a: ");
                    a = th1.checkDou(sc);
                    System.out.print("Nhập b: ");
                    b = th1.checkDou(sc);
                    System.out.printf("ax = b \n=> x = %f",b/a);
                    System.out.println();
                    break;
                case 2:
                    double a2,b2,c2,dt;
                    System.out.print("Nhập a: ");
                    a2 = th1.checkDou(sc);
                    System.out.print("Nhập b: ");
                    b2 = th1.checkDou(sc);
                    System.out.print("Nhập c: ");
                    c2 = th1.checkDou(sc);
                    dt = (b2*b2) - 4*(a2*c2);
                    if (dt >0) {
                        System.out.printf("Phương trình có 2 nghiệm phân biệt: " +
                                "x1 = %f\t x2 = %f\n",(-b2+Math.sqrt(dt))/2*a2, (-b2-Math.sqrt(dt))/2*a2);
                    } else if(dt ==0) {
                        System.out.printf("Phương trình có nghiệm kép: x1=x2= %f\n",(-b2/2*a2));
                    } else {
                        System.out.println("pt vô nghiệm");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
    public double checkDou(Scanner sc) {
        double x;
        while (true) {
            try{
                x = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e){
                System.out.print("Vui lòng nhập số: ");
            }
        }
        return x;
    }
}

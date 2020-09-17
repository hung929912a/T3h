package pland;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    static List<KhachHang> kh = new ArrayList<>();
    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn cần nhập bao nhiêu người: ");
        int nguoi = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nguoi; i++) {
            System.out.printf("Nhập thông tin người thứ %d:",i+1);
            KhachHang khachHang = new KhachHang();
            khachHang.inputData();
            kh.add(khachHang);
        }
        for (int i = 0; i < kh.size(); i++) {
            System.out.printf("Người thứ: %d\n",i+1);
            kh.get(i).displayData();
        }
        for (KhachHang x: kh) {
            sum +=x.getTongTien();
        }
        System.out.println();
        System.out.println();
        System.out.printf("Tổng tiền thu được từ chuyến bay là: %f",sum);
        System.out.println();
    }


}

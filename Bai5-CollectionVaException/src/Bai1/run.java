package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        run bai1 = new run();
        Scanner sc = new Scanner(System.in);
        List<SinhVien> svList = new ArrayList<>();
        while (true) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Thoát");
            System.out.println("************MENU************");
            System.out.println();
            System.out.println("Vui lòng chọn  chức năng");
            int x = bai1.checkInt(sc);
            switch (x) {
                case 1:
                    System.out.print("Bạn muốn nhập bao nhiêu hs: ");
                    int n = bai1.checkInt(sc);
                    for (int i = 0; i < n; i++) {
                        SinhVien sv = new SinhVien();
                        sv.inputData(sc);
                        svList.add(sv);
                    }
                    Collections.sort(svList);
                    for (SinhVien e: svList) {
                        e.displayData();
                    }
                    break;
                case 2:
                    System.out.print("Nhập Id cần xóa: ");
                    while (true) {
                        String str = sc.nextLine();
                        int k = 0;
                        for (int i = 0; i < svList.size(); i++) {
                            if (svList.get(i).getSudentId().equals(str)) {
                                svList.remove(i);
                                k=1;
                            }
                        }
                        if (k==1) {
                            System.out.println("Đã xóa");
                            break;
                        }else {
                            System.out.print("Id không đúng vui lòng nhập lại: ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Đã thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn 1-3");
                    break;
            }
        }
    }
    private int checkInt(Scanner sc) {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập số nguyên: ");
            }
        }
        return n;
    }
}

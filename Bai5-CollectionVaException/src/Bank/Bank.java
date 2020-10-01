package Bank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {
    public static void main(String args[]){
        Queue<Customer> queue = new LinkedList<>();
        Customer cus = new Customer();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Khác Hàng");
            System.out.println("2. Nhân viên");
            System.out.println("3. Thoát");
            System.out.println("**********MENU************");
            System.out.println();
            System.out.print("Vui lòng chọn chức năng: ");
            int x = cus.checkIn(sc);
            switch (x) {
                case 1:
                    System.out.print("Có bao nhiêu khách hàng đăng ký: ");
                    int n = cus.checkIn(sc);
                    for (int i = 0; i < n; i++) {
                        Customer cus1 = new Customer();
                        cus1.inputData(sc);
                        queue.add(cus1);
                    }
                    System.out.println("Danh sách khác hàng: ");
                    System.out.printf("%10s %10s\n","Tên","cmnd");
                    for (Customer f: queue) {
                        System.out.printf("%10s %10d\n",f.getName(),f.getCmnd());
                    }
                    break;
                case 2:
                    System.out.print("Bạn có muốn phục vụ khách hàng(true/false): ");
                    while (true) {
                        String str = sc.nextLine();
                        if (str.equals("true") || str.equals("false")) {
                            if (str.equals("true")) {
                                for (Customer f: queue) {
                                    System.out.println(f.toString());
                                }
                                break;
                            }
                            if (str.equals("false")) {
                                break;
                            }
                        }else {
                            System.out.println("Nhập true or false");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Đã thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn từ 1-3");
                    break;
            }
        }
    }
    public void checkStatus(Scanner sc) {
        while (true) {
            System.out.print("Nhập trạng thái: ");
            String str = sc.nextLine();
            if (str.equals("true") || str.equals("false")) {
                break;
            }else {
                System.out.println("Nhập true or false");
            }
        }
    }
}

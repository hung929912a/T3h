package Bank;

import java.util.Scanner;

public class Customer {
    private String Name;
    private int cmnd;

    public Customer() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void inputData(Scanner sc) {
        System.out.print("Vui lòng nhập tên: ");
        this.Name = sc.nextLine();
        System.out.print("Vui lòng nhập cmnd: ");
        this.cmnd = checkIn(sc);
    }

    public int checkIn(Scanner sc) {
        int x;
        while (true) {
            try{
                x = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Vui lòng nhập số nguyên: ");
            }
        }
        return x;
    }

    @Override
    public String toString() {
        return "Khác hàng: " + "Name='" + Name + " Đã phục vụ";
    }
}

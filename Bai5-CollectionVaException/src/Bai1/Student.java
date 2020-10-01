package Bai1;

import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String sudentId;
    private String name;

    public SinhVien() {
    }

    public String getSudentId() {
        return sudentId;
    }

    public void setSudentId(String sudentId) {
        this.sudentId = sudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputData(Scanner sc) {
        System.out.print("Nhập Id: ");
        this.sudentId = sc.nextLine();
        System.out.print("Nhập tên: ");
        this.name = sc.nextLine();
    }

    public void displayData() {
        System.out.printf("Mã sv: %s\t Tên sv: %s\n",this.sudentId, this.name);
    }

    @Override
    public int compareTo(SinhVien o) {
        return getSudentId().compareTo(o.getSudentId());
    }
}

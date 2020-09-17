package pland;

import java.util.Scanner;

public class KhachHang extends VeMayBay{
    private String hoTen;
    private boolean sex;
    private int age;
    private String tenChuyenBay;
    private int thoiGianBay;
    private int soLuongVe;
    private double tongTien;


    public KhachHang() {
    }

    public KhachHang(double caoCap, double thuongGia, double trungCap, String hoTen, boolean sex, int age,
                     String tenChuyenBay, int thoiGianBay, int soLuongVe, double tongTien) {
        super(caoCap, thuongGia, trungCap);
        this.hoTen = hoTen;
        this.sex = sex;
        this.age = age;
        this.tenChuyenBay = tenChuyenBay;
        this.thoiGianBay = thoiGianBay;
        this.soLuongVe = soLuongVe;
        this.tongTien = tongTien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTenChuyenBay() {
        return tenChuyenBay;
    }

    public void setTenChuyenBay(String tenChuyenBay) {
        this.tenChuyenBay = tenChuyenBay;
    }

    public int getThoiGianBay() {
        return thoiGianBay;
    }

    public void setThoiGianBay(int thoiGianBay) {
        this.thoiGianBay = thoiGianBay;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    private int g = 0;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        double giave = 0;
        System.out.println();
        System.out.println("0. caoCap: 10000\t 1. thuongGia: 50000\t 2.trungCap: 20000");
        System.out.print("Vui lòng chọn loại vé: ");
        int [] arr = {10000,5000,2000};
        int x = Integer.parseInt(sc.nextLine());
        this.g = x;
        giave = this.chonVe(giave, g);
        System.out.print("Nhập tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        this.sex =  Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập tuổi: ");
        giave = this.checkTuoi(giave,g);
        System.out.print("Tên chuyến Bay: ");
        this.tenChuyenBay = sc.nextLine();
        System.out.print("Thời gian bay(0-23): ");
        this.thoiGianBay = Integer.parseInt(sc.nextLine());
        giave = this.checkTime(this.getThoiGianBay(), giave, x);
        System.out.print("Số lượng vé: ");
        this.soLuongVe = Integer.parseInt(sc.nextLine());
        this.tongTien = giave*this.soLuongVe;
        System.out.println();
    }

    public double checkTime(int thoiGianBay, double giave, int x) {
        if (thoiGianBay >= 20 && thoiGianBay <= 23 || thoiGianBay <= 4) {
            giave *=0.5;
        } else {
            giave = giave;
        }
        return giave;
    }

    public double chonVe(double giave, int x) {
        int[] arr = {10000, 5000, 2000};
        Scanner sc = new Scanner(System.in);
        if (x >= 0 && x <= 2) {
            giave = arr[x];
        } else {
            while (true) {
                System.out.print("Vui lòng chọn lại cho 0-2: ");
                x = sc.nextInt();
                this.g = x;
                if (x >= 0 && x <= 2) {
                    giave = arr[x];
                    break;
                }
            }
        }
        return giave;
    }

    public double checkTuoi(double giave, int m) {
        Scanner sc = new Scanner(System.in);
        double x;
        int tuoi = Integer.parseInt(sc.nextLine());
        this.age = tuoi;
        if (m==2) {
            if(age < 6) {
                giave = giave*0.2;
            }
        }else {
            giave = giave;
        }
        return giave;
    }
    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", tenChuyenBay='" + tenChuyenBay + '\'' +
                ", thoiGianBay=" + thoiGianBay +
                ", soLuongVe=" + soLuongVe +
                ", tongTien=" + tongTien +
                '}';
    }
    //    private String hoTen;
//    private boolean sex;
//    private int age;
//    private String tenChuyenBay;
//    private int thoiGianBay;
//    private int soLuongVe;
//    private double tongTien;
    public void displayData() {
        System.out.printf("Họ Tên: %s\t Giới tình: %b\t Tuổi: %d\t Tên chuyền bay: %s\n",this.hoTen,
                this.sex,this.age,this.tenChuyenBay);
        System.out.printf("Số Lượng vé: %d\t Tổng tiền: %f" ,this.soLuongVe,this.tongTien);
    }
}

package pland;

public class VeMayBay {
    private double caoCap = 10000;
    private double thuongGia = 5000;
    private double trungCap = 2000;

    public VeMayBay() {
    }

    public VeMayBay(double caoCap, double thuongGia, double trungCap) {
        this.caoCap = caoCap;
        this.thuongGia = thuongGia;
        this.trungCap = trungCap;
    }

    public double getCaoCap() {
        return caoCap;
    }

    public void setCaoCap(double caoCap) {
        this.caoCap = caoCap;
    }

    public double getThuongGia() {
        return thuongGia;
    }

    public void setThuongGia(double thuongGia) {
        this.thuongGia = thuongGia;
    }

    public double getTrungCap() {
        return trungCap;
    }

    public void setTrungCap(double trungCap) {
        this.trungCap = trungCap;
    }
}

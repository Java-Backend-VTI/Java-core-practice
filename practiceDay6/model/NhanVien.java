import java.time.LocalDate;

public abstract class NhanVien implements NhanSu {

    private String maSo;
    private String hoTen;
    private LocalDate ngayVaoLam;
    private PhongBan phongBan;
    private double heSoLuong;

    public NhanVien(String maSo, String hoTen, LocalDate ngayVaoLam, PhongBan phongBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngayVaoLam = ngayVaoLam;
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return String.format(
                "Ma so: %s | Ho ten: %s | Ngay vao lam: %s | Phong ban: %s | He so luong: %.2f",
                maSo,
                hoTen,
                ngayVaoLam != null ? ngayVaoLam.toString() : "Chua co",
                phongBan != null ? phongBan : "Chua co",
                heSoLuong);
    }

    public void tangLuongThamNien() {
        if (ngayVaoLam != null) {
            int namHienTai = LocalDate.now().getYear();
            int namVaoLam = ngayVaoLam.getYear();
            int thamNien = namHienTai - namVaoLam;
            if (thamNien > 5) {
                heSoLuong *= 1.1;
            }
        }
    }

}

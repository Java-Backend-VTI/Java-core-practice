import java.time.LocalDate;

public class QuanLyDuAn extends NhanVien {
    private double luongTrachNhiem;
    private int soDuAnDaHoanThanh;

    public QuanLyDuAn(String maSo, String hoTen, LocalDate ngayVaoLam, PhongBan phongBan, double heSoLuong,
                      double luongTrachNhiem, int soDuAnDaHoanThanh) {
        super(maSo, hoTen, ngayVaoLam, phongBan, heSoLuong);
        this.luongTrachNhiem = luongTrachNhiem;
        this.soDuAnDaHoanThanh = soDuAnDaHoanThanh;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public int getSoDuAnDaHoanThanh() {
        return soDuAnDaHoanThanh;
    }

    public void setSoDuAnDaHoanThanh(int soDuAnDaHoanThanh) {
        this.soDuAnDaHoanThanh = soDuAnDaHoanThanh;
    }

    @Override
    public String layTenChucVu() {
        return "Quan ly du an";
    }

    @Override
    public double tinhLuongThucLanh() {
        return (getHeSoLuong() * 15000000) + (getSoDuAnDaHoanThanh() * 50000) + getLuongTrachNhiem();
    }

}

import java.time.LocalDate;

public class LapTrinhVien extends NhanVien {
    private int soGioOvertime;

    public LapTrinhVien(String maSo, String hoTen, LocalDate ngayVaoLam, PhongBan phongBan, double heSoLuong,
            int soGioOvertime) {
        super(maSo, hoTen, ngayVaoLam, phongBan, heSoLuong);
        this.soGioOvertime = soGioOvertime;
    }

    public int getSoGioOvertime() {
        return soGioOvertime;
    }

    public void setSoGioOvertime(int soGioOvertime) {
        this.soGioOvertime = soGioOvertime;
    }

    @Override
    public String layTenChucVu() {
        return "Lap trinh vien";
    }

    @Override
    public double tinhLuongThucLanh() {
        return (getHeSoLuong() * 15000000) + (getSoGioOvertime() * 50000);
    }

}

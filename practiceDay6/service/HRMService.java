import java.util.List;
import java.util.ArrayList;

public class HRMService {
    private List<NhanVien> nhanViens = new ArrayList<>();

    public List<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(List<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public void themNhanVien(NhanVien nv) {
        nhanViens.add(nv);
    }

    public void hienThiTatCa() {
        for (NhanVien nhanVien : nhanViens) {
            nhanVien.toString();
        }
    }

    public NhanVien timTheoMa(String ma) {
        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien.getMaSo().equals(ma.trim())) {
                return nhanVien;
            }
        }
        return null;
    }

    public double tinhLuongTrungBinh() {
        if (nhanViens.isEmpty()) {
            return 0;
        }

        double tongLuong = 0;
        for (NhanVien nv : nhanViens) {
            tongLuong += nv.tinhLuongThucLanh();
        }

        return tongLuong / nhanViens.size();
    }
}
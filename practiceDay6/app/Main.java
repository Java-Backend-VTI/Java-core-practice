import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HRMService hrmService = new HRMService();

        LapTrinhVien ltv1 = new LapTrinhVien("NV01", "Nguyen Van A", LocalDate.of(2020, 1, 10),
                PhongBan.IT, 2.0, 10);
        LapTrinhVien ltv2 = new LapTrinhVien("NV02", "Tran Thi B", LocalDate.of(2021, 5, 10),
                PhongBan.IT, 1.8, 5);
        QuanLyDuAn qlda1 = new QuanLyDuAn("NV03", "Le Van C", LocalDate.of(2015, 1, 10),
                PhongBan.IT, 2.5, 3000000, 8);

        hrmService.themNhanVien(ltv1);
        hrmService.themNhanVien(ltv2);
        hrmService.themNhanVien(qlda1);

        System.out.println("Danh sach nhan vien:");
        for (NhanVien nv : hrmService.getNhanViens()) {
            System.out.println(nv);
        }

        String maTim = "NV02";
        NhanVien nvTim = hrmService.timTheoMa(maTim);
        System.out.println("\nKet qua tim kiem ma " + maTim + ":");
        if (nvTim != null) {
            System.out.println(nvTim);
        } else {
            System.out.println("Khong tim thay nhan vien voi ma " + maTim);
        }

        double luongTB = hrmService.tinhLuongTrungBinh();
        System.out.println("\nLuong trung binh cua nhan vien: " + luongTB);
    }
}

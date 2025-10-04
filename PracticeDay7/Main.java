import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static int tinhTongSoChiaHetCho3() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static boolean kiemTraTuoiHopLe(int age) {
        if (age < 0 || age > 120) {
            throw new InvalidParameterException("Tuoi khong hop le");
        }
        return true;
    }

    public static void thucHienPhepChia(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("So b khong doc phep bang 0");
        }
    }

    public static void layGiaTriTheoChiMuc(int chiMuc, int[] mangSo) {
        try {
            System.out.println(mangSo[chiMuc]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Khong tim thay chi muc tuong ung");
        }
    }

    public static void chuyenDoiChuoiThanSo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot chuoi so: ");
        String chuoi = sc.nextLine();
        try {
            int so = Integer.parseInt(chuoi);
            System.out.println("So la: " + so);
        } catch (NumberFormatException e) {
            System.out.println("Chuoi ban nhap khong phai la so nguyen");
        }
    }

    public static void chayVaDonTaiNguyen() {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Nhap mot so: ");
            int number = sc.nextInt();

            int result = number / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Chia 0 khong hop le");
        } finally {
            if (sc != null) {
                sc.close();
                System.out.println("Dong scanner");
            }
        }
    }

    public static void chayNhieuCatch() {
        Scanner chuoi = new Scanner(System.in);
        try {
            System.out.print("Nhap so dau tien: ");
            String chuoi1 = chuoi.nextLine();
            System.out.print("Nhap so thu hai: ");
            String chuoi2 = chuoi.nextLine();

            int a = Integer.parseInt(chuoi1);
            int b = Integer.parseInt(chuoi2);

            int result = a / b;
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void kiemTraTuoi(int tuoi) throws InvalidAgeException {
        if (tuoi < 0 || tuoi > 150) {
            throw new InvalidAgeException("Tuoi Khong hop le: " + tuoi);
        } else {
            System.out.println("Tuoi hop le " + tuoi);
        }
    }

    public static void main(String[] args) {
        // System.out.println("kiem tra co debug tren vscode hay ko?");
        // int result = tinhTongSoChiaHetCho3();
        // System.out.println("Ket qua la: " + result);

        // Scanner numberInputScanner = new Scanner(System.in);
        // System.out.println("Nhap tuoi cua ban: ");

        // try {
        // int age = numberInputScanner.nextInt();
        // System.out.println(kiemTraTuoiHopLe(age));
        // } catch (InputMismatchException e) {
        // System.out.println("Tuoi phai la so. Vui long nhap lai\n");
        // } catch (InvalidParameterException e) {
        // System.out.println(e.getMessage());
        // } finally {
        // System.out.println("Hoan thanh");
        // }

        int[] mang = new int[5];
        layGiaTriTheoChiMuc(5, mang);

        chuyenDoiChuoiThanSo();

        chayVaDonTaiNguyen();

        chayNhieuCatch();

        try {
            kiemTraTuoi(200);
            kiemTraTuoi(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}

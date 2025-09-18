import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeDay2Exercise2 {
    public static void main(String[] args) {
        /*
         * Question 1:
         * Khai báo 1 số nguyên = 5 và sử dụng lệnh System.out.printf để in ra số
         */
        int num1 = 5;
        System.out.printf("Số nguyên là: %d\n", num1);

        /*
         * Question 2:
         * Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System.out.printf để in
         * ra số nguyên đó thành định dạng như sau: 100,000,000
         */
        int num2 = 100_000_000;
        System.out.printf("Số nguyên có định dạng: %,d\n", num2);

        /*
         * Question 3:
         * Khai báo 1 số thực = 5,567098 và sử dụng lệnh System.out.printf để in ra số
         * thực đó chỉ bao gồm 4 số đằng sau
         */
        double num3 = 5.567098;
        System.out.printf("Số thực 4 chữ số thập phân: %.4f\n", num3);

        /*
         * Question 4:
         * Khai báo Họ và tên và in ra theo định dạng
         */
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.\n", fullName);

        /*
         * Question 5:
         * Lấy thời gian bây giờ và in ra theo định dạng: 24/04/2020 11h:16p:20s
         */
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH'h':mm'p':ss's'");
        System.out.println("Thời gian hiện tại: " + sdf.format(now));

        /*
         * Question 6:
         * In ra thông tin account theo định dạng table
         * Giả sử mình tạo sẵn vài account đơn giản
         */
        class Account {
            int id;
            String email;
            String fullName;

            Account(int id, String email, String fullName) {
                this.id = id;
                this.email = email;
                this.fullName = fullName;
            }
        }

        Account[] accounts = {
                new Account(1, "NguyenVanA@gmail.com", "Nguyễn Văn A"),
                new Account(2, "NguyenVanB@gmail.com", "Nguyễn Văn B"),
                new Account(3, "NguyenVanC@gmail.com", "Nguyễn Văn C"),
        };

        System.out.println("\n-------------------Question 6-------------------");
        System.out.printf("%-5s | %-25s | %-20s\n", "ID", "Email", "Full Name");
        System.out.println("-------------------------------------------------------------");
        for (Account acc : accounts) {
            System.out.printf("%-5d | %-25s | %-20s\n", acc.id, acc.email, acc.fullName);
        }
    }
}

import java.time.LocalDate;

public class PracticeDay2Exercise1 {
    public static void main(String[] args) {
        // === Department ===
        Department d1 = new Department();
        d1.id = 1;
        d1.name = "IT";

        Department d2 = new Department();
        d2.id = 2;
        d2.name = "HR";

        Department d3 = new Department();
        d3.id = 3;
        d3.name = "EDU";

        // === Position ===
        Position p1 = new Position();
        p1.id = 1;
        p1.name = PositionEnum.DEV;

        Position p2 = new Position();
        p2.id = 2;
        p2.name = PositionEnum.TEST;

        Position p3 = new Position();
        p3.id = 3;
        p3.name = PositionEnum.SCRUM;

        // === Account ===
        Account a1 = new Account();
        a1.id = 1;
        a1.username = "nhat";
        a1.email = "nhat@mail.com";
        a1.fullname = "Nhat Nguyen";
        a1.department = d1;
        a1.position = p1;
        a1.createdDate = LocalDate.now();

        Account a2 = new Account();
        a2.id = 2;
        a2.username = "na";
        a2.email = "na@mail.com";
        a2.fullname = "Na Nguyen";
        a2.department = d2;
        a2.position = p2;
        a2.createdDate = LocalDate.now();

        Account a3 = new Account();
        a3.id = 3;
        a3.username = "quyen";
        a3.email = "quyen@mail.com";
        a3.fullname = "Quyen Nguyen";
        a3.department = d3;
        a3.position = p3;
        a3.createdDate = LocalDate.now();

        // === Group ===
        Group g1 = new Group();
        g1.id = 1;
        g1.name = "Backend Team";
        g1.creator = a1;
        g1.createdAt = LocalDate.now();
        g1.members = new Account[] { a1, a2 };

        Group g2 = new Group();
        g2.id = 2;
        g2.name = "Frontend Team";
        g2.creator = a2;
        g2.createdAt = LocalDate.now();
        g2.members = new Account[] { a2, a3 };

        Group g3 = new Group();
        g3.id = 3;
        g3.name = "DevOps Team";
        g3.creator = a3;
        g3.createdAt = LocalDate.now();
        g3.members = new Account[] { a1, a3 };

        /*
         * Question 1:
         * Kiểm tra account thứ 2
         * Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
         * "Nhân viên này chưa có phòng ban"
         * Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
         */
        System.out.println("-------------------Question 1-------------------\n");
        if (a2.department == null) {
            System.out.println("Nhân viên này chua có phong ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + a2.department.name);
        }

        /*
         * Question 2:
         * Kiểm tra account thứ 2
         * Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
         * Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text
         * "Group của nhân viên này là Java Fresher, C# Fresher"
         * Nếu có mặt trong 3 Group thì sẽ in ra text
         * "Nhân viên này là người quan trọng, tham gia nhiều group"
         * Nếu có mặt trong 4 group trở lên thì sẽ in ra text
         * "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
         */
        System.out.println("\n-------------------Question 2-------------------\n");
        int count = 0;
        String group1 = "";
        String group2 = "";
        String group3 = "";

        if (g1.members[0] == a2 || g1.members[1] == a2) {
            count++;
            group1 = g1.name;
        }

        if (g2.members[0] == a2 || g2.members[1] == a2) {
            count++;
            group2 = g2.name;
        }

        if (g3.members[0] == a2 || g3.members[1] == a2) {
            count++;
            group3 = g3.name;
        }

        if (count == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (count == 1 || count == 2) {
            System.out.println("Group của nhân viên này là " + group1 + " " + group2 + " " + group3);
        } else if (count == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

        /*
         * Question 3:
         * Sử dụng toán tử ternary để làm Question 1
         */
        System.out.println("\n-------------------Question 3-------------------\n");
        System.out.println(a2.department == null ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + a2.department.name);

        /*
         * Question 4:
         * Sử dụng toán tử ternary để làm yêu cầu sau:
         * Kiểm tra Position của account thứ 1
         * Nếu Position = Dev thì in ra text "Đây là Developer"
         * Nếu không phải thì in ra text "Người này không phải là Developer"
         */
        System.out.println("\n-------------------Question 4-------------------\n");
        System.out.println(
                a1.position.name == PositionEnum.DEV ? "Đây là Developer" : "Người này không phải là Developer");
        /*
         * Question 5:
         * Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
         * Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
         * Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
         * Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
         * Còn lại in ra "Nhóm có nhiều thành viên"
         */
        System.out.println("\n-------------------Question 5-------------------\n");
        int soLuongThanhVien = g1.members.length;
        switch (soLuongThanhVien) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }

        /*
         * Question 6:
         * Sử dụng switch case để làm lại Question 2
         */
        System.out.println("\n-------------------Question 6-------------------\n");
        switch (count) {
            case 0:
                System.out.println("Nhân viên này chưa có group");

                break;
            case 1:
                System.out.println("Group của nhân viên này là " + group1 + " " + group2 + " " + group3);
                break;
            case 2:
                System.out.println("Group của nhân viên này là " + group1 + " " + group2 + " " + group3);
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
        /*
         * Question 7:
         * Sử dụng switch case để làm lại Question 4
         */
        System.out.println("\n-------------------Question 7-------------------\n");
        switch (a1.position.name) {
            case PositionEnum.DEV:
                System.out.println("Đây là Developer");
                break;
            case PositionEnum.SCRUM:
                System.out.println("Đây là SCRUM Master");
                break;
            case PositionEnum.TEST:
                System.out.println("Đây là TESTer");
                break;
            default:
                System.out.println("Người này không phải là người thuộc team DEV");
                break;
        }

        /*
         * Question 8:
         * In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
         */
        System.out.println("\n-------------------Question 8-------------------\n");
        Account[] accounts = { a1, a2, a3 };
        for (Account account : accounts) {
            System.out.println("Email: " + account.email
                    + " | FullName: " + account.fullname
                    + " | Department: " + (account.department != null ? account.department.name
                            : "Nhân viên này chưa có phòng ban"));
        }

        /*
         * Question 9:
         * In ra thông tin các phòng ban bao gồm: id và name
         */
        System.out.println("\n-------------------Question 9-------------------\n");
        Department[] departments = { d1, d2, d3 };
        for (Department dept : departments) {
            System.out.println("Department ID: " + dept.id + " | Name: " + dept.name);
        }

        /*
         * Question 10:
         * In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
         * họ theo định dạng như sau:
         * Thông tin account thứ 1 là:
         * Email: NguyenVanA@gmail.com
         * Full name: Nguyễn Văn A
         * Phòng ban: Sale
         * Thông tin account thứ 2 là:
         * Email: NguyenVanB@gmail.com
         * Full name: Nguyễn Văn B
         * Phòng ban: Marketting
         */
        System.out.println("\n-------------------Question 10-------------------\n");
        for (int i = 0; i < accounts.length; i++) {
            Account acc = accounts[i];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
        }

        /*
         * Question 11:
         * In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
         * Thông tin department thứ 1 là:
         * Id: 1
         * Name: Sale
         * Thông tin department thứ 2 là:
         * Id: 2
         * Name: Marketing
         */
        System.out.println("\n-------------------Question 11-------------------\n");
        for (int i = 0; i < departments.length; i++) {
            Department dept = departments[i];
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + dept.id);
            System.out.println("Name: " + dept.name + "\n");
        }

        /*
         * Question 12:
         * Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
         */
        System.out.println("\n-------------------Question 12-------------------\n");
        for (int i = 0; i < accounts.length; i++) {
            if (i == 2) {
                break;
            }
            Account acc = accounts[i];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
        }

        /*
         * Question 13:
         * In ra thông tin tất cả các account ngoại trừ account thứ 2
         */
        System.out.println("\n-------------------Question 13-------------------\n");
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) {
                continue;
            }
            Account acc = accounts[i];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
        }

        /*
         * Question 14:
         * In ra thông tin tất cả các account có id < 4
         */
        System.out.println("\n-------------------Question 14-------------------\n");
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) {
                continue;
            }
            Account acc = accounts[i];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;

            if (acc.id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + acc.email);
                System.out.println("Full name: " + acc.fullname);
                System.out.println("Phòng ban: " + deptName + "\n");
            }
        }

        /*
         * Question 15:
         * In ra các số chẵn nhỏ hơn hoặc bằng 20
         */
        System.out.println("\n-------------------Question 15-------------------\n");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        /*
         * Question 16:
         * Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
         * lệnh break, continue
         */
        System.out.println("\n-------------------Question 16-------------------\n");
        int i = 0;
        while (i < accounts.length) {
            Account acc = accounts[i];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
            i++;
        }

        i = 0;
        while (i < departments.length) {
            Department dept = departments[i];
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + dept.id);
            System.out.println("Name: " + dept.name + "\n");
            i++;
        }

        i = 0;
        while (i < accounts.length) {
            if (i == 2) {
                break;
            }
            Account acc = accounts[i];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
            i++;
        }

        i = 0;
        while (i < accounts.length) {
            if (i == 1) {
                i++;
                continue;
            }
            Account acc = accounts[i];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
            i++;
        }

        i = 0;
        while (i < accounts.length) {
            Account acc = accounts[i];
            if (acc.id < 4) {
                String deptName = (acc.department == null)
                        ? "Chưa có phòng ban"
                        : acc.department.name;

                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + acc.email);
                System.out.println("Full name: " + acc.fullname);
                System.out.println("Phòng ban: " + deptName + "\n");
            }
            i++;
        }

        i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        /*
         * Question 17:
         * Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
         * lệnh break, continue
         */
        System.out.println("\n-------------------Question 16-------------------\n");
        int j = 0;
        do {
            Account acc = accounts[j];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;
            System.out.println("Thông tin account thứ " + (j + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
            j++;
        } while (j < accounts.length);

        j = 0;
        do {
            Department dept = departments[j];
            System.out.println("Thông tin department thứ " + (j + 1) + " là:");
            System.out.println("Id: " + dept.id);
            System.out.println("Name: " + dept.name + "\n");
            j++;
        } while (j < departments.length);

        j = 0;
        do {
            if (j == 2) {
                break;
            }
            Account acc = accounts[j];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;
            System.out.println("Thông tin account thứ " + (j + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
            j++;
        } while (j < accounts.length);

        j = 0;
        do {
            if (j == 1) {
                j++;
                continue;
            }
            Account acc = accounts[j];
            String deptName = (acc.department == null)
                    ? "Chưa có phòng ban"
                    : acc.department.name;
            System.out.println("Thông tin account thứ " + (j + 1) + " là:");
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullname);
            System.out.println("Phòng ban: " + deptName + "\n");
            j++;
        } while (j < accounts.length);

        j = 0;
        do {
            Account acc = accounts[j];
            if (acc.id < 4) {
                String deptName = (acc.department == null)
                        ? "Chưa có phòng ban"
                        : acc.department.name;

                System.out.println("Thông tin account thứ " + (j + 1) + " là:");
                System.out.println("Email: " + acc.email);
                System.out.println("Full name: " + acc.fullname);
                System.out.println("Phòng ban: " + deptName + "\n");
            }
            j++;
        } while (j < accounts.length);

        j = 0;
        do {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        } while (j <= 20);
    }
}
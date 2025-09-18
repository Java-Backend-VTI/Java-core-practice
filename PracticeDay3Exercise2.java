import java.time.LocalDate;

public class PracticeDay3Exercise2 {
    public static void main(String[] args) {
        
        Account[] accounts = new Account[5];
        for (int index = 0; index < accounts.length; index++) {
            Account account = new Account();
            account.email = "user" + index + "@gmail.com";
            account.username = "username " + index;
            account.fullname = "fullname " + index;
            account.createdDate = LocalDate.now();

            accounts[index] = account;
        }

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].fullname + "\n");
        }
    }
}
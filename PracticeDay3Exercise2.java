import java.time.LocalDate;

import entity.Account;

public class PracticeDay3Exercise2 {
    public static void main(String[] args) {

        Account[] accounts = new Account[5];
        for (int index = 0; index < accounts.length; index++) {
            Account account = new Account(index + 1, "user" + index + "@gmail.com", "username " + index);
            account.setEmail("user" + index + "@gmail.com");
            account.setUsername("username " + index);
            account.setFullname("fullname " + index);
            account.setCreatedDate(LocalDate.now());

            accounts[index] = account;
        }

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getFullname() + "\n");
        }
    }
}
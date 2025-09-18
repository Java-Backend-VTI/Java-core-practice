import java.util.Scanner;

public class PracticeDay3Exercise4 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Hay nhap chuoi ky tu: ");
        String content = inputString.nextLine();
        int result = countCharacter(content);
        System.out.println(result);

        System.out.println("Hay nhap chuoi ky tu 1: ");
        String firstCharacter = inputString.nextLine();
        System.out.println("Hay nhap chuoi ky tu 2: ");
        String secondCharacter = inputString.nextLine();
        String lastCharacter = firstCharacter + secondCharacter;
        System.out.println(lastCharacter);

        System.out.println("Hay nhap chuoi ky tu can viet hoa: ");
        String upUppercase = inputString.nextLine();
        String afterUppercase = upUppercase(upUppercase);
        System.out.println(afterUppercase);
    }

    public static int countCharacter(String content) {
        int count = 0;
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c != ' ') {
                count = count + 1;
            } else {
                continue;
            }
        }
        return count;
    }

    public static String upUppercase(String content) {
        char c = content.charAt(0);
        if (Character.isUpperCase(c)) {
            return content.toUpperCase();
        } else {
            return "";
        }
    }
}
import java.util.Scanner;

public class PracticeDay3 {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap so A: ");
        int firstNumber = inputNumber.nextInt();

        System.out.println("Nhap so B: ");
        int secondNumber = inputNumber.nextInt();

        float divisionNumber = division(firstNumber, secondNumber);
        System.out.println(divisionNumber);

    }

    // Ham tinh tong 3 so
    public static int sumOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int total = firstNumber + secondNumber + thirdNumber;
        return total;
    }

    // Tinh thuong 2 so nguyen
    public static float division(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Mau so khong duoc phep bang 0");
            return 0;
        }
        return (float) firstNumber / secondNumber;
    }
}
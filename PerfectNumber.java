import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("Bir sayı giriniz : ");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;

            }
        }

        if (total == number) {
            System.out.println(number + " Mükkemel Sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı Değildir.");
        }


    }
}

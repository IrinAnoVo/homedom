package summery06_12;

import java.util.Scanner;

public class _zikl {
    public static void main(String[] args) {
        String str;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            //int sum = getSumWhile(number);
            int sum = getSumFor(number);
            System.out.println("Sum = " + sum);
            System.out.println("Хотите ещё посчитать? (y/n) ");
            str = scanner.next();
        }
        while (!str.equals("n"));
                //или
        while (str.equals("y"));

        System.out.println("Спасибо, что восользовались программой! ");
    }
    private static int getSumWhile(int number) {
        int sum = 0;
        while (number != 0) {
            int ost = number % 10;
            System.out.println(ost);
            sum += ost; // sum = sum + ost;
            number = number / 10; // number /= 10;
        }
        return sum;
    }

    private static int getSumFor(int number) {
        int sum;
        for(sum = 0; number != 0; number = number / 10) {
            int ost = number % 10;
            System.out.println(ost);
            sum += ost; // sum = sum + ost;
        }
        return sum;

    }
}

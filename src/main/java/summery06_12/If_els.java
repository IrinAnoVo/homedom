package summery06_12;

import java.util.Scanner;

public class If_els {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("День недели? ");
        int day = scanner.nextInt();

//        if (day >= 1 && day <= 5) {
//            System.out.println("Иди на работу");
//        }
//        if (day == 6 || day == 7) {
//            System.out.println("Спи дальше ");
//        }

        getdayOfWeekSwitchNew(day);
    }

    private static void getdayOfWeekSwitch(int day) {
    }

    private static void getDayOfWeekIf(int day) {
        if (day == 6 || day == 7) {
            System.out.println("Спи дальше ");
        } else if (day >= 1 && day <= 5) {
            System.out.println("Иди на работу");
        } else {
            System.out.println("Ошибка в вводе! ");
        }
    }

    private static void getdayOfWeekSwitchClassik(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Иди на работу");
                if (day == 3) {
                    System.out.println("На работу позже");
                }
                break;
                case 6:
                case 7:
                    System.out.println("Спи дальше ");
                    break;
                default:
                    System.out.println("Ошибка в вводе! ");

        }

    }
    private static void getdayOfWeekSwitchNew(int day) {
        switch (day) {
            case 1, 2, 3, 4, 5 -> {
            System.out.println("Иди на работу");
            if (day == 3) {
                System.out.println("На работу позже");
            }
        }
            case 6, 7 -> {

                System.out.println("Спи дальше ");
            }
            default -> {
                System.out.println("Ошибка в вводе! ");
            }

        }

    }
}
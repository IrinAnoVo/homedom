package dom;

import com.sun.jdi.connect.Connector;

import java.util.Arrays;

public class Zadachi3 {
    public static void main(String[] args) {
        // 21. Генерация нового массива из четных чисел.
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        int[] newArray = new int[count];
//        int co = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                newArray[co++] = array[i];
//            }
//        }
//        System.out.println(Arrays.toString(newArray));


        // 22. Генерация нового массива из нечетных чисел.
//            int[] array = {1, 2, 3, 4, 5, 6};
//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] % 2 != 0) {
//                    count++;
//                }
//            }
//            int [] newArray = new int[count];
//            int co = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] % 2 != 0) {
//                    newArray[co++] = array[i];
//                }
//            }
//            System.out.println(Arrays.toString(newArray));


        // 23. Проверка на палиндром в массиве строк.
            String[] array = {"level", "hello", "radar", "world"};
            boolean isPalindrome = true;
            int word = array.length;
            for (int i = 0; i < array.length / 2; i++)  {


                    System.out.println("a palindrome: " + isPalindrome);

            }




        // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
//            String[] array = {"apple", "application", "banana", "grape"};
//            String pattern = "app";


        // 25. Создание массива чисел с четными индексами.
//            int[] array = {1, 2, 3, 4, 5, 6};


        // 26. Создание массива чисел с нечетными индексами.
//            int[] array = {1, 2, 3, 4, 5, 6};


        // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
//            String[] array = {"apple", "banana", "cat", "dog", "elephant"};


        // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
//            String[] array = {"apple", "banana", "level", "radar", "hello"};


        // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
//            int[] array = {1, 2, 3, 4, 5};


        // 30. Создать массив строк, содержащих только уникальные символы.
//            String[] array = {"apple", "banana", "cat", "dog", "race"};


    }
}
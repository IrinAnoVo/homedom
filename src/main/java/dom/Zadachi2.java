package dom;

import java.util.Arrays;
import java.util.SortedMap;

public class Zadachi2 {

    public static void main(String[] args) {
        // 1. Найти сумму элементов массива целых чисел.
//            int[] array = {1, 2, 3, 4};
//            int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum);

//         2. Найти длину самой длинной строки в массиве строк.
//            String[] array = {"cat", "elephant", "dog"};
//            int maxLength = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() > maxLength) {
//                maxLength = array[i].length();
//            }
//        }
//        System.out.println(maxLength);


        // 3. Проверить, содержит ли массив строк заданное слово.
//        String[] array = {"apple", "banana", "cherry"};
//        String target = "banana";
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals(target)) {
//                break;
//            }
//        }
//        System.out.println(target);


        // 4. Подсчитать количество строк, содержащих заданный символ.
//        String[] array = {"apple", "banana", "cherry"};
//        char target = 'a';
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].indexOf(target) != -1) {
//                count++;
//            }
//        }
//        System.out.println("символ " + target + ":" + count);

        // 5. Найти строку с максимальным количеством символов 'e'.
//        String[] array = {"elephant", "eagle", "dog"};
//        String maxString = " ";
//        int maxCount = 0;
//        int target = 'e';
//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            for (int j = 0; j < array[i].length(); j++) {
//                if (array[i].charAt(j) == target) {
//                    count++;
//                }
//            }
//            if (maxCount < count) {
//                maxCount = count;
//               maxString = array[i];
//            }
//        }System.out.println("max 'e' : " + maxString);

        // 6. Удалить из массива строк все строки, содержащие заданное слово.
//        String[] array = {"apple pie", "banana bread", "cherry tart"};
//        String target = "bread";
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].contains(target)) {
//                count++;
//            }
//        }
//        String[] newArray = new String[array.length - count];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (!array[i].contains(target)) {
//                newArray[index] = array[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(newArray));


        // 7. Найти минимальный элемент массива целых чисел.
//        int[] array = {3, 1, 4, 1, 5};
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("min: " + min);


        // 8. Найти строку с минимальной длиной.
//        String[] array = {"cat", "elephant", "dog"};
//        String minString = array[0];
//        int minCount = minString.length();
//        for (int i = 1; i < array.length; i++) {
//            String currentString = array[i];
//            int currentLength = currentString.length();
//            if (currentLength < minCount || minCount == 0) {
//                minCount = currentLength;
//                minString = currentString;
//            }
//            if (currentLength == minCount && !currentString.equals(minString)) {
//                minString = currentString;
//            }
//            System.out.println("minString: " + minString);
//        }


        // 8. Найти строку с минимальной длиной.
//        String[] array = {"cat", "elephant", "dog"};
//        String minString = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i].length() < minString.length()) {
//                minString = array[i];
//            }
//        }
//        System.out.println("minString: " + minString);



        // 9. Подсчитать количество четных чисел в массиве.{
//        int[] array = {1, 2, 3, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("count: " + count);


        // 10. Найти строку, которая встречается чаще всего.
//        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
//        String mostFrequent = "";
//        int maxCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            int currentCount = 1;
//            for (int j = 0; j < array.length; j++) {
//                if (i != j && array[i].equals(array[j])) {
//                    currentCount++;
//                }
//            }
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//                mostFrequent = array[i];
//            }
//        }
//        System.out.println("maxCount: " + maxCount + ", mostFrequent: " + mostFrequent);


    }
}
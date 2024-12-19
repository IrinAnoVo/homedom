package dom;

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
//        String[] array = {"level", "hello", "radar", "world"};
//        for (int i = 0; i < array.length; i++) {
//            StringBuilder sb = new StringBuilder(array[i]);
//            if (sb.toString().equals(sb.reverse().toString())) {
//                System.out.println(array[i] + " palindrome");
//            } else {
//                System.out.println(array[i] + " not palindrome");
//            }
//        }

        // 23. Проверка на палиндром в массиве строк.
//        String[] array = {"level", "hello", "radar", "world"};
//        for (int i = 0; i < array.length; i++) {
//            String str = array[i];
//            boolean isPalindrome = true;
//            int left = 0;
//            int right = str.length() - 1;
//            while (left < right) {
//                if (str.charAt(left) != str.charAt(right)) {
//                    isPalindrome = false;
//                    break;
//                }
//                left++;
//                right--;
//            }
//            if (isPalindrome) {
//                System.out.println("str" + " palindrome");
//            } else {
//                System.out.println("str" + " not palindrome");
//            }
//        }

            // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
//            String[] array = {"apple", "application", "banana", "grape"};
//            String pattern = "app";


            // 25. Создание массива чисел с четными индексами.
//            int[] array = {1, 2, 3, 4, 5, 6};
//            int count = 0;
//            for (int i = 0; i < array.length; i += 2) {
//                count++;
//            }
//            int[] newArray = new int[count];
//            int co = 0;
//            for (int i = 0; i < array.length; i += 2) {
//                newArray[co++] = array[i];
//            }
//            System.out.println(Arrays.toString(newArray));


            // 26. Создание массива чисел с нечетными индексами.
//            int[] array = {1, 2, 3, 4, 5, 6};
//            int count = 0;
//            for (int i = 1; i < array.length; i += 2) {
//                count++;
//            }
//            int[] newArray = new int[count];
//            int co = 0;
//            for (int i = 1; i < array.length; i += 2) {
//                newArray[co++] = array[i];
//            }
//            System.out.println(Arrays.toString(newArray));


            // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
//            String[] array = {"apple", "banana", "cat", "dog", "elephant"};
//            String[] evenLength = new String[0];
//            String[] oddLength = new String[0];
//            for (String s : array) {
//                if (s.length() % 2 == 0) {
//                    evenLength = Arrays.copyOf(evenLength, evenLength.length + 1);
//                    evenLength[evenLength.length - 1] = s;
//                } else {
//                    oddLength = Arrays.copyOf(oddLength, oddLength.length + 1);
//                    oddLength[oddLength.length - 1] = s;
//                }
//                System.out.println("Even length: " + Arrays.toString(evenLength));
//                System.out.println("Odd length: " + Arrays.toString(oddLength));
//            }


            // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
//            String[] array = {"apple", "banana", "level", "radar", "hello"};
//            String firstLetter = array[0].substring(0, 1);
//            for (String str : array) {
//                if (!str.startsWith(firstLetter) && str.charAt(0) == str.charAt(str.length() - 1)) {
//                    System.out.println(str);
//                }
//            }


            // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
//            int[] array = {1, 2, 3, 4, 5};
//            int[] squares = new int[array.length];
//            for (int i = 0; i < array.length; i++) {
//                squares [i] = array[i] * array[i];
//                }
//                System.out.println("Squares: " + Arrays.toString(squares));


            // 30. Создать массив строк, содержащих только уникальные символы.
//            String[] array = {"apple", "banana", "cat", "dog", "race"};
//        String allWords = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            allWords += array[i];
//        }
//
//        System.out.println("allWords = " + allWords);
//
//        boolean isUnique = true;
//        int countUniqueLetters = 0;
//        for (int i = 0; i < allWords.length(); i++) {
//            for (int j = 1; i >= j; j++) {
//                if (allWords.charAt(i) == allWords.charAt(i-j)) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                countUniqueLetters++;
//            }
//            isUnique = true;
//        }
//
//        String[] arrayUniqueLetters = new String[countUniqueLetters];
//        int k = 0;
//        for (int i = 0; i < allWords.length(); i++) {
//            isUnique = true;
//            for (int j = 1; i >= j; j++) {
//                if (allWords.charAt(i) == allWords.charAt(i-j)) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                arrayUniqueLetters[k] = String.valueOf(allWords.charAt(i));
//                k++;
//            }
//        }
//        System.out.println("arrayUniqueLetters = " + Arrays.toString(arrayUniqueLetters));
    }
}


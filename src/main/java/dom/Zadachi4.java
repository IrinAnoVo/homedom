package dom;

import java.util.Arrays;


public class Zadachi4 {
    public static void main(String[] args) {
        // 11. Отсортировать массив строк по длине.
//        String[] array = {"elephant", "cat", "dog"};
//        Arrays.sort(array, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
//        System.out.println(Arrays.toString(array));


        // 12. Найти и вывести все строки одинаковой длины.
//        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
//        int maxLength = array[0].length();
//        for (String str : array) {
//            if (str.length() > maxLength) {
//                maxLength = str.length();
//            }
//        }
//        for (String str : array) {
//            if (str.length() == maxLength) {
//                System.out.println(str);
//            }
//        }


        // 13. Сравнить содержимое двух массивов целых чисел.
//            int[] array1 = {1, 2, 3};
//            int[] array2 = {1, 2, 3};
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array1[i]!= array2[j]) {
//                    System.out.println("Arrays не равны");
//                    return;
//                }
//            }
//        }


        // 14. Генерация нового массива из сумм элементов двух массивов.
//            int[] array1 = {1, 2, 3};
//            int[] array2 = {4, 5, 6};
//            int[] resultArray = new int[array1.length];
//            for (int i = 0; i < array1.length; i++) {
//                resultArray[i] = array1[i] + array2[i];
//            }
//            System.out.println(Arrays.toString(resultArray));


        // 15. Найти уникальные значения в массиве строк.
//            String[] array = {"apple", "banana", "apple", "cherry", "banana"};
//            int uniqueCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (array[j]!= null && array[i]!= null && array[j].equals(array[i])) {
//                    array[i] = null;
//                    uniqueCount++;
//                    break;
//                }
//                if (array[j] == null) {
//                    break;
//                }
//            }
//            System.out.println(uniqueCount);
//        }


        // 16. Удалить дубликаты из массива строк.
//        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
//        int uniqueCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == null) continue;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] != null && array[i].equals(array[j])) {
//                    array[j] = null;
//                }
//            }
//        }
//        for (String str : array) {
//            if (str != null) {
//                uniqueCount++;
//            }
//        }
//        for (String str :array) {
//            if (str!= null) {
//                System.out.println(str);
//            }
//        }
//        System.out.println(uniqueCount);



    // 17. Объединить два массива строк в один.
//            String[] array1 = {"apple", "banana"};
//            String[] array2 = {"cherry", "date"};
//            String[] resultArray = new String[array1.length + array2.length];
//        for (int i = 0; i < array1.length; i++) {
//            resultArray[i] = array1[i];
//        }
//        for (int j = 0; j < array2.length; j++) {
//           resultArray[array1.length + j] = array2[j];
//        } System.out.println(Arrays.toString(resultArray));


    // 18. Проверить, упорядочен ли массив строк по алфавиту.
//        String[] array = {"apple", "banana", "cherry"};
//        Arrays.sort(array);
//        boolean isSorted = true;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i].charAt(0) > array[i + 1].charAt(0)) {
//                isSorted = false;
//                break;
//            }
//        }
//        System.out.println(isSorted);


    // 19. Найти строки, начинающиеся с заданной буквы.
//        String[] array = {"apple", "banana", "apricot", "cherry"};
//        char target = 'a';
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].charAt(0) == target) {
//                count++;
//                System.out.println(array[i]);
//            }
//        }


    // 20. Создать массив строк из первых букв элементов другого массива.
//        String[] array = {"apple", "banana", "cherry"};
//        String[] resultArray = new String[array.length];
//        for (int i = 0; i < array.length; i++) {
//            resultArray[i] = Character.toString(array[i].charAt(0));
//        }
//        System.out.println(Arrays.toString(resultArray));

}
}
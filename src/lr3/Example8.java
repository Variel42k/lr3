package lr3;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        int size = 10;
        char i = 'S';
        char chars[] = new char[size];
        for (int x = 0; x < size; i--) {
            if (i % 2 == 1) {
                chars[x] = i;
                System.out.println("Элемент массива [" + x + "]" + chars[x]);
                x++;
            }
        }
        System.out.println("конец массива\n");
        Arrays.sort(chars); // Сортировка массива по возрастанию его элементов
        System.out.println("Произведена сортировка массива");
        for (int x = 0; x < chars.length; x++) {
            System.out.println("Элемент массива [" + x + "] после сортировки = " + chars[x]);
        }
        System.out.println("конец массива");
    }
}

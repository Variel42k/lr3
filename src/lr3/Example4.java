package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = id.nextInt();
        System.out.println("Введите второе число");
        int num2 = id.nextInt();

        SortNum.WhileSort(num1, num2);
        SortNum.ForSort(num1, num2);
    }

    static class SortNum {
        static void WhileSort(int num1, int num2) {
            if (num1 > num2) {
                while (num1 <= num2) {
                    System.out.println("%d, " + num1);
                    num1++;
                }
            } else {
                while (num1 >= num2) {
                    System.out.println("%d " + num2);
                    num2++;
                }
            }
            System.out.println("конец числового ряда");

        }

        static void ForSort(int num1, int num2) {
            if (num1 > num2) {
                for (int num3 = num1; num3 <= num2; num3++) {
                    System.out.println("%d" +num3);
                }
                }
                else {
                for (int num4 = num2; num4 <= num2; num4++) {
                    System.out.println("%d" +num4);
                }
            }
            System.out.println("конец числового ряда");

        }
    }
}
package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Fib.WhileMethod();
        Fib.ForMethod();
    }


    static class Fib {
        static void WhileMethod() {
            Scanner id = new Scanner(System.in);
            System.out.println("Введите размер массива Фибоначчи");
            int size = id.nextInt();
            int num1 = 1, num2 = 1, i = 1;
            while (i <= size) {

                System.out.print(num1 + " ");
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;
                i++;
            }
            System.out.println("\nконец цикла");
        }

        static void ForMethod() {

            Scanner id = new Scanner(System.in);
            System.out.println("Введите размер массива Фибоначчи");
            int size = id.nextInt();
            int num1 = 1, num2 = 1;
            for (int k = 1; k <= size; ++k) {
                System.out.println(num1 + " ");
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
            System.out.println("\nконец цикла");

        }
    }
}
package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер дня недели: ");
        int day = in.nextInt();

            switch (day) {
                case 1:
                    System.out.println(day + " - понедельник");
                    break;
                case 2:
                    System.out.println(day + " - вторник");
                    break;
                case 3:
                    System.out.println(day + " - среда");
                    break;
                case 4:
                    System.out.println(day + " - четверг");
                    break;
                case 5:
                    System.out.println(day + " - пятница");
                    break;
                case 6:
                    System.out.println(day + " - суббота");
                    break;
                case 7:
                    System.out.println(day + " - воскресенье");
                    break;
                default:
                    System.out.println(day + " - некорректное значение");
                    break;


            }
        }
}

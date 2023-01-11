package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();

        switch (day) {
            case "понедельник":
                System.out.println(day + " - 1");
                break;
            case "вторник":
                System.out.println(day + " - 2");
                break;
            case "среда":
                System.out.println(day + " - 3");
                break;
            case "четверг":
                System.out.println(day + " - 4");
                break;
            case "пятница":
                System.out.println(day + " - 5");
                break;
            case "суббота":
                System.out.println(day + " - 6");
                break;
            case "воскресенье":
                System.out.println(day + " - 7");
                break;
            default:
                System.out.println(day + " - некорректное значение");
                break;


            }
        }
}

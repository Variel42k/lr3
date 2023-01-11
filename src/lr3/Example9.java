package lr3;
import java.util.Arrays; // пакет для подключения класса Arrays, для сортировки элементов массива по возрастанию
import java.util.Random; // пакет для подключения класса Random и создания объекта для генерации случайного числа
import java.util.Scanner; // пакет для подключения класса Scanner, для считывания с консоли значения

public class Example9 {
    public static void main(String[] args) {

        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();

        System.out.println("Размер массива равен" + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length ; i++){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"]= " +nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length ; i++){
            System.out.println("Элемент массива ["+i+"] после сортировки= " +nums[i]);
        }
    }
}

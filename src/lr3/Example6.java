package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();

        System.out.println("Размер массива равен "+ size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length ; i++){
            nums[i] = random.nextInt(1000);
            System.out.println("Элемент массива ["+i+"]"+nums[i]);
            if (i%5 == 2){
                System.out.println("Удовлетворяет условиям");
            }
            else {
                System.out.println("Не удовлетворяет условиям");
            }
        }
    }
}

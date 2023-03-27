package KNUJavaProgramming.ThirdWeek;

import java.util.Scanner;

public class Decease2 {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.print("양의 정수를 하나 입력하시오: ");
        int input = intInput.nextInt();

        System.out.println("첫 번째 방법");
        for(int i = 0; i <= input; i++) {
            if(i % 10 == 9) {
                System.out.println(input - i);
            } else {
                System.out.print((input - i) + "\t");
            }
        }

        System.out.println("\n두 번째 방법");
        int count = 0;
        for(int i = 0; i <= input; i++) {
            count++;
            if(count == 10) {

                System.out.println(input - i);
                count = 0;
            } else {
                System.out.print((input - i) + "\t");
            }
        }
    }
}

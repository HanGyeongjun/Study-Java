package KNUJavaProgramming.ThirdWeek;

import java.util.Scanner;

public class Increase {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.print("양의 정수를 하나 입력하시오: ");
        int input = intInput.nextInt();

        System.out.println("첫번째 방법: ");
        for(int i = 0; i <= input; i++) {
            if(i % 10 == 9) {
                System.out.println(i);
            } else {
                System.out.print(i + "\t");
            }
        }

        System.out.println("\n두번째 방법: ");
        int count = 0;
        for(int i = 0; i <= input; i++) {
            if(count != 9) {
                System.out.print(i + "\t");
                count += 1;
            } else {
                System.out.println(i);
                count = 0;
            }
        }
    }
}

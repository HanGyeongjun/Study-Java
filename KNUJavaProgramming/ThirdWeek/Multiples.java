package KNUJavaProgramming.ThirdWeek;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.print("어떤 수의 배수들을 출력할까요? ");
        int input = intInput.nextInt();

        for(int i = 1; i<=100; i++) {
            if(i % input == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

package KNUJavaProgramming.ThirdWeek;

import java.util.Scanner;

public class Decease {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.print("양의 정수를 하나 입력하시오: ");
        int input = intInput.nextInt();

        for(int i = 0; i <= input; i++) {
            System.out.print((input - i) + " ");
        }
    }
}

package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("정수를 두 개 입력하시오 : ");
        int FirstInput = input.nextInt();
        int SecondInput = input.nextInt();

        System.out.print(FirstInput + " + " + SecondInput + " = " + (FirstInput + SecondInput));

    }
}

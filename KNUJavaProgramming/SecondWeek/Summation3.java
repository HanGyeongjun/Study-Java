package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class Summation3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1부터 얼마까지의 짝수를 더하시겠습니까? ");
        int valueOfNumber = input.nextInt();

        int sum = 0;

        for (int i=2; i<=valueOfNumber; i+=2) {
            sum += i;
        }
        System.out.println("첫 방법 : 1부터 " + valueOfNumber + "까지의 짝수의 합 = " + sum);

        sum = 0;
        for (int i=2; i<=valueOfNumber; i++) {
            if ((i % 2) == 0) {
                sum += i;
            }
        }
        System.out.print("두 번째 방법 : 1부터 " + valueOfNumber + "까지의 짝수의 합 = " + sum);

    }
}

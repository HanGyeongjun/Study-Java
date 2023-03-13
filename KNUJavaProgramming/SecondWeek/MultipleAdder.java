package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class MultipleAdder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 몇 개 더하시겠습니까? ");
        int numberOfDecimal = input.nextInt();

        System.out.print(numberOfDecimal + "개의 정수를 차례로 입력하시오: ");

        int sum = 0;
        for (int i=0; i<numberOfDecimal; i++) {
            sum += input.nextInt();
        }
        System.out.print("정수의 합 = " + sum);
    }
}

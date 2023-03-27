package KNUJavaProgramming.ThirdWeek;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 몇 개 더하시겠습니까? ");
        int count = input.nextInt();

        System.out.print("정수를 차례로 입력하시오: ");
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int num = input.nextInt();
            sum += num;
        }

        double average = (double) sum / count;

        System.out.println("정수의 합: " + sum);
        System.out.printf("평균 %.2f", average);
    }
}

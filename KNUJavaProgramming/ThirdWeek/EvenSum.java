package KNUJavaProgramming.ThirdWeek;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
        System.out.print("구간 중 가장 작은 수는? ");
        int lowerBound = intInput.nextInt();
        System.out.print("구간 중 가장 큰 수는? ");
        int upperBound = intInput.nextInt();

        System.out.print("두 수 사이 짝수의 합 = ");
        int evenSum = 0;

        for(int i = lowerBound; i<=upperBound; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.print(evenSum);

    }
}

package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.print("정수를 두 개 입력하시오 : ");
        int firstNumber = intInput.nextInt();
        int secondNumber = intInput.nextInt();

        if (firstNumber > secondNumber) {
            System.out.print("더 큰 수는 " + firstNumber + "입니다.");
        } else if (firstNumber < secondNumber) {
            System.out.print("더 큰 수는 " + secondNumber + "입니다.");
        } else {
            System.out.print("두 수는 같습니다.");
        }

    }
}

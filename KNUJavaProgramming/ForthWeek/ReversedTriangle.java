package KNUJavaProgramming.ForthWeek;

import java.util.Scanner;

/**
 * 아래와 같은 삼각형을 그리는 프로그램.
 * 삼각형의 크기는 사용자가 지정해 준다.
 * *****
 * ****
 * ***
 * **
 * *
 * @author 한경준
 */
public class ReversedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("삼각형의 크기(양의 정수): ");
        int amount = input.nextInt();

        for (int i = 1; i<=amount; i++) {
            for (int j = (amount-i); j>=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package KNUJavaProgramming.ForthWeek;

import java.util.Scanner;

public class Powers {
    /**
     * 입력받은 수 까지의 2의 거듭제곱수를 구하는 프로그램.
     * 사용자에게는 항상 0 이상의 정수를 입력받는다.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("2의 몇 제곱까지 구할까요? ");
        int number = input.nextInt();

        for(int i = 0; i<=number; i++) {
            double poweredResult = Math.pow(2, i);
            System.out.printf("2의 %d제곱: %.0f\n", i, poweredResult);
        }

    }
}

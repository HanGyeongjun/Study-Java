package KNUJavaProgramming.ForthWeek;

import java.util.Scanner;

public class MaxPower {
    /**
     * 주어진 수보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수를 구하는 프로그램.
     * 입력받는 수는 자연수이다.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("자연수 하나를 입력하시오: ");
        int inputNumber = input.nextInt();

        int init = 1;
        boolean isReachedInput = false;

        while (!isReachedInput) {
            if ((inputNumber >= init) && (inputNumber < (init * 2))) {
                isReachedInput = false;
                break;
            } else {
                init *= 2;
            }
        }
        System.out.println(inputNumber + "보다 작거나 같은 2의 거듭제곱수들 중 가장 큰 수= " + init);
        input.close();
    }
}

package KNUJavaProgramming.ForthWeek;

import java.util.Scanner;

public class Average {
    /**
     * 사용자에게 양수를 입력받아 입력받은 수들의 평균을 출력하는 프로그램.
     * 음수를 입력하면 입력이 종료되고 값이 출력된다.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double plusedValue = 0;
        double inputValue = 0;
        boolean isInputDone = false;

        while (isInputDone == false) {
            System.out.print("> ");
            inputValue = input.nextDouble();

            if (inputValue > 0) {
                plusedValue += inputValue;
                count ++;
            } else {
                isInputDone = true;
            }
        }

        if (count == 0) {
            System.out.print("양수가 하나도 입력되지 않았습니다.");
        } else {
            System.out.printf("평균 = %.2f", (plusedValue/count));
        }
        input.close();
    }
}

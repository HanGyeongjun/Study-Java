package KNUJavaProgramming.ForthWeek;

import java.util.Scanner;

public class Calculator {
    /**
     * 사용자에게 두 수를 입력받고 그 수의 연산 결과를 출력하는 프로그램.
     * +, -. *, / 네 가지의 연산자를 지원하고, 사용자에게 입력받는다.
     * 네 가지 외 다른 문자를 입력하면 지원 불가 메시지가 출력된다.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstValue = 0;
        double secondValue = 0;
        String operator = "";

        System.out.print("두 수 입력: ");
        firstValue = input.nextDouble();
        secondValue = input.nextDouble();
        System.out.print("연산(+ - * /): ");
        operator = input.next();
        switch (operator) {
            case "+": {
                System.out.printf("%.1f + %.1f = %.2f", firstValue, secondValue, (firstValue + secondValue));
                break;
            }
            case "-": {
                System.out.printf("%.1f - %.1f = %.2f", firstValue, secondValue, (firstValue - secondValue));
                break;
            }
            case "*": {
                System.out.printf("%.1f * %.1f = %.2f", firstValue, secondValue, (firstValue * secondValue));
                break;
            }
            case "/": {
                System.out.printf("%.1f / %.1f = %.2f", firstValue, secondValue, (firstValue / secondValue));
                break;
            }
            default: {
                System.out.println("지원하지 않는 연산입니다.");
                break;
            }
        }
    }
}

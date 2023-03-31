package KNUJavaProgramming.ForthWeek;

import java.util.Scanner;

public class TaxCalculator {
    /**
     * 소득을 입력하면 소득세를 알려주는 프로그램.
     * 소득은 음수가 아니라고 가정하고, 출력은 소수점 한 자리까지 출력한다.
     * 단위는 만 원 단위이다.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double TAX_RATE_LOW = 15.0/100.0;
        final double TAX_RATE_MID = 24.0/100.0;
        final double TAX_RATE_HIGH = 35.0/100.0;


        System.out.println("소득 (만원단위 정수): ");
        int income = input.nextInt();
        int exeededIncome = 0;
        double tax = 0;

        if (income <= 0) {
            tax = 0;
        } else if (income <= 4600) {
            tax = income * TAX_RATE_LOW;
        } else if (income <= 8800) {
            tax = 4600 * TAX_RATE_LOW;
            exeededIncome = income - 4600;
            tax += exeededIncome * TAX_RATE_MID;
        } else {
            tax = 4600 * TAX_RATE_LOW;
            tax += 4200 * TAX_RATE_MID;
            exeededIncome = income - 8800;
            tax += exeededIncome * TAX_RATE_HIGH;
        }

        System.out.printf("소득세 = %.1f만원", tax);
    }
}


package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class BinaryOperations {
    public static void main(String[] args) {
        Scanner doubleInput = new Scanner(System.in);
        System.out.print("실수를 두 개 입력하시오 : ");

        Double firstInput = doubleInput.nextDouble();
        Double secondInput = doubleInput.nextDouble();

        System.out.println(firstInput + " + " + secondInput + " = " + (firstInput + secondInput));
        System.out.println(firstInput + " - " + secondInput + " = " + (firstInput - secondInput));
        System.out.println(firstInput + " * " + secondInput + " = " + (firstInput * secondInput));
        System.out.println(firstInput + " / " + secondInput + " = " + (firstInput / secondInput));

    }
}

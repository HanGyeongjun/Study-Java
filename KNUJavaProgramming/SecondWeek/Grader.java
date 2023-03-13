package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.print("점수를 입력하시오 : ");
        int point = intInput.nextInt();

        if (point >= 90) {
            System.out.print("등급 : A");
        } else if (point >= 80) {
            System.out.print("등급 : B");
        } else if (point >= 70) {
            System.out.print("등급 : C");
        } else if (point >= 60)  {
            System.out.print("등급 : D");
        } else {
            System.out.print("등급 : E");
        }
    }
}

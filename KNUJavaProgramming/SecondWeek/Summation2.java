package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class Summation2 {
    public static void main(String[] args) {

        Scanner intInput = new Scanner(System.in);

        System.out.print("1부터 얼마까지의 자연수를 더하시겠습니까? ");
        int input = intInput.nextInt();

        int sum = 0;
        int i;

        for (i=0; i<=input; i+=1) {
            sum += i;
        }

        System.out.println("for 이용 : 1부터 " + input +"까지의 자연수의 합 = " + sum);

        sum = 0;
        i = 1;

        while (i <= input) {
            sum += i;
            i += 1;
        }

        System.out.println("while 이용 : 1부터" + input +"까지의 자연수의 합 = " + sum);

    }
}

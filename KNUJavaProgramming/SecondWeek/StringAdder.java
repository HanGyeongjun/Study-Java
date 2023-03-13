package KNUJavaProgramming.SecondWeek;

import java.util.Scanner;

public class StringAdder {
    public static void main(String[] args) {
        Scanner StringInput = new Scanner(System.in);
        System.out.print("단어를 두 개 입력하시오 : ");

        String FirstInput = StringInput.next();
        String SecondInput = StringInput.next();

        System.out.print(FirstInput + SecondInput);

    }
}

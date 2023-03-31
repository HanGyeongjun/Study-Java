package KNUJavaProgramming.ForthWeek;

import java.util.ArrayList;
import java.util.Scanner;

public class Dec2Bin {
    /**
     * 10진수 자연수를 입력받아 이진수로 바꾸는 프로그램.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("자연수 하나를 십진수로 입력하시오: ");
        int decimalNumber = input.nextInt();
        boolean isReachedZero = false;
        ArrayList<Integer> binaryList = new ArrayList<Integer>();

        while(!isReachedZero) {
            binaryList.add(0, decimalNumber % 2);
            if (decimalNumber / 2 == 0) {
                isReachedZero = true;
            } else {
                decimalNumber = decimalNumber / 2;
            }
        }
        System.out.println();
        for(int i = 0; i < binaryList.size(); i++) {
            System.out.print(binaryList.get(i));
        }
        input.close();
    }
}

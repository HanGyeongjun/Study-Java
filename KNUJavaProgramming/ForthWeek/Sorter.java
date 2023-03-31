package KNUJavaProgramming.ForthWeek;

import java.util.Arrays;
import java.util.Scanner;

public class Sorter {
    /**
     * 사용자에게 정수 세 개를 입력받아서 오름차순으로 정렬하는 프로그램.
     * 새로운 배열을 만들고 해당 배열을 정렬하는 방식으로 작동한다.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] intArray = new int[3];
        for (int i = 0; i<=2; i++) {
            intArray[i] = input.nextInt();
        }
        Arrays.sort(intArray);
        System.out.println("정수 세 개:");
        System.out.print(intArray[0] + " " + intArray[1] + " " + intArray[2]);
    }
}

package KNUJavaProgramming.ThirdWeek;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        int row = 0;
        int column = 0;

        System.out.println("표를 인쇄합니다.");
        System.out.print("행을 몇 개 만들까요?");
        row = intInput.nextInt();
        System.out.println("열을 몇 개 만들까요?");
        column = intInput.nextInt();

        for(int i = 0; i<row; i++) {
            for(int j = 0; j<column; j++) {
                if(j == row) {
                    System.out.printf("(%d, %d)\n", i, j);
                } else {
                    System.out.printf("(%d, %d)\t", i, j);
                }
            }
        }
    }
}

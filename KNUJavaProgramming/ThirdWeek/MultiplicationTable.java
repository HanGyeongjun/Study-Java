package KNUJavaProgramming.ThirdWeek;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int i = 1; i<=9; i++) {
            for(int j = 1; j<=9; j++) {
                if (j == 9) {
                    System.out.printf("%dx%d=%d\n", i, j, (int)(i*j));
                } else {
                    System.out.printf("%dx%d=%d\t", i, j, (int)(i*j));
                }
            }
        }
    }
}

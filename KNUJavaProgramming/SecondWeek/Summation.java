package KNUJavaProgramming.SecondWeek;

public class Summation {
    public static void main(String[] args) {

        int sum = 0;
        int i;

        for (i=0; i<=100; i+=1) {
            sum += i;
        }
        System.out.println("for 이용 : 1부터 100까지의 자연수의 합 = " + sum);

        sum = 0;
        i = 1;

        while (i <= 100) {
            sum += i;
            i += 1;
        }
        System.out.println("while 이용 : 1부터 100까지의 자연수의 합 = " + sum);

    }
}

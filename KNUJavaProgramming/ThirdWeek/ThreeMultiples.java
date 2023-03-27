package KNUJavaProgramming.ThirdWeek;

public class ThreeMultiples {
    public static void main(String[] args) {

        int sum = 0;

        System.out.println("i를 1씩 증가시키면서 i가 3의 배수일 때만 더하는 방식으로 계산");
        System.out.print("1 이상 100이하 3의 배수들의 합 = ");
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        sum = 0;

        System.out.println("i를 3씩 증가시키면서 i를 더하는 방식으로 계산");
        System.out.print("1 이상 100이하 3의 배수들의 합 = ");
        for(int i = 0; i <= 100; i += 3) {
            sum += i;
        }
        System.out.print(sum);
    }
}

package KNUJavaProgramming.ForthWeek;

import java.util.Scanner;

public class ATMMachine {
    /**
     * 현금 입출금 ATM 기계 프로그램.
     * 한 번의 거래만 허용된다.
     * 잔액확인, 입금, 출금이 가능하다.
     * @author 한경준
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double myMoney = 5000;

        System.out.println("잔액 확인: \t1\n현금 인출: \t2\n입금: \t\t3\n종료: \t\t4\n번호 선택:");
        int selectedNumber = input.nextInt();

        switch (selectedNumber) {
            case 1: {
                System.out.printf("잔액은 %.1f원입니다.", myMoney);
                break;
            }
            case 2: {
                System.out.print("얼마를 인출하시겠습니까? ");
                int requestMoney = input.nextInt();
                if (requestMoney > myMoney) {
                    System.out.println("돈이 모자랍니다.");
                } else {
                    myMoney -= requestMoney;
                    System.out.println("돈을 받으세요.");
                }
                System.out.printf("잔액은 %.1f원입니다.", myMoney);
                break;
            }
            case 3: {
                System.out.print("금액은?");
                myMoney += input.nextInt();
                System.out.printf("잔액은 %.1f원입니다.", myMoney);
                break;
            }
            case 4: {
                System.out.print("감사합니다.");
                break;
            }
            default: {
                System.out.print("올바르지 않은 번호입니다.");
                break;
            }
        }
    }
}

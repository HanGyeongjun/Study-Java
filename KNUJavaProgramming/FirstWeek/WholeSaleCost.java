package KNUJavaProgramming.FirstWeek;

public class WholeSaleCost {
    public static void main(String[] args) {

        double coverPrice = 24.95;
        double discountRate = 0.6;
        double initialShippingCost = 3.0;
        double addtionalShippingCost = 0.75;
        double wholeCost = 0;
        int quantity = 60;

        double discountedPrice = (coverPrice * discountRate);

        for (double i=0; i < quantity; i++) {
            if (i == 0) {
                wholeCost += discountedPrice+initialShippingCost;
            }
            else {
                wholeCost += discountedPrice+addtionalShippingCost;
            }
        }

        System.out.printf("총 구매 가격은 %.3f입니다.", wholeCost);

    }
}

package Day2.Level1;

public class FeesCalculation {
    public static void main(String[] args) {
        int fees=125000;
        int discountPercent=10;
        int discount=discountPercent*fees/100;
        int feesPaid=fees-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+feesPaid);
    }

}

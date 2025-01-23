package Day2.Level1;

public class ProfitAndLoss {
    public static void main(String[] args) {
        int sellingPrice=191;
        int costPrice=129;
        int profit=sellingPrice-costPrice;
        float profitPercentage=((float)profit/costPrice)*100f;
        System.out.println("The cost price is INR "+costPrice+" and selling price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage+" %");
    }

}

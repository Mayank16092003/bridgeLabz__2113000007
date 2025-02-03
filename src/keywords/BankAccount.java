package keywords;
public class BankAccount {
    static String bankName="SBI";
    static int totalAccounts;
    final int accountNumber;
    static String holderName;
    public BankAccount(String holderName, int accountNumber) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + holderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
    public static void main(String[] args){
        BankAccount bankAcc = new BankAccount("Aru", 9980);
        BankAccount bankAcc_2 = new BankAccount("Mayank", 3920);
        bankAcc.displayDetails();
        bankAcc_2.displayDetails();
    }
}

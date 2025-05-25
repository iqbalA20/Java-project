package Project;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    private int CustomerNumber;
    private int pinNumber;
    private double CheckingBalance = 0;
    private double SavingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int CustomerNumber) {
        this.CustomerNumber  = CustomerNumber;
        return CustomerNumber;
    }
    public int getCustomerNumber() {
        return CustomerNumber;
    }
    public int setPinNumber(int PinNumber) {
        this.pinNumber = PinNumber;
        return PinNumber;
    }
    public int getPinNumber() {
        return pinNumber;
    }
    public double getCheckingBalance() {
        return CheckingBalance;
    }
    public double getSavingBalance() {
        return SavingBalance;
    }
    public double calcCheckingWithdraw(double amount) {
        CheckingBalance = (CheckingBalance - amount);
        return CheckingBalance;
    }
    public double calcSavingWithdraw(double amount) {
        SavingBalance = (SavingBalance - amount);
        return SavingBalance;
    }
    public double calcCheckingDeposit(double amount) {
        CheckingBalance = (CheckingBalance + amount);
        return CheckingBalance;
    }
    public double calcSavingDeposit(double amount) {
        SavingBalance = (SavingBalance + amount);
        return SavingBalance;
    }
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(CheckingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((CheckingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(CheckingBalance));
        } else {
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if ((SavingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(SavingBalance));
        } else {
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }
    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(CheckingBalance));
        System.out.println("Amount you want to Deposit in Checking Account: ");
        double amount = input.nextDouble();

        if ((CheckingBalance + amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(CheckingBalance));
        } else {
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }
    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(SavingBalance));
        System.out.println("Amount you want to Deposit in Saving Account: ");
        double amount = input.nextDouble();

        if ((SavingBalance + amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(SavingBalance));
        } else {
            System.out.println("Balance Cannot be Negative." + "\n");
        }
    }
}

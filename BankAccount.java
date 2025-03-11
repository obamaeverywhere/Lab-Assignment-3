// coding task 1

public class BankAccount {
    public String accountType="Not Set";
    public int accountNumber;
    public String printDetails() {
        return "Account Number: " + accountNumber + "\nAccount Type: " + accountType;
    }
    public void setInfo(int accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        System.out.println("Account information updated!");
    }
}

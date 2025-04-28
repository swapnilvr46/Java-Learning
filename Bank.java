public class Bank {

    public static void main(String[] args) {
        BankAccount customerAccount = new BankAccount(1000);
        float amount = customerAccount.depositAmount(5000);
        customerAccount.withdrawalAmount(2000);
        customerAccount.checkBalance();
    }
}

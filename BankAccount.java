public class BankAccount {

    float totalAmount;

    BankAccount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    float withdrawalAmount(float amount) {
        totalAmount = totalAmount - amount;
        return totalAmount;
    }

    float depositAmount(float amount) {
        totalAmount = totalAmount + amount;
        return totalAmount;
    }

    void checkBalance() {
        System.out.println("Current Balance: " + totalAmount);
    }
}

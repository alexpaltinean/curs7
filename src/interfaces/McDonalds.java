package interfaces;

public class McDonalds implements Company, FoodProvider {
    private int numberOfEmployees;
    private int uniqueId;
    private double balance;
    private int deliveredQuantity;

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }

    public void hire(String person) {
        this.numberOfEmployees++;
    }

    public boolean pay(double amount) {
        if (amount < 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public String deliverFood() {
        this.balance -= 10;
        this.deliveredQuantity++;
        return "Hamburger";
    }

    public int getDeliveredQuantity() {
        return this.deliveredQuantity;
    }
}

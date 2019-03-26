public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return balance;
    }

    public void setMoney(double money) {
        this.balance = money;
    }

    public double getBalance() {
        return balance;
    }
}

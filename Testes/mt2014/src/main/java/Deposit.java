public class Deposit extends Transaction {
    public Deposit(ATM atm, Session session, Card card, int money) {
        super(atm, session, card, money);
    }
}

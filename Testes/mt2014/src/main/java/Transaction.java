public class Transaction {

    private ATM atm;
    private Session session;
    private Card card;
    private int id;
    private double amount;

    public Transaction(ATM atm, Session session, Card card, int id) {
        this.atm = atm;
        this.session = session;
        this.card = card;
        this.id = id;
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString()
    {
        return "at ATM " + getAtm().getID() + " (" + getAtm().getLocation() +", " + getAtm().getBank() + ") of "+ String.format("%.2f", amount);
    }

}

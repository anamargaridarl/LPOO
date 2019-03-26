import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Withdrawal extends Transaction {


    public Withdrawal(ATM atm, Session session, Card card, int money) {
        super(atm, session, card, money);
    }

    @Override
    public String toString()
    {
        return "Withdrawal " + super.toString();
    }

}

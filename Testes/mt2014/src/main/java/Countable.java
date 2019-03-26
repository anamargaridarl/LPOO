import java.util.ArrayList;
import java.util.List;

public class Countable {

    private List<Transaction> transactions;

    public Countable() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction w) {
        transactions.add(w);

    }

    public int count() {
        return transactions.size();
    }
}

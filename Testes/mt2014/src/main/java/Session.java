public class Session extends Countable {

    private ATM atm;

    public Session(ATM atm) {
        super();
        this.atm = atm;

    }

    public ATM getATM() {
        return atm;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;

        if(this == null) return false;

        Session p = (Session)o;

        return (atm.getID() == p.atm.getID() && atm.getBank() == p.atm.getBank() && atm.getLocation() == p.atm.getLocation());
    }

}

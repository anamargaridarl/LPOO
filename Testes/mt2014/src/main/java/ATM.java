public class ATM {

    private int id;
    private String location;
    private String bank;

    public ATM(int number, String location, String bank) {
        this.id = number;
        this.location = location;
        this.bank = bank;
    }

    public int getNumber() {
        return id;
    }

    public void setNumber(int number) {
        this.id = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getID() {
        return id;
    }
}

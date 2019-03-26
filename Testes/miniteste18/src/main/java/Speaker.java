public class Speaker extends Person implements User {

    private int fee;

    public Speaker(String name, int age) {
        super(name,age);
        this.fee = 0;
    }


    public Speaker(String name) {
        super(name);
        this.fee = 0;
    }


    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    @Override
    public String toString()
    {
        return "Speaker " + getName() + " as a fee value of "+ getFee() + ".";
    }

    public String getUsername()
    {
        return getName() + getAge();
    }
}

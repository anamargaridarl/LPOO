public class Attendee extends Person implements User {

    private boolean hasPaid;

    public Attendee(String name) {
        super(name);
        this.hasPaid =false;
    }

    public Attendee(String name, int age) {
        super(name, age);
        this.hasPaid =false;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }


    @Override
    public String toString()
    {
        return "Attendee " + getName() + (isHasPaid() ? " has":" hasn't") +" paid its registration.";
    }

    public String getUsername()
    {
        return getName() + getAge();
    }
}

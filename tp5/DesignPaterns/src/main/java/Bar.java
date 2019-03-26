import java.util.ArrayList;
import java.util.List;

public class Bar {

    private boolean happyHour;
    private List<BarObserver> observers;

    public Bar() {
        this.happyHour = false;
        observers = new ArrayList<>();
    }

    public void startHappyHour() {
        this.happyHour =true;
        notifyObservers();
    }

    public void endHappyHour() {
        this.happyHour =false;
        notifyObservers();
    }

    public boolean isHappyHour() {
        return happyHour;
    }

    void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }

    public void order(StringRecipe recipe) {
        recipe.mix();
    }

}

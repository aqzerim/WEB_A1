import java.util.ArrayList;
import java.util.List;
class GameCharacter {
    private final List<Observer> observers = new ArrayList<>();
    private final String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void collectItem(String itemName) {
        System.out.println(name + " collects " + itemName);
        notifyObservers(itemName);
    }

    private void notifyObservers(String itemName) {
        for (Observer observer : observers) {
            observer.update(this, itemName);
        }
    }

    public String getName() {
        return name;
    }
}
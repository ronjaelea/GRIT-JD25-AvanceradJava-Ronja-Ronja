package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private List<Observer> observers = new ArrayList<>();

    public NewsAgency() {}

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(String message){
        observers.forEach(
                obs -> obs.update(message)
        );
    }

    // Skapa fler metoder som är specifika för NewsAgency (och inte mönstret)
    public void reportNewNews(String news) {
        notifyObserver(news);
    }
}

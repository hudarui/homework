import lib.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteorologicalStation implements lib.Observable {
    private int temperature;
    private String weather;
    private List<Observer> observers;

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        WeatherData payload = new WeatherData(this.temperature, this.weather);
        for (Observer observer : observers) {
            observer.update(payload);
        }
        payload = null;
    }

    MeteorologicalStation() {
        this.observers = new ArrayList<Observer>();
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

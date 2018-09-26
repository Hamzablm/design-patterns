package Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * Objects use this interface to register as observers and also to remove themselves from being observers.
 */
interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver(); // notify all observers when the Subject's state had changed.

}





/**
 * The {@code ConcreteSubject}.
 */
class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}

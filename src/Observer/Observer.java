package Observer;

/**
 * All our weather components implement the <code>Observer</code> interface. This gives the Subject
 * a common interface to talk to when it comes time to update the observers.
 */
interface Observer {

    void update(float temp, float humidity, float pressure);

}





interface DisplayElement {

    void display();

}





/**
 * This display implements Observer so it can get changes from the WeatherData object.
 */
class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp +
                "F degree and " + humidity + "% humidity" + ", pressure " + pressure);
    }
}

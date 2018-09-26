package Observer;
/**
 * <p>Principle: Strive for loosely coupled design between objects that interact.</p>
 *
 * <p></p>
 *
 * <p>Note: When two objects are loosely coupled, they can interact, but have very
 * little knowledge of each other.</p>
 *
 * <p></p>
 *
 * <p>Observer pattern: defines a one-to-many dependency between objects so that when one object changes state,
 * all of its dependents are notified and updated automatically.</p>
 *
 * <p></p>
 *
 */
class WeatherStationTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        // other display elements are created

        weatherData.setMeasurements(70, 40, 46); //simulate new weather measurements
        
        weatherData.setMeasurements(90, 23, 34); //simulate new weather measurements
    }

}

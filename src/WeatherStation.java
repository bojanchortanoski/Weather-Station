public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(65, 40,50);
        weatherData.setMeasurements(60, 40,50);
        weatherData.setMeasurements(70, 40,50);

//        currentConditionsDisplay.update(weatherData, "test");
    }
}

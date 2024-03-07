package proxy.cities;

public class Main {
    public static void main(String[] args) {
        City city1 = new CityProxy("Helsinki", "Finland", 648000);
        City city2 = new CityProxy("Cairo", "Egypt", 9540000);
        City city3 = new RealCity("Tampere", "Finland", 231000, "tropical heatwave");

        // print populations
        System.out.println(city1.getName() + " population: " + city1.getPopulation());
        System.out.println(city2.getName() + " population: " + city2.getPopulation());
        System.out.println(city3.getName() + " population: " + city3.getPopulation());

        // print weather - proxy triggers fetching weather and creates RealCity
        System.out.println(city1.getName() + " weather: " + city1.getWeather());
        System.out.println(city2.getName() + " weather: " + city2.getWeather());

        // print weather - no proxy involved
        System.out.println(city3.getName() + " weather: " + city3.getWeather());

        // print weather - proxy knows the RealCity and doesn't fetch weather
        System.out.println(city2.getName() + " weather: " + city2.getWeather());
    }
}

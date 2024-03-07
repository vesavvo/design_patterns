package proxy.cities;

public class RealCity implements City {
    private String name;
    private String country;
    private int population;
    private String weather;

    public RealCity(String name, String country, int population, String weather) {
        this.name = name;
        this.country = country;
        this.population = population;
        this.weather = weather;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}

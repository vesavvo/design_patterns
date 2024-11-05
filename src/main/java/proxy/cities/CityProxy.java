package proxy.cities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CityProxy implements City {
    private String name;
    private String country;
    private int population;
    private String weather;
    private RealCity realCity;

    private final String API_KEY = "API_key_here";

    public CityProxy(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
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
        if (realCity == null) {
            System.out.println("*** Proxy is fetching weather for " + name + " ***");
            weather = fetchWeatherFromAPI(name);
            realCity = new RealCity(name, country, population, weather);
        }
        return realCity.getWeather();
    }

    private String fetchWeatherFromAPI(String cityName) {
        String json = null;
        String weather = null;
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + API_KEY);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            json = response.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            JSONArray weatherArray = (JSONArray) jsonObject.get("weather");
            JSONObject weatherObject = (JSONObject) weatherArray.get(0);
            weather = (String) weatherObject.get("description");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return weather;
    }

    public RealCity getRealCity() {
        return realCity;
    }
}

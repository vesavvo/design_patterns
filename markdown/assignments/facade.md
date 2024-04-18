# Assignment: API Facade

**Goal:**

Your task is to design and implement a facade that simplifies the use of a few subsystems that are needed for API access. The subsystems include HTTP request handling, response handling, and data parsing. The facade should provide a simple interface for making API requests and handling the responses.

To concretize the task, get acquainted with the following class that retrieves a random Chuck Norris joke from the [Chuck Norris API](https://api.chucknorris.io/) and displays it. Run the code to see how it works.

```java
package solutions.jokes;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.simple.JSONObject; // add Maven dependency for JSON.simple
import org.json.simple.parser.JSONParser; // add Maven dependency for JSON.simple

public class JokeClient {
    public String getRandomJoke() throws Exception {
        String jsonResult = getJsonFromApi("https://api.chucknorris.io/jokes/random");
        return extractJokeFromJson(jsonResult);
    }

    private String getJsonFromApi(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractJokeFromJson(String json) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(json);
        return (String) jsonObject.get("value");
    }

    public static void main(String[] args) {
        JokeClient client = new JokeClient();
        try {
            String jokeText = client.getRandomJoke();
            System.out.println(jokeText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Then, design a facade that eases this task. The facade should hide the complexity of making HTTP requests, handling responses, and parsing JSON data. The client should only need to call a simple method.

Your facade should have one method:

```java
String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException;
```

The method should send a HTTP GET request to the given URL, retrieve the JSON response, and extract the value of the given attribute name from the JSON.

Should the URL be invalid or the HTTP request fail, the method should throw an `IOException`.

If the attribute is not found, the method should throw an `IllegalArgumentException`. If there are multiple attributes with the same name, the method should return the value of the first one found.

Finally, demonstrate that the Chuck Norris joke can still be retrieved using your facade. Also, show how the facade works with another API of your choice (e.g. https://api.fxratesapi.com/latest for the latest foreign exchange rates).

**Guidelines:**

- Use the provided `JokeClient` class as a starting point to understand the API access and JSON parsing.
- Make sure and demonstrate that you implement error handling correctly in your facade.
- In realistic setting, API access should be done asynchronously. However, for the sake of simplicity, you can implement the facade with synchronous calls.

import tools.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class DemoHttpClient {

    public static void Demo() {

        try {

            // 1. Skapa en HTTPClient
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();
            // 2. Skapa en HTTPRequest
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.chucknorris.io/jokes/random"))
                    .GET()
                    .build();
            // 3. Skicka request
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );
            // 4. Använd svaret
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Body: " + response.body());

            // 5. Create Jackson Object Mapper
            ObjectMapper mapper = new ObjectMapper();
            ChuckNorris cn = mapper.readValue(
                    response.body(),
                    ChuckNorris.class
            );

            // 6. Använd vårt Chuck Norris objekt
            System.out.printf(
                    "Chuck Norris Joke: %s\n",
                    cn.getValue()
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

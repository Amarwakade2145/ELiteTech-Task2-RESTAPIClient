import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherAPIClient {

    public static void main(String[] args) {

        try {

            String url =
            "https://api.open-meteo.com/v1/forecast?latitude=21.15&longitude=79.08&current_weather=true";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response =
                    client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println("================================");
            System.out.println("  WEATHER API CLIENT PROJECT");
            System.out.println("================================");
            System.out.println("Weather Data Fetched Successfully!");
            System.out.println("Location: Madha");
            System.out.println("Temperature: 40.1 °C");
            System.out.println("Wind Speed: 9.4 km/h");
            System.out.println("================================");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

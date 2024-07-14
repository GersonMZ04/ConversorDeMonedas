import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class APICliente {
    private static final String API_KEY = "9bf6711ecc1bb4a410e75db8";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public static double obtenerTasaCambio(String monedaBase, String monedaObjetivo) throws IOException, InterruptedException {
        String apiUrl = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", API_KEY, monedaBase);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);

        // Verificar la respuesta de la API
        if (jsonResponse.has("conversion_rates")) {
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");
            if (conversionRates.has(monedaObjetivo)) {
                return conversionRates.get(monedaObjetivo).getAsDouble();
            } else {
                throw new IllegalArgumentException("Moneda objetivo no encontrada en las tasas de conversión.");
            }
        } else {
            throw new IllegalArgumentException("Respuesta de API no contiene tasas de conversión.");
        }
    }
}


import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {

    public Moneda buscaMoneda(String currencyPair, double amount) {
        String keyAPI = "32a586dd28cd23e604aa8f94";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + keyAPI + "/pair/" + currencyPair + "/" + amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return new Gson().fromJson(response.body(), Moneda.class);
            } else {
                throw new RuntimeException("Error en la solicitud: " + response.statusCode());
            }
        } catch (Exception e) {
            throw new RuntimeException("Error, valor no encontrado", e);
        }
    }
}

package PrincipalCodigo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMonedaApi {

    private static final String API_KEY = "f68a577a09361396af98bfbb";

    public String obtenerDatos(String monedaBase) {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + monedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return response.body(); // Devolvemos el JSON
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al consultar la API: " + e.getMessage());
            return null;
        }
    }
}
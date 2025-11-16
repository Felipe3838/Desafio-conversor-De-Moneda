package PrincipalCodigo;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AnalizandoJson {
    // Este método recibe el JSON (como String) y devuelve la tasa solicitada
    public double obtenerTasa(String json, String monedaObjetivo) {

        // Convertimos el String JSON a un objeto JSON
        JsonObject jsonObjeto = JsonParser
                .parseString(json)
                .getAsJsonObject();

        // Entramos al objeto "conversion_rates"
        JsonObject tasas = jsonObjeto.getAsJsonObject("conversion_rates");

        // Obtenemos la tasa que queremos (COP, EUR, ARS, etc.)
        return tasas.get(monedaObjetivo).getAsDouble();
    }

}

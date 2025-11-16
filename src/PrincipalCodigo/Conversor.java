package PrincipalCodigo;

public class Conversor {

    /**
     * Convierte una cantidad usando la tasa de conversión.
     *
     * @param cantidad Valor ingresado por el usuario
     * @param tasa     Tasa obtenida desde la API (por ejemplo COP, ARS, CLP, etc.)
     * @return El valor convertido
     */
    public double convertir(double cantidad, double tasa) {
        return cantidad * tasa;
    }
}

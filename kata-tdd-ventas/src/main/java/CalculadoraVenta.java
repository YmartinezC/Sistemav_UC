public class CalculadoraVenta {

    private static final double PORCENTAJE_DIVISOR = 100.0;

    public double calcularDescuento(double precio, double porcentaje) {
        validarParametros(precio, porcentaje);
        return precio * (porcentaje / PORCENTAJE_DIVISOR);
    }

    private void validarParametros(double precio, double porcentaje) {
        if (porcentaje < 0) {
            throw new IllegalArgumentException("El porcentaje no puede ser negativo");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }
}
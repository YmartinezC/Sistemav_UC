public class CalculadoraVenta {

    private static final double PORCENTAJE_DIVISOR = 100.0;
    private static final double IGV = 0.18;

    public double calcularDescuento(double precio, double porcentaje) {
        validarPrecio(precio);
        validarPorcentaje(porcentaje);
        return precio * (porcentaje / PORCENTAJE_DIVISOR);
    }

    public double calcularTotalConIGV(double precio) {
        validarPrecio(precio);
        return precio + calcularIGV(precio);
    }

    public boolean hayStockDisponible(int stockActual, int cantidadSolicitada) {
        validarStock(stockActual);
        validarCantidad(cantidadSolicitada);
        return stockActual >= cantidadSolicitada;
    }

    private double calcularIGV(double precio) {
        return precio * IGV;
    }

    private void validarPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    private void validarPorcentaje(double porcentaje) {
        if (porcentaje < 0) {
            throw new IllegalArgumentException("El porcentaje no puede ser negativo");
        }
    }

    private void validarStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
    }

    private void validarCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
    }
}
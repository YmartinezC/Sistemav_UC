import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraVentaTest {

    private final CalculadoraVenta calculadora = new CalculadoraVenta();

    // ===== KATA 1: Calcular Descuento =====

    @Test
    void debeCalcularDescuentoDel10PorCiento() {
        double resultado = calculadora.calcularDescuento(200.0, 10);
        assertEquals(20.0, resultado, 0.001);
    }

    @Test
    void debeRetornarCeroSiNoHayDescuento() {
        double resultado = calculadora.calcularDescuento(200.0, 0);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void descuentoNegativoDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularDescuento(200.0, -5);
        });
    }

    // ===== KATA 2: Calcular Total con IGV =====

    @Test
    void debeCalcularTotalConIGV() {
        double resultado = calculadora.calcularTotalConIGV(100.0);
        assertEquals(118.0, resultado, 0.001);
    }

    @Test
    void debeCalcularTotalConIGVDeCero() {
        double resultado = calculadora.calcularTotalConIGV(0.0);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void precioNegativoEnIGVDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularTotalConIGV(-50.0);
        });
    }

    // ===== KATA 3: Validar Stock Disponible =====

    @Test
    void debePermitirVentaSiHayStock() {
        boolean resultado = calculadora.hayStockDisponible(10, 3);
        assertTrue(resultado);
    }

    @Test
    void debeRechazarVentaSiNoHayStock() {
        boolean resultado = calculadora.hayStockDisponible(2, 5);
        assertFalse(resultado);
    }

    @Test
    void stockNegativoDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.hayStockDisponible(-1, 3);
        });
    }
}
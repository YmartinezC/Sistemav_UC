import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraVentaTest {

    // ===== KATA 1: Calcular Descuento =====

    @Test
    void debeCalcularDescuentoDel10PorCiento() {
        CalculadoraVenta calculadora = new CalculadoraVenta();
        double resultado = calculadora.calcularDescuento(200.0, 10);
        assertEquals(20.0, resultado, 0.001);
    }

    @Test
    void debeRetornarCeroSiNoHayDescuento() {
        CalculadoraVenta calculadora = new CalculadoraVenta();
        double resultado = calculadora.calcularDescuento(200.0, 0);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void descuentoNegativoDebeLanzarExcepcion() {
        CalculadoraVenta calculadora = new CalculadoraVenta();
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularDescuento(200.0, -5);
        });
    }
}
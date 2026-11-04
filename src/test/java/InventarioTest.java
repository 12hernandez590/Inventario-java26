import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {

    @Test
    void calculaSubtotalDeCuatroProductos() {
        int resultado = Inventario.calcularSubtotal(50, 4);

        assertEquals(200, resultado);
    }

    @Test
    void calculaSubtotalDeUnProducto() {
        int resultado = Inventario.calcularSubtotal(75, 1);

        assertEquals(75, resultado);
    }

    @Test
    void calculaSubtotalCeroCuandoLaCantidadEsCero() {
        int resultado = Inventario.calcularSubtotal(50, 0);

        assertEquals(0, resultado);
    }
}

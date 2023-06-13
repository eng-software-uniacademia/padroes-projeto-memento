import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class VeiculoTest {

    @Test
    void deveArmazenarEstados() {
        Veiculo veiculo = new Veiculo();
        veiculo.setEstado(VeiculoEstadoApreendido.getInstance());
        veiculo.setEstado(VeiculoEstadoDestruido.getInstance());
        assertEquals(2, veiculo.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Veiculo Veiculo = new Veiculo();
        Veiculo.setEstado(VeiculoEstadoApreendido.getInstance());
        Veiculo.setEstado(VeiculoEstadoDestruido.getInstance());
        Veiculo.restauraEstado(0);
        assertEquals(VeiculoEstadoApreendido.getInstance(), Veiculo.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Veiculo Veiculo = new Veiculo();
        Veiculo.setEstado(VeiculoEstadoApreendido.getInstance());
        Veiculo.setEstado(VeiculoEstadoLicenciado.getInstance());
        Veiculo.setEstado(VeiculoEstadoApreendido.getInstance());
        Veiculo.setEstado(VeiculoEstadoDestruido.getInstance());
        Veiculo.restauraEstado(2);
        assertEquals(VeiculoEstadoApreendido.getInstance(), Veiculo.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Veiculo Veiculo = new Veiculo();
            Veiculo.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}

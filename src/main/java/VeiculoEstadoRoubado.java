public class VeiculoEstadoRoubado implements VeiculoEstado {
    private VeiculoEstadoRoubado() { }
    private static final VeiculoEstadoRoubado instance = new VeiculoEstadoRoubado();

    public static VeiculoEstadoRoubado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Roubado";
    }
}

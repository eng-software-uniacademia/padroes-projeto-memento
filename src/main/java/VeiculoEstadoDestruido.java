public class VeiculoEstadoDestruido implements VeiculoEstado {
    private VeiculoEstadoDestruido() { }
    private static final VeiculoEstadoDestruido instance = new VeiculoEstadoDestruido();

    public static VeiculoEstadoDestruido getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Destruido";
    }
}

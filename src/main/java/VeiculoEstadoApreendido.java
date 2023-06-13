public class VeiculoEstadoApreendido implements VeiculoEstado {
    private VeiculoEstadoApreendido() { }
    private static final VeiculoEstadoApreendido instance = new VeiculoEstadoApreendido();

    public static VeiculoEstadoApreendido getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Apreendido";
    }
}

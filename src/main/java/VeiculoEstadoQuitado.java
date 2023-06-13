public class VeiculoEstadoQuitado implements VeiculoEstado {
    private VeiculoEstadoQuitado() { }
    private static final VeiculoEstadoQuitado instance = new VeiculoEstadoQuitado();

    public static VeiculoEstadoQuitado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Quitado";
    }
}

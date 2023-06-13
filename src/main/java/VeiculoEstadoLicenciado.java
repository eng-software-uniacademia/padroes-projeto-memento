public class VeiculoEstadoLicenciado implements VeiculoEstado {
    private VeiculoEstadoLicenciado() { }
    private static final VeiculoEstadoLicenciado instance = new VeiculoEstadoLicenciado();

    public static VeiculoEstadoLicenciado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Licenciado";
    }
}

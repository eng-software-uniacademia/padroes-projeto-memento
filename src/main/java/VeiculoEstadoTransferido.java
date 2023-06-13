public class VeiculoEstadoTransferido implements VeiculoEstado {
    private VeiculoEstadoTransferido() { }
    private static final VeiculoEstadoTransferido instance = new VeiculoEstadoTransferido();

    public static VeiculoEstadoTransferido getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Transferido";
    }
}

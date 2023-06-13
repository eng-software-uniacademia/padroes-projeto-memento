import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private VeiculoEstado estado;
    private List<VeiculoEstado> memento = new ArrayList<>();

    public VeiculoEstado getEstado() {
        return estado;
    }

    public void setEstado(VeiculoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }

        this.estado = this.memento.get(indice);
    }

    public List<VeiculoEstado> getEstados() {
        return this.memento;
    }
}

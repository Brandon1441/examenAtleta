import java.util.ArrayList;
import java.util.List;

public class EquipoNacional {
    private String color;
    private String pais;
    private List<Atleta> atletas;

    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
        this.atletas = new ArrayList<>();
    }

    public void agregarAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    public List<Double> obtenerAlturas() {
        List<Double> alturas = new ArrayList<>();
        for (Atleta atleta : atletas) {
            alturas.add(atleta.getAltura());
        }
        return alturas;
    }

    public List<Boolean> calcularPesoExtra() {
        List<Boolean> pesoExtra = new ArrayList<>();
        for (Atleta atleta : atletas) {
            pesoExtra.add(atleta.hayPesoExtra(atleta.getPeso(), atleta.getAltura()));
        }
        return pesoExtra;
    }
}

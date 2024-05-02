import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Instalacion {

    private String categoria;
    private String localizacion;
    private String nombre;
    private String tipo;
    private Map<Prueba, List<Atleta>> participantes;
    private Sede sede;

    public Instalacion(String categoria, String localizacion, String nombre, String tipo) {
        this.categoria = categoria;
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.tipo = tipo;
        this.participantes = new HashMap<>();
    }

    public void agregarParticipantes(Prueba prueba, List<Atleta> atletas) {
        participantes.put(prueba, atletas);
    }

    public String obtenerNombreAtletaPrueba(int codigoPrueba, int posicion) {
        for (Map.Entry<Prueba, List<Atleta>> entry : participantes.entrySet()) {
            Prueba prueba = entry.getKey();
            if (prueba.getCodigo() == codigoPrueba) {
                List<Atleta> atletas = entry.getValue();
                if (atletas.size() > posicion) {
                    return atletas.get(posicion).getNombre();
                }
            }
        }
        return "No se encontro";
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Map<Prueba, List<Atleta>> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Map<Prueba, List<Atleta>> participantes) {
        this.participantes = participantes;
    }
}

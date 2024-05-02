public class Sede {
    private int fase;
    private String fecha;
    private String hora;

    public Sede(int fase, String fecha, String hora) {
        this.fase = fase;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}

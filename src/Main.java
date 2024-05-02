
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Atleta atleta1 = new Atleta(43685554, "Ezequiel", 1.80, 21, 80.0);
        Atleta atleta2 = new Atleta(43885548, "Raul", 1.73, 22, 60.3);
        Atleta atleta3 = new Atleta(43125554, "Matias", 1.85, 23, 90.5);

        EquipoNacional equipoNacional = new EquipoNacional("Celeste y Blanco", "Argentina");
        equipoNacional.agregarAtleta(atleta1);
        equipoNacional.agregarAtleta(atleta2);
        equipoNacional.agregarAtleta(atleta3);

        Prueba prueba1 = new Prueba(736548, "Carrera de 100 metros");
        Prueba prueba2 = new Prueba(458745, "Salto de longitud");

        Instalacion instalacion = new Instalacion("Carrera", "Buenos Aires", "Estadio Mario Alberto Kempes", "Atletismo");
        instalacion.agregarParticipantes(prueba1, Arrays.asList(atleta1, atleta2, atleta3));
        instalacion.agregarParticipantes(prueba2, Arrays.asList(atleta2, atleta3, atleta1));


        Sede sede = new Sede(1, "2024-05-02", "12:00");

        System.out.println("****************************************************************************************************");
        System.out.println("Nombre del 3er atleta de la 2da prueba: " + instalacion.obtenerNombreAtletaPrueba(prueba2.getCodigo(), 2));

        System.out.println("Código de la 2da prueba: " + prueba2.getCodigo());


        List<Double> alturas = equipoNacional.obtenerAlturas();
        List<Boolean> pesoExtra = equipoNacional.calcularPesoExtra();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Altura de todos los atletas:");
        for (int i = 0; i < alturas.size(); i++) {
            System.out.println("Atleta " + (i + 1) + ": " + alturas.get(i) + " metros");
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Peso extra de cada atleta:");
        for (int i = 0; i < alturas.size(); i++) {
            System.out.println("Atleta " + (i + 1) +  " Peso extra: " + (pesoExtra.get(i) ? "Sí" : "No"));
        }

        System.out.println("****************************************************************************************************");
    }
}

public class Atleta extends Persona implements Contrato {
    private double altura;
    private int edad;
    private double peso;

    public Atleta(int dni, String nombre, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public double calculaIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public boolean hayPesoExtra(double peso, double altura) {
        double imc = calculaIMC(peso, altura);
        return imc > 25; 
    }

    @Override
    public double tomarPulsaciones() {
        double pulsaciones = 70.5;
        
        return pulsaciones; 
    }

    // Getters and setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaIMC() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hayPesoExtra(double peso) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

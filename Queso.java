public class Queso {
    private String tipo;
    private double peso; // en kilogramos
    private boolean curado;

    public Queso(String tipo, double peso, boolean curado) {
        this.tipo = tipo;
        this.peso = peso;
        this.curado = curado;
    }

    public void mostrarInformacion() {
        System.out.println("Tipo de queso: " + tipo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("¿Está curado?: " + (curado ? "Sí" : "No"));
    }

    public static void main(String[] args) {
        Queso miQueso = new Queso("Manchego", 1.2, true);
        miQueso.mostrarInformacion();
    }
}

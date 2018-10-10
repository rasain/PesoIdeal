package operaciones;

public class Salud {

    private String nombre;
    private String estadoPeso;
    private int edad;
    private int pesoActual;
    private int pesoIdeal;

    public int calcularPesoIdeal(){

        pesoIdeal = edad*2+8;

        return pesoIdeal;
    }

    public String compararPeso (){

        if(pesoIdeal<pesoActual){
            estadoPeso = "Sobre Peso";
        }else{
            if(pesoIdeal>pesoActual){
                estadoPeso = "Bajo Peso";
            }else{
                if(pesoActual==pesoIdeal){
                    estadoPeso = "Peso Ideal";
                }
            }
        }
        return estadoPeso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoPeso() {
        return estadoPeso;
    }

    public void setEstadoPeso(String estadoPeso) {
        this.estadoPeso = estadoPeso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }
}

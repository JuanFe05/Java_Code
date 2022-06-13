import java.util.*;

public class Trabajadores {

    // Atributos
    private String nombresTrabajador;
    private String apellidosTrabajador;
    private int edadTrabajador;
    private String turnoTrabajador;
    private double sueldoFijo;
    private int numeroHorasExtra;
    static final int VALOR_HORA_EXTRA = 50000;

    int numTrabajadoresTarde;

    // Constructor
    public Trabajadores() {
    }

    public Trabajadores(String nombresTrabajador, String apellidosTrabajador, int edadTrabajador, String turnoTrabajador, double sueldoFijo, int numeroHorasExtra) {
        this.nombresTrabajador = nombresTrabajador;
        this.apellidosTrabajador = apellidosTrabajador;
        this.edadTrabajador = edadTrabajador;
        this.turnoTrabajador = turnoTrabajador;
        this.sueldoFijo = sueldoFijo;
        this.numeroHorasExtra = numeroHorasExtra;
    }

    // Get and set
    public String getNombresTrabajador() {
        return nombresTrabajador;
    }

    public void setNombresTrabajador(String nombresTrabajador) {
        this.nombresTrabajador = nombresTrabajador;
    }

    public String getApellidosTrabajador() {
        return apellidosTrabajador;
    }

    public void setApellidosTrabajador(String apellidosTrabajador) {
        this.apellidosTrabajador = apellidosTrabajador;
    }

    public int getEdadTrabajador() {
        return edadTrabajador;
    }

    public void setEdadTrabajador(int edadTrabajador) {
        this.edadTrabajador = edadTrabajador;
    }

    public String getTurnoTrabajador() {
        return turnoTrabajador;
    }

    public void setTurnoTrabajador(String turnoTrabajador) {
        this.turnoTrabajador = turnoTrabajador;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public int getNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void setNumeroHorasExtra(int numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    // Mis métodos
    // Método para mostrar los trabajadores en general
    public void informacionTrabajadores(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores) {
        for(int i = 0; i < numeroTrabajadores; i++) {
            double sueldoConRecargo = (datosTrabajadores.get(i).getNumeroHorasExtra() * VALOR_HORA_EXTRA) + datosTrabajadores.get(i).getSueldoFijo();

            System.out.println(datosTrabajadores.get(i).getNombresTrabajador().toUpperCase() + " "
                    + datosTrabajadores.get(i).getApellidosTrabajador().toUpperCase() + " "
                    + datosTrabajadores.get(i).getEdadTrabajador() + " "
                    + datosTrabajadores.get(i).getTurnoTrabajador().toUpperCase() + " "
                    + "$" + datosTrabajadores.get(i).getSueldoFijo() + " "
                    + "$" + sueldoConRecargo + " "
                    + datosTrabajadores.get(i).getNumeroHorasExtra());
        }
    }

    // Método para saber la cantidad de trabajadores del turno de la mañana.
    public void trabajadoresTurnoManiana(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores){
        int trabajadoresManiana = 0;

        for(int i = 0; i < numeroTrabajadores; i++) {
            if (datosTrabajadores.get(i).getTurnoTrabajador().toUpperCase().equals("MAÑANA")){
                trabajadoresManiana ++;
            }
        }

        if (trabajadoresManiana == 0){
            System.out.println("NO HAY TRABAJADORES EN ESTE TURNO");
        } else {
            System.out.println("EL NÚMERO DE TRABAJADORES EN EL TURNO DE LA MAÑANA ES DE: " + trabajadoresManiana);
        }
    }

    // Método para saber la cantidad de trabajadores del turno de la Tarde.
    public void trabajadoresTurnoTarde(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores){
        int trabajadoresTarde = 0;

        for(int i = 0; i < numeroTrabajadores; i++) {
            if (datosTrabajadores.get(i).getTurnoTrabajador().toUpperCase().equals("TARDE")){
                trabajadoresTarde ++;
                numTrabajadoresTarde = trabajadoresTarde;
            }
        }

        if (trabajadoresTarde == 0){
            System.out.println("NO HAY TRABAJADORES EN ESTE TURNO");
        } else {
            System.out.println("EL NÚMERO DE TRABAJADORES EN EL TURNO DE LA TARDE ES DE: " + trabajadoresTarde);
        }

    }

    // Método para saber la cantidad de trabajadores del turno de la Noche.
    public void empleadosTurnoNoche(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores){
        int trabajadoresNoche = 0;

        for(int i = 0; i < numeroTrabajadores; i++) {
            if (datosTrabajadores.get(i).getTurnoTrabajador().toUpperCase().equals("NOCHE")){
                trabajadoresNoche ++;
            }
        }

        if (trabajadoresNoche == 0){
            System.out.println("NO HAY TRABAJADORES EN ESTE TURNO");
        } else {
            System.out.println("EL NÚMERO DE TRABAJADORES EN EL TURNO DE LA NOCHE ES DE: " + trabajadoresNoche);
        }
    }

    // Método para saber cuál es el trabajador del turno de la mañana que más salario devenga
    // y cuantas fueron las horas extras que hizo en el mes.
    public void trabajadorSalarioDevengado(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores){
        double sueldoConRecargo = 0;
        double mayorSalario = sueldoConRecargo;
        String nombre = "";
        int horas = 0;

        for (int i = 0; i < numeroTrabajadores; i++) {
            sueldoConRecargo = (datosTrabajadores.get(i).getNumeroHorasExtra() * VALOR_HORA_EXTRA) + datosTrabajadores.get(i).getSueldoFijo();

            if (sueldoConRecargo > mayorSalario && datosTrabajadores.get(i).getTurnoTrabajador().toUpperCase().equals("MAÑANA")) {
                mayorSalario = sueldoConRecargo;
                nombre = datosTrabajadores.get(i).getNombresTrabajador();
                horas =  datosTrabajadores.get(i).getNumeroHorasExtra();
            }
        }

        System.out.println(nombre.toUpperCase() + " $" + mayorSalario + " " + horas + "Horas\t");
    }

    // Método para mostrar el promedio del salario de los trabajadores del turno de la tarde.
    public void promedioSalarioTarde(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores){
        double sumaSalarios = 0, sueldoConRecargo;

        for (int i = 0; i < numeroTrabajadores; i++) {
            sueldoConRecargo = (datosTrabajadores.get(i).getNumeroHorasExtra() * VALOR_HORA_EXTRA) + datosTrabajadores.get(i).getSueldoFijo();

            if (datosTrabajadores.get(i).getTurnoTrabajador().toUpperCase().equals("TARDE")) {
                sumaSalarios += sueldoConRecargo;
            }
        }

        double promedioSalarios = sumaSalarios / numTrabajadoresTarde;

        System.out.println("EL PROMEDIO DE SALARIOS EN EL TURNO DE LA TARDE ES DE $" + promedioSalarios);
    }

    // Método para cuál es el trabajador más joven de toda la nómina.
    public void trabajadorMasJoven(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores){
        String nombres = datosTrabajadores.get(0).getNombresTrabajador();
        String apellidos = datosTrabajadores.get(0).getApellidosTrabajador();
        int edadJoven = datosTrabajadores.get(0).getEdadTrabajador();

        for (int i = 0; i < numeroTrabajadores; i++) {
            if (datosTrabajadores.get(i).getEdadTrabajador() < edadJoven) {
                edadJoven = datosTrabajadores.get(i).getEdadTrabajador();
                nombres = datosTrabajadores.get(i).getNombresTrabajador();
                apellidos =  datosTrabajadores.get(i).getApellidosTrabajador();
            }
        }

        System.out.println(nombres.toUpperCase() + " " + apellidos.toUpperCase() + " EDAD: " + edadJoven + " AÑOS\t");

    }

    // Método para cuál es el trabajador más viejo de toda la nómina.
    public void trabajadorMasViejo(ArrayList<Trabajadores> datosTrabajadores, int numeroTrabajadores){
        String nombres = datosTrabajadores.get(0).getNombresTrabajador();
        String apellidos = datosTrabajadores.get(0).getApellidosTrabajador();
        int edadViejo = datosTrabajadores.get(0).getEdadTrabajador();

        for (int i = 0; i < numeroTrabajadores; i++) {
            if (datosTrabajadores.get(i).getEdadTrabajador() > edadViejo) {
                edadViejo = datosTrabajadores.get(i).getEdadTrabajador();
                nombres = datosTrabajadores.get(i).getNombresTrabajador();
                apellidos =  datosTrabajadores.get(i).getApellidosTrabajador();
            }
        }

        System.out.println(nombres.toUpperCase() + " " + apellidos.toUpperCase() + " EDAD: " + edadViejo + " AÑOS\t");
    }

}

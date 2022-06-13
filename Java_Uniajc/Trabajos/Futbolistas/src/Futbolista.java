import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Futbolista {
    
    // Atributos
    private String nombreCompleto;
    private String nacionalidad;
    private int edad;
    private Posiciones posicion;
    private int dorsal;
    private String equipo;
    private String sueldoAnual;

    //Constructores
    public Futbolista() {
    }

    public Futbolista(String nombreCompleto, String nacionalidad, int edad, Posiciones posicion, int dorsal, String equipo, String sueldoAnual) {
        this.nombreCompleto = nombreCompleto;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.equipo = equipo;
        this.sueldoAnual = sueldoAnual;
    }
    
    //Get y Set
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Posiciones getPosicion() {
        return this.posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getEquipo() {
        return this.equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getSueldoAnual() {
        return this.sueldoAnual;
    }

    public void setSueldoAnual(String sueldoAnual) {
        this.sueldoAnual = sueldoAnual;
    }
    
    
    //Métodos propios

    // Método para agregar futbolista
    public void agregarFutbolista(ArrayList<Futbolista> arrayFutbolistas){
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Cuantos Futbolistas deseas agregar: ");
        String numeroFutbolistas = sc.nextLine();

        System.out.println("Agregar datos del futbolista separado por comas: ");

        for (int i = 0; i < Integer.parseInt(numeroFutbolistas); i++) {
            String datosFutbolista[] = sc.nextLine().split(",");

            String nombreCompleto = datosFutbolista[0];
            String nacionalidad = datosFutbolista[1];
            int edad = Integer.parseInt(datosFutbolista[2]);
            String posicion = datosFutbolista[3];
            int dorsal = Integer.parseInt(datosFutbolista[4]);
            String equipo = datosFutbolista[5];
            String sueldoAnual = datosFutbolista[6];

            Posiciones obtienePosicion = obtenerPosicionFutbolista(posicion);

            arrayFutbolistas
                    .add(new Futbolista(nombreCompleto, nacionalidad, edad, obtienePosicion, dorsal, equipo, sueldoAnual));
        }
        
    }

    //Método para retornar el enum
    public Posiciones obtenerPosicionFutbolista(String posicionFutbolista){
        
        Posiciones posicion = Posiciones.PORTERO;

        if (Posiciones.PORTERO.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.PORTERO;

        else if (Posiciones.DEFENSA_CENTRAL.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.DEFENSA_CENTRAL;

        else if (Posiciones.LATERAL_DERECHO.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.LATERAL_DERECHO;

        else if (Posiciones.LATERAL_IZQUIERDO.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.LATERAL_IZQUIERDO;

        else if (Posiciones.MEDIOCENTRO.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.MEDIOCENTRO;

        else if (Posiciones.MEDIAPUNTA.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.MEDIAPUNTA;

        else if (Posiciones.MEDIOCENTRO_DEFENSIVO.getNombrePosicion().equals(posicionFutbolista))
        posicion = Posiciones.MEDIOCENTRO_DEFENSIVO;

        else if (Posiciones.DELANTERO.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.DELANTERO;

        else if (Posiciones.EXTREMO_DERECHO.getNombrePosicion().equals(posicionFutbolista)) 
        posicion = Posiciones.EXTREMO_DERECHO;

        else if (Posiciones.EXTREMO_IZQUIERDO.getNombrePosicion().equals(posicionFutbolista))
        posicion = Posiciones.EXTREMO_IZQUIERDO;

        return posicion;
    }

    // Método para mostrar todos los futbolistas.
    public void mostrarFutbolistas(ArrayList<Futbolista> arrayFutbolistas){
        int numeroFutbolistas = 0;

        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %12s %15s %8s %8s %20s", "NOMBRE", "POSICION", "NACIONALIDAD", "DORSAL", "EDAD", "EQUIPO");
        System.out.println();
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        for (Futbolista futbolistas : arrayFutbolistas) {
            System.out.format("%15s %12s %15s %8d %8d %20s",
                    futbolistas.getNombreCompleto(),
                    futbolistas.getPosicion().getNombrePosicion(),
                    futbolistas.getNacionalidad(),
                    futbolistas.getDorsal(),
                    futbolistas.getEdad(),
                    futbolistas.getEquipo());
            System.out.println();

            numeroFutbolistas++;
        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------");

        if (numeroFutbolistas == 0) {
            System.out.println("NO HAY FUTBOLISTAS AGREADOS");
        }
    }

    // Método para mostrar todos los futbolistas por equipo.
    public void mostrarFutbolistasEquipo(ArrayList<Futbolista> arrayFutbolistas) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Ingresa el nombre del equipo: ");
        String nombreEquipo = sc.nextLine();

        int numeroFutbolistas = 0;

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("%18s %15s %15s %8s %15s", "EQUIPO", "NOMBRE", "POSICION", "DORSAL", "SALARIO");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        for (Futbolista futbolistas : arrayFutbolistas) {
            if (nombreEquipo.equals(futbolistas.getEquipo())) {
                System.out.format("%18s %15s %15s %8d %15s",
                        futbolistas.getEquipo(),
                        futbolistas.getNombreCompleto(), 
                        futbolistas.getPosicion().getNombrePosicion(), 
                        futbolistas.getDorsal(),
                        futbolistas.getSueldoAnual());
                System.out.println();

                numeroFutbolistas++;
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------");

        if (numeroFutbolistas == 0) {
            System.out.println("NO HAY FUTBOLISTAS EN ESTE EQUIPO");
        }
    }

    // Método para Eliminar futbolistas.
    public void eliminarFutbolista(ArrayList<Futbolista> arrayFutbolistas){
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Ingresa el nombre del jugador: ");
        String nombreFutbolista = sc.nextLine();

        int numeroFutbolistas = 0;

        for (int i = 0; i < arrayFutbolistas.size(); i++) {
            if (arrayFutbolistas.get(i).getNombreCompleto().equals(nombreFutbolista)) {
                Object ob = arrayFutbolistas.get(i);
                arrayFutbolistas.remove(ob);
                System.out.println("FUTBOLISTA ELIMINADO");

                numeroFutbolistas++;
            }
        }
        
        if (numeroFutbolistas == 0) {
            System.out.println("EL FUTBOLISTA NO EXISTE");
        }
    }

}

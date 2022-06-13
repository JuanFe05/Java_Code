public enum Posiciones {
    PORTERO(1, "POR"),
    DEFENSA_CENTRAL(2, "DFC"),
    LATERAL_DERECHO(3, "LD"),
    LATERAL_IZQUIERDO(4, "LI"),
    MEDIOCENTRO(5, "MC"),
    MEDIAPUNTA(6, "MP"),
    MEDIOCENTRO_DEFENSIVO(7, "MCD"),
    DELANTERO(8, "DC"),
    EXTREMO_DERECHO(9, "EXD"),
    EXTREMO_IZQUIERDO(9, "EXI");;

    private int codigoPosicion;
    private String nombrePosicion;

    // construtores
    private Posiciones(){
    }

    private Posiciones(int codigoPosicion, String nombrePosicion) {
        this.codigoPosicion = codigoPosicion;
        this.nombrePosicion = nombrePosicion;
    }

    //Get
    public int getCodigoPosicion() {
        return codigoPosicion;
    }

    public String getNombrePosicion() {
        return nombrePosicion;
    }

}

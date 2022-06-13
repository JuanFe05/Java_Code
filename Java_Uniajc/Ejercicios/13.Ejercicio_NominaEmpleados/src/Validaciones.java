public class Validaciones {
    // Método estáticos para realizar algunas validaciones
    static boolean validaOpcion(String sueldo) {
        try {
            Integer.parseInt(sueldo);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    static  boolean validaNombre(String nombres) {
        if (nombres.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    static  boolean validaApellido(String apellidos) {
        if (apellidos.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    static boolean validaEdad(String edad) {
        try {
            if (Integer.parseInt(edad) < 0){
                return false;
            } else if (Integer.parseInt(edad) >= 0 && Integer.parseInt(edad) < 16) {
                return false;
            } else if (Integer.parseInt(edad) >= 16 && Integer.parseInt(edad) <= 120) {
                return true;
            } else if (Integer.parseInt(edad) > 120) {
                return false;
            }
            return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    static boolean validaTurno(String turno){
        if (turno.toUpperCase().equals("MAÑANA") || turno.toUpperCase().equals("TARDE") || turno.toUpperCase().equals("NOCHE")){
            return true;
        } else {
            return false;
        }
    }

     static boolean validaSueldo(String sueldo) {
        try {
            Integer.parseInt(sueldo);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    static boolean validaHorasExtra(String horasExtra){
        try {
            Integer.parseInt(horasExtra);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}

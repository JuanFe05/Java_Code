public class Principal {
    public static void main(String[] args) {
        
        Statico metodoStaticPersona1 = new Statico();
        Statico metodoStaticPersona2 = new Statico();
        Statico metodoStaticPersona3 = new Statico(5810, "Felipe");

        // Set para modificar los datos
        metodoStaticPersona1.setCodigo(2130);
        metodoStaticPersona1.setNombre("GLORIA");

        System.out.println("CÓDIGO: " + metodoStaticPersona3.getCodigo());
        System.out.println("NOMBRE: " + metodoStaticPersona3.getNombre());

        System.out.println(Statico.codigoPostal());

        System.out.println("OBJ1: " + Statico.codigoPostal());
        System.out.println("OBJ2: " + Statico.codigoPostal());
        System.out.println(Statico.codigoPostal());
        
        // retorna el metodo toString
        System.out.println(metodoStaticPersona1);
        System.out.println(metodoStaticPersona2);
    }
}

public class App {
    public static void main(String[] args) {
        
        Calculadora calcu = new Calculadora(); // Utiliza el constructor vacio
        Calculadora calcu2 = new Calculadora(20, 80); // Utiliza constructor lleno

        calcu.saludo();

        System.out.println(calcu.sumar());
        System.out.println(calcu2.sumar());

        System.out.println(calcu.sumar(10, 20));
        System.out.println(calcu.sumar(6, 12));
    }
}

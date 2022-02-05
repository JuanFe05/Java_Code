public class Calculadora {
    // Atributos
    int numero1;
    int numero2;

    // Constructor vacio
    public Calculadora() {
        this.numero1 = 6;
        this.numero2 = 10;
    }

    // Constructor con argumentos.
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos, funciones
    public void saludo() {
        System.out.println("HOLA MUNDO");
    }

    public int sumar() {
        int resultado = this.numero1 + this.numero2; //el this, hace referencia a los atributos de las clase.
        return resultado;
    }

    public int sumar(int valor1, int valor2){
        int resultado = valor1 + valor2;
        return resultado;
    }
}

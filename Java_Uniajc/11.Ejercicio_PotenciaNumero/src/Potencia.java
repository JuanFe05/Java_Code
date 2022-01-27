public class Potencia {
    
    private int numero;
    private int potencia;

    public Potencia() {
    }

    public Potencia(int numero, int potencia) {
        this.numero = numero;
        this.potencia = potencia;
    }
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int calcular_potencia() {
        int resultado = 1;
        if (numero > 0 && potencia == 0) {
            return resultado;
        } else if (numero == 0 && potencia >= 1) {
            return 0;
        } else {
            for (int i = 1; i <= potencia; i++) {
                resultado = resultado * numero;
            }
            return resultado;
        }
    }

}

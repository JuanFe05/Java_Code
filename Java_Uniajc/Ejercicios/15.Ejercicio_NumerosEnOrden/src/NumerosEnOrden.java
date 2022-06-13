public class NumerosEnOrden {
    public static void main(String[] args) throws Exception {
        
        int num1 = 0, num2 = 25, num3 = -6554, num4 = -2;

        if (num1 < num2) { num1 += num2;  num2 = num1 - num2;  num1 -= num2; }
        if (num1 < num3) { num1 += num3;  num3 = num1 - num3;  num1 -= num3; }
        if (num1 < num4) { num1 += num4;  num4 = num1 - num4;  num1 -= num4; }
        
        if (num2 < num3) { num2 += num3;  num3 = num2 - num3;  num2 -= num3; }
        if (num2 < num4) { num2 += num4;  num4 = num2 - num4;  num2 -= num4; }
        
        if (num3 < num4) { num3 += num4;  num4 = num3 - num4;  num3 -= num4; }
        
        System.out.print(num1 + " " + num2 + " " + num3 + " " + num4);

    }
}

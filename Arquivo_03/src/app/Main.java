package app;

public class Main {
    public static void main (String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y); //Raiz Quadrada
        C = Math.sqrt(z);
        System.out.println("Raiz quadrada de " + x +" = " + A);
        System.out.println("Raiz quadrada de " + x +" = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);


        A = Math.pow(x, y);
        B= Math.pow(x, 2.0); // Potencia
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a  "  + y + " = "  + A );
        System.out.println( x + "elevado ao quadrado = " + B );
        System.out.println("5 elevado ao quadrado = " + C);


        A = Math.abs(y);
        B = Math.abs(y); // Valor Absoluto
        System.out.println("Valor abslouto de " + y +" = " + A);
        System.out.println("Valor abslouto de " + z +" = " + B);



    }
}

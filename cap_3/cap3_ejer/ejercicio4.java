package cap_3.cap3_ejer;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = s.nextInt();

        System.out.println("Ingresa el seguondo numero: ");
        int num2 = s.nextInt();


        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult= num1 * num2;
        double div = (double) num1 / (double) num2;

        System.out.println("La suma de estos 2 numeros es: "+suma);
        System.out.println("La resta de estos 2 numeros es: "+resta);
        System.out.println("La multiplicacion de estos 2 numeros es: "+mult);
        System.out.println("La division de estos 2 numeros es: "+div);

        s.close();
    }
}

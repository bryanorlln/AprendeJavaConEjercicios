package cap_3.cap3_ejer;

import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int numer1 = s.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int numer2 = s.nextInt();

        int multi = numer1 * numer2;

        System.out.print("La multiplicacion de los numeros ingresados es: " +multi );
        

        s.close();

    }
    
}

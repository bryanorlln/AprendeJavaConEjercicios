package cap_3.cap3_ejer;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Calculo del volumen de un cono"+"\nIngrese el radio:");
        double radio = s.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = s.nextDouble();
        double volumen = (double) 1 / 3 * (double) 3.14 * Math.pow(radio, 2) * altura;
        
        System.out.print("El calculo del volumen del cono es: "+ volumen);
        

        s.close();
    }
    
}

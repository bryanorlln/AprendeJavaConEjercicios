package cap_3.cap3_ejer;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int horas = s.nextInt();

        int salario = horas * 12;

        System.out.print("El calculo del salario a la semana en euros es: "+salario); 

        s.close();
    }
    
}

package cap_3.cap3_ejer;

import java.util.Scanner;
import java.lang.System;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        double tasadeCambio = 0.038;

        System.out.println("Ingresa la cantidad en lempiras para convertir a euros: ");
        double lempiras = s.nextDouble();

        double conversion = tasadeCambio * lempiras ;
        
        System.out.println(lempiras+" Lempiras a Euros son: "+ conversion);



        s.close();
    }
    
}

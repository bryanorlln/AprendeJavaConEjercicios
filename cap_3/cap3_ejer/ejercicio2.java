package cap_3.cap3_ejer;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        double tasadeCambio = 26.05;

        System.out.print("Ingresa la cantidad de euros para convertir a lempiras: ");
        double euros = s.nextDouble();

        double conversion = tasadeCambio * euros;

        System.out.print(euros + " Euros a  Lempiras son: " + conversion );


        s.close();
    }
    
}

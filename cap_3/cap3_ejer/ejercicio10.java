package cap_3.cap3_ejer;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Conversor de Mb a Kb"+"\nIngrese la cantidad de Mb: ");
        int Mb = s.nextInt();

        int Kb = 1000;
        int total = Mb * Kb;

        System.out.print("La cantidad de Kilobit son: "+total);


        s.close();

    }
    
}

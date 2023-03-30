package cap_3.cap3_ejer;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Conversor de Kb a Mb"+"\nIngrese la cantidad de Kb: ");
        double Kb = s.nextInt();

        double Mb = 0.001;
        double total = Kb * Mb;
        System.out.print("La cantidad total de Megabits son: "+total);


        s.close();

        
    }
    
}

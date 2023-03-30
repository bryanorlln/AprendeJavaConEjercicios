package cap_3.cap3_ejer;

import java.util.Scanner;

public class ejericio12 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double n1 = s.nextDouble();
        System.out.print("Que nota quieres sacer en el trimestre: ");
        double tri = s.nextDouble();

        double n2 = ((tri * 100) - (n1 * 40)) / 60;
        tri = ((n1 * 40) + (n2 * 60)) / 100;
        
        
        
        
        System.out.print("Para tener un "+tri+" en el trimestre necesitas sacar "+n2+" en el segundo examen.");



        s.close();
    }
    
}

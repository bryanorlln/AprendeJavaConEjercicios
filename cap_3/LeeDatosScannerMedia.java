package cap_3;
import java.util.Scanner;
public class LeeDatosScannerMedia {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

            System.out.print("Introduce tres numeros (pueden contener decimales) separados por espacio \s:");
            double x1 = s.nextDouble();
            double x2 = s.nextDouble();
            double x3 = s.nextDouble();

            double media = (x1 + x2 + x3) / 3;

            System.out.print("La media de esos tres numeros es: "+media);


        s.close();

    }
    
}

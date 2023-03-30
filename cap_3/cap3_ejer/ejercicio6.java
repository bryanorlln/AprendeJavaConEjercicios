package cap_3.cap3_ejer;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Calcule el Area de un Triangulo: " + "\nIngrese la base: ");
        int base = s.nextInt();
        System.out.print("Ingrese la altura: ");
        int altura = s.nextInt();
        
        int area = base * altura /2;

        System.out.print("El area de el rectangulo es: "+area);

        s.close();
    }
    
}

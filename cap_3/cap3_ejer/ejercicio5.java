package cap_3.cap3_ejer;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Calcule el Area de un rectangulo"+"\nIngrese la base del rectangulo: ");
        int base = s.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        int altura = s.nextInt();

        int area = base * altura;

        System.out.println("El area del rectangulo es: "+area);


        s.close();
    }
    
}

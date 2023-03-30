package cap_3.cap3_ejer;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el subtotal de una factura: ");
        double subtotal = s.nextDouble();
        System.out.print("Ingrese porcentaje del IVA %:");
        double IVA = s.nextDouble();

        double total = subtotal * IVA;

        System.out.println("╔════════════════════════════╗");
        System.out.println("║ Plastikal S.A de Honduras  ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║  Subtotal:        "+subtotal+"   ║");
        System.out.println("║  IVA:             "+IVA+"     ║");
        System.out.println("║  TOTAL:           "+total+"   ║");
        System.out.println("╚════════════════════════════╝");


        s.close();

    }
    
}

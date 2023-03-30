package cap_2.cap2_ejer;

public class ejercicio6 {
    public static void main(String[] args) {
        
        double iva = 15;
        double juegovasos = 50;
        double juegoplatos = 120;
        double juegocubiertos = 25;
        double subtotal;
        double total;

        subtotal = (juegocubiertos+juegoplatos + juegovasos);
        total = subtotal*iva;

        System.out.println("╔════════════════════════════╗");
        System.out.println("║ Plastikal S.A de Honduras  ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║ Producto          Precio   ║");
        System.out.println(  "║Juego de Vasos     "+juegovasos+"     ║");
        System.out.println(  "║Juego de Platos    "+juegoplatos+"    ║");
        System.out.println(  "║Juego de Cubiertos "+juegocubiertos+"     ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║        Subtotal:  "+subtotal+"    ║");
        System.out.println("║        IVA:       "+iva+"     ║");
        System.out.println("║        TOTAL:     "+total+"   ║");
        System.out.println("╚════════════════════════════╝");

    }
    
}

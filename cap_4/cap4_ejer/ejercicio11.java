package cap_4.cap4_ejer;

public class ejercicio11 {
    public static void main(String[] args) {


        System.out.println("Hora: ");
        int hora = Integer.parseInt(System.console().readLine());

        System.out.println("minuto: ");
        int minuto = Integer.parseInt(System.console().readLine());

        int segundosTranscurridos = (hora * 3600) + (minuto * 60);
        int segundosHastamedianoche = (24 * 3600) - segundosTranscurridos;

        System.out.println("Desde las "+ hora + ":" + minuto + " hasta la medianoche faltan "+ segundosHastamedianoche + " segundos.");
    }
    
}

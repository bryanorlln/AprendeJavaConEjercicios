package cap_3;

public class leenumeros {
    public static void main(String[] args) {
        

        System.out.print("Por favor, introduce un numero: ");
        int primerNumero = Integer.parseInt(System.console().readLine());

        System.out.print("introduce otro, por favor: ");
        int segundoNumero = Integer.parseInt(System.console().readLine());

        int total = (2 * primerNumero ) + segundoNumero;

        System.out.println("El primer numero introducido es: "+ primerNumero);
        System.out.println("El segundo numero introducido es: "+ segundoNumero);

        System.out.print("El doble del primer numero mas el segundo es: ");
        System.out.print(total);
    }
    
}

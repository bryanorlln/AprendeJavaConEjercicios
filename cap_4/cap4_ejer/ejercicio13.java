package cap_4.cap4_ejer;

public class ejercicio13 {
    public static void main(String[] args) {

        int aux;

        System.out.println("Ingresa 3 numeros enteros para ordenarlos");
        int numero1 = Integer.parseInt(System.console().readLine());
        int numero2 = Integer.parseInt(System.console().readLine());
        int numero3 = Integer.parseInt(System.console().readLine());

        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        if (numero2 > numero3) {
            aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        
    System.out.println("Los numeros introducidos de menor a mayor son: "+numero1+", "+numero2+" y "+numero3+".");
    }
    
}

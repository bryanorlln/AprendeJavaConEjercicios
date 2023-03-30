package cap_4.cap4_ejer;

public class ejercicio14 {
    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int num = Integer.parseInt(System.console().readLine());

        if ((num % 3) == 0) {
            System.out.print("Este numero es par");
        }else {
            System.out.println("Este numero es impar");
        }

        if ((num % 5) == 0) {
            System.out.println(" y divisible entre 5");
        }else {
            System.out.println(" y no es divisible entre 5");
        }
        
}
    
}

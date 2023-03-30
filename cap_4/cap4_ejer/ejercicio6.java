package cap_4.cap4_ejer;

public class ejercicio6 {

    public static void main(String[] args) {
        
        System.out.println("Este programa calcula el tiempo que tarde de caer de un objeto");
        System.out.println("Ingresa la altura: ");
        double h = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la gravedad del planeta: ");
        double g = Double.parseDouble(System.console().readLine());
        // Aqui Math.sqrt es para sacar la raiz cuadrada de la operacion dentro de la funcion
        double t = Math.sqrt(2 * h / g);
        // Esta linea de codigo es para redondear el resultado y quede en decimales de 2 digitos
        double sqrt = Math.round(t*100.0)/100.0;
        System.out.println("El tiempo de caída es: "+ sqrt);
    }
    
}

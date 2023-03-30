package cap_4.cap4_ejer;

public class ejercicio5 {
    public static void main(String[] args) {
        
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de tipo a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.println("Ahora, introduzca el valor de tipo b: ");
        double b = Double.parseDouble(System.console().readLine());

        double x = -(b / a);

        System.out.println("x = "+x);
        
        
    }
    
}

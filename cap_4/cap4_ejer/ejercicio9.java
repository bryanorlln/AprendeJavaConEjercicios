package cap_4.cap4_ejer;

public class ejercicio9 {
    public static void main(String[] args) {
        
        System.out.println("Programa para resolver ecuaciones de segundo grado 'ax² + bx + c = 0' ");
        System.out.println("Ingresa el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa el valor de b: ");
        double b = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa del valor de c: ");
        double c = Double.parseDouble(System.console().readLine());

        double paso1 = (double)b*(double)b - 4*(double)a*(double)c;
        double paso2 = Math.sqrt(Math.abs(paso1));
        double paso3 = 2*(double)a;
        double paso4 = (-(double)b + paso2) / paso3;
        double paso5 = (-(double)b - paso2) / paso3;

        System.out.println("Paso 1: " + paso1);
        System.out.println("paso 2: "+paso2);
        System.out.println("paso 3: "+paso3);
        System.out.println("x1: "+paso4+"\nx2: "+paso5);



    }
    
}

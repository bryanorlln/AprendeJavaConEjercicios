package cap_4;


public class MenuConSwitch {
    public static void main(String[] args) {
        
        System.out.println(" CÁLCULO DE ÁREAS ");
        System.out.println("------------------");
        System.out.println(" 1. Cuadrado");
        System.out.println(" 2. Rectángulo");
        System.out.println(" 3. Triangulo");
        System.out.println("\n Elija una opcion (1-3): ");

        int opcion = Integer.parseInt(System.console().readLine());

        double lado;
        double base;
        double altura;

        switch (opcion) {
            case 1:
                System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
                lado = Double.parseDouble(System.console().readLine());
                System.out.println("\nEl area del cuadrado es: " + (lado*lado)+" cm2");
                break;
            case 2:
                System.out.print("\nIntroduzca la base del rectangulo en cm: ");
                base = Double.parseDouble(System.console().readLine());
                System.out.print("\nIntroduzca la altura del rectangulo en cm: ");
                altura = Double.parseDouble(System.console().readLine());
                System.out.print("\nEl area de un rectangulo es: "+(base*altura)+" cm2");
                break;
            case 3:
                System.out.print("\nIntroduzca la base del triangulo en cm: ");
                base = Double.parseDouble(System.console().readLine());
                System.out.print("\nIntroduzca la altura del triangulo en cm: ");
                altura = Double.parseDouble(System.console().readLine());
                System.out.print("\nEl area del triangulo es: "+(base*altura)/2+" cm2");
                break;
            default:
                System.out.println("Lo siento, la opcion elegida no es correcta!");
                break;
        }
    }
}

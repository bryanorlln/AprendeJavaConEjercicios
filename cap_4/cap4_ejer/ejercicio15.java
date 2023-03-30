package cap_4.cap4_ejer;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        String y = s.next();
        System.out.println("Elija el vertice de la piramide: "+
        "\n1.Vertice hacia arriba"+"\n2.Vertice hacia la izquierda"+
        "\n3.Vertice hacia abajo"+"\n4.Vertice hacia la derecha");
        int ver = Integer.parseInt(System.console().readLine());

        switch (ver) {
            case 1:
            System.out.println("              "+y);
            System.out.println("            "+y+" "+y+" "+y);
            System.out.println("          "+y+" "+y+" "+y+" "+y+" "+y);
            System.out.println("        "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
            System.out.println("      "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
            System.out.println("    "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
            System.out.println("  "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
            System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                break;
            case 2:
                System.out.println("              "+y);
                System.out.println("            "+y+" "+y);
                System.out.println("          "+y+" "+y+" "+y);
                System.out.println("        "+y+" "+y+" "+y+" "+y);
                System.out.println("      "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("    "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("  "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("  "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("    "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("      "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("        "+y+" "+y+" "+y+" "+y);
                System.out.println("          "+y+" "+y+" "+y);
                System.out.println("            "+y+" "+y);
                System.out.println("              "+y);
                break;
            case 3:
                System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("  "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("    "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("      "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("        "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("          "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println("            "+y+" "+y+" "+y);
                System.out.println("              "+y);
                break;
            case 4:
                System.out.println(y);
                System.out.println(y+" "+y);
                System.out.println(y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y+" "+y);
                System.out.println(y+" "+y+" "+y);
                System.out.println(y+" "+y);
                System.out.println(y);
                

                break;
        
            default:
                break;
        }

        s.close();
    }
    
}

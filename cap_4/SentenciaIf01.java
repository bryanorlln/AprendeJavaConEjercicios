package cap_4;

import java.util.Scanner;

public class SentenciaIf01 {
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("¿Cual es la capital de kiribati?");
        String respuesta = s.nextLine();

        if (respuesta.equals("Tarawa")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
            
        }
        s.close();
    }
}

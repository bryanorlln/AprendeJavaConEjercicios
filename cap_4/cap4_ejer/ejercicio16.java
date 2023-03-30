package cap_4.cap4_ejer;

public class ejercicio16 {
    public static void main(String[] args) {
        
        int x = 0;
        System.out.println("    Test de Infidelidad");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
        String respuesta = System.console().readLine();
        

        if (respuesta.equals("v")) {
            x += 3;
            
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
            
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
            
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also:");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;

        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
            
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más.\n(v)erdadero o (f)also:");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if (respuesta.equals("v")) {
            x += 3;
        }

        // RESULTADOS DE LOS PUNTOS SUMADOS

        if (x <= 10) {
            System.out.println("Enhorabuena, tu pareja parece ser totalmente feliz. ");
            
        }
        if ((x >= 11) && (x <= 22)) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aun que seguramente será algo sin importancia. No bajes la guardia.");

        }
        if (x  >= 22) {
            System.out.println("F en el chat, chavales");
            
        }
        






    }
}

package cap_4.cap4_ejer;

public class ejercicio12 {
    public static void main(String[] args) {
        
        String respuesta;
        int x1 =0;

        System.out.println("Cuestionario sobre Geografia");
        System.out.println("¿Cuál es el río más largo del mundo?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Amazonas") ) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("¿Cuál es el Monte mas grande del mundo?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Monte Everest")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("¿Cual es la Capital de Honduras?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Tegucigalpa")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("¿Cual es rio mas grande de Honduras?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Ulua")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("¿Cuantos Estados tiene Estados Unidos?");
        respuesta = System.console().readLine();

        if (respuesta.equals("51")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("¿Cual es el desierto mas grande del mundo?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Sahara")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("¿Cuales son los polos de la tierra?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Polo Norte y Polo Sur")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("¿Cuantos continentes tiene la tierra");
        respuesta = System.console().readLine();

        if (respuesta.equals("5")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("¿En que continente se ubica España?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Europeo")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("¿Cual es el Continente mas grande del munod?");
        respuesta = System.console().readLine();

        if (respuesta.equals("Continente Americano")) {
            System.out.println("Correcto");
            x1++;

        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("Total de puntos: "+ x1);
    }
    
}

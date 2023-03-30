package cap_4.cap4_ejer;

public class ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("Escribe una hora exacta del formato 24h sin minutos para que la consola te salude");
        String linea = System.console().readLine();
        int hora = Integer.parseInt(linea);

        if ((hora >=6) && (hora <=12)) {
            System.out.println("Buenos Dias");
        }
        if ((hora >=13) && (hora <=20)) {
            System.out.println("Buenas Tardes");
            
        }
        if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0) )) {
            System.out.println("Buenas Noches");
            
        }
        if ((hora >= 24 || (hora < 0))) {
            System.out.println("La hora introducida no es la correcta ");
            
        }
        
    }
    
}

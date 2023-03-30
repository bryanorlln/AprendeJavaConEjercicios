package cap_4.cap4_ejer;

public class ejercicio1 {
    public static void main(String[] args) {
        
        System.out.println("Escribe un día de la semana para darte la clase a primera hora: ");
        String dia = System.console().readLine();

        switch (dia) {
            case "Lunes":
                System.out.println("En este día a primera hora se tendra la clase de Matematicas");
                break;
            case "Martes":
                System.out.println("En este día a primera hora se tendra la clase de Español");
                break;
            case "Miercoles":
                System.out.println("En este día a primera hora se tendra la clase de Ciencias");
                break;
            case "Jueves": 
                System.out.println("En este día a primera hora se tendra la clase de Sociales");
                break;
            case "Viernes":
                System.out.println("En este día a primera hora se tendra la clase de Informatica");
                break;
            case "Sabado":
                System.out.println("En este día a primera hora se tendra la clase de Artistica");
                break;
            case "Domingo":
                System.out.println("En este día a primera hora se tendra la clase de Ofimatica");
                break;
            default:
                System.out.println("Este día no existe en la base de datos");
                break;
        }

    }
    
}

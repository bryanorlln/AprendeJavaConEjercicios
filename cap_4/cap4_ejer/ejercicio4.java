package cap_4.cap4_ejer;

public class ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horas = Integer.parseInt(System.console().readLine());

        if (horas <= 40){
            System.out.println("Su salario es: "+(horas*12));
        }else{
            System.out.println("Su salario es: "+((40*12)+(horas-40)*16));
        }
    }
    
}

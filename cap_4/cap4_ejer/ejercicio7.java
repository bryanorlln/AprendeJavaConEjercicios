package cap_4.cap4_ejer;

public class ejercicio7 {
    public static void main(String[] args) {
        
        System.out.println("Este programa calcula la media de 3 notas escolar: ");
        System.out.println("Ingresa la primera nota");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la segunda nota");
        double nota2 = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la tercera nota");
        double nota3 = Double.parseDouble(System.console().readLine());


        double notaFinal = (nota1+nota2+nota3)/3;

        System.out.println("La media de la nota es: "+notaFinal);
    }
    
}

package cap_4.cap4_ejer;

public class ejercicio8 {
    public static void main(String[] args) {
        
        System.out.println("Este programa calcula la media de 3 notas escolar: ");
        System.out.println("Ingresa la primera nota");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la segunda nota");
        double nota2 = Double.parseDouble(System.console().readLine());
        System.out.println("Ingresa la tercera nota");
        double nota3 = Double.parseDouble(System.console().readLine());


        double notaFinal = Math.round((nota1+nota2+nota3)/3);


        if ((notaFinal > 0) && (notaFinal <= 59)) {
            System.out.println("Su nota es " + notaFinal + " Insuficiente");
            
        }
        if ((notaFinal >= 60) && (notaFinal <= 79)) {
            System.out.println("Su nota es " + notaFinal + " Suficiente");
        }
        if ((notaFinal >= 80) && (notaFinal <= 89)) {
            System.out.println("Su nota es " + notaFinal +" Bien");
        }
        if ((notaFinal >= 90) && (notaFinal <= 99)) {
            System.out.println("Su nota es " + notaFinal +" Notable");
            
        }
        if (notaFinal == 100) {
            System.out.println("Su nota es " + notaFinal +" Sobresaliente");
        } 
        
    }
}

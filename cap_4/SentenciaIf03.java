package cap_4;

public class SentenciaIf03 {
    public static void main(String[] args) {
        System.out.print("¿Que notas has sacado en el ultimo examen: ");
        String line = System.console().readLine();
        double nota = Double.parseDouble(line);
        
        if (nota >=5) {
            System.out.println("Enhorabuena, has aprobado");
            
        } else {
            System.out.println("Lo siento, has suspendido");
            
        }
    }
}

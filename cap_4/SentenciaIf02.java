package cap_4;

public class SentenciaIf02 {
    public static void main(String[] args) {
        
        System.out.println("Por favor introduce un numero entero: ");
        String linea = System.console().readLine();
        int x = Integer.parseInt(linea);

        if (x < 0) {
            System.out.println("El numero intrducido es negativo");
            
        } else {
            System.out.println("El numero introducido es positivo");
            
        }
    }
    
}

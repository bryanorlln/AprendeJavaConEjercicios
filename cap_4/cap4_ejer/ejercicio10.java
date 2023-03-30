package cap_4.cap4_ejer;

public class ejercicio10 {
    public static void main(String[] args) {
        
        System.out.println("Calendario del Horoscopo");
        System.out.println("Ingrese el numero del signo que quiere ver");
        System.out.println("1. Aries"+"\n2. Tauro"+"\n3. Geminis"+"\n4. Cancer"+"\n5. Leo"
        +"\n6. Virgo"+"\n7. Libra"+"\n8. Escorpio"+"\n9. Sagitario"+"\n10. Capricornio"
        +"\n11. Acuario"+"\n12. Piscis");
        int signo = Integer.parseInt(System.console().readLine());

        switch (signo) {
            case 1:
            System.out.println("Del 21 de marzo al 20 de abril, tu signo es Aries");
                break;
            case 2:
            System.out.println("Del 21 de abril al 21 de mayo, tu signo es Tauro");
                break;
            case 3:
            System.out.println("Del 22 de mayo al 21 de junio, tu signo es Geminis");
                break;
            case 4:
            System.out.println("Del 22 de junio al 22 de julio, tu signo es Cancer");
                break;
            case 5:
            System.out.println("Del 23 de julio al 22 de agosto, tu signo es Leo");
                break;
            case 6:
            System.out.println("Del 23 de agosto al 22 de septiembre, tu signo es Virgo");
                break;
            case 7:
            System.out.println("Del 23 de septiembre al 22 de octubre, tu signo es Libra");
                break;
            case 8:
            System.out.println("Del 23 de octubre al 22 de noviembre, tu signo es Escorpio");
                break;
            case 9:
            System.out.println("Del 23 de noviembre al 21 de diciembre, tu signo es Sagitario");
                break;
            case 10:
            System.out.println("Del 22 de diciembre al 20 de enero, tu signo es Capricornio");
                break;
            case 11:
            System.out.println("Del 21 de enero al 19 de febrero, tu signo es Acuario");
                break;
            case 12:
            System.out.println("Del 19 de febrero al 20 de marzo, tu signo es Piscis");
                break;
            default:
            System.out.println("El numero ingresado no esta en el Calendario");
                break;
        }
    }
    
}

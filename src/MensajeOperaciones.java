import java.util.Scanner;

public class MensajeOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Hola " + nombre + " ten un buen dia");

        System.out.print("Introduce tu nombre: ");
        String nombre2 = sc.nextLine();

        System.out.println("Espero verte pronto por aqui " + nombre2);

        sc.close();
    }
}

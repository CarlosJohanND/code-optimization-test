import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        /*el limite de edad quedara como constante ya que es un valor que no cambia*/
        final int AGE_LIMIT = 18;

        /*Le pedimos la edad al usuario */
        System.out.println("Escriba su edad: ");
        int age = scanner.nextInt();
        
        /*Eliminamos el otro if porque era innesesario, y comprobamos la edad usando el datos que nos dio el usuario y la constrante de age limit */
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }
        
    }
}

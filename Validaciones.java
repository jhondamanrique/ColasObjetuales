
import java.util.Scanner;

public class Validaciones {
    public int ValidarEntero(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println("Entrada no valida, por favor ingrese un numero entero: ");
            sc.nextLine();
        }
        return sc.nextInt();
    }
}


package encuesta;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Encuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int edad = S.nextInt();
    String EDADentexto = String.valueOf(edad);
    System.out.println("your age is " + EDADentexto + "?");

    
        // TODO code application logic here
    }
    
}

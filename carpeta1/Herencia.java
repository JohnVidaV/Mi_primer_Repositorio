package carpeta1;
import java.util.Scanner;
import carpeta2.*;

public class Herencia extends variables{
    public int pedir()
    {
        Scanner lector=new Scanner(System.in);
        Proceso ref=new Proceso();
        System.out.println("Ingrese el primer numero");
        n1=lector.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2=lector.nextInt();
        return ref.multiplicar(n1,n2);

    }
}

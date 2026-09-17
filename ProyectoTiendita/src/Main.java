
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlProductos mControl = new ControlProductos();
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("Productos");
            System.out.println("1-Agregar");
            System.out.println("2-Ver lista");
            System.out.println("3-Buscar");
            System.out.println("Selecciona la opcion ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> mControl.agregar();
                case 2 -> mControl.ver();
                case 3 -> mControl.buscar();

            }
        } while (opcion != 0);
    }

}

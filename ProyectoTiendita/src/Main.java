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
            System.out.println("4-Borrar");
            System.out.println("5-Modificar");
            System.out.println("0-Salir");
            System.out.println("Selecciona la opcion ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> mControl.agregar();
                case 2 -> mControl.ver();
                case 3 -> mControl.buscar();
                case 4 -> mControl.borrar();
                case 5 -> mControl.modificar();
            }
        } while (opcion != 0);
    }

}
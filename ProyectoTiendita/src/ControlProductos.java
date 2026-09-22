import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlProductos {
    
    private List<Producto> listaProductos = new ArrayList();
    private Scanner teclado = new Scanner(System.in);
    
    public void inicializar(){
        listaProductos.add(new Producto(1,"Soda",20f));
        listaProductos.add(new Producto(2,"Galletas",15f));
        listaProductos.add(new Producto(3,"Chicle",2.5f));
    }

    // === RAMA: feature/gestion-producto ===
    void agregar() {
        System.out.print("Código: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Descripción: ");
        String descripcion = teclado.nextLine();
        System.out.print("Precio: ");
        float precio = teclado.nextFloat();

        listaProductos.add(new Producto(codigo, descripcion, precio));
        System.out.println("✅ Producto agregado correctamente.");
    }

    void ver() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void buscar() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void borrar() {
        throw new UnsupportedOperationException("En construcción."); 
    }
    
    void modificar() {
        throw new UnsupportedOperationException("En construcción."); 
    }
}
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

    void agregar() {
        throw new UnsupportedOperationException("En construcción."); 
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


    void gestionar() {
        System.out.println("=== GESTIÓN DE PRODUCTOS ===");
        System.out.println("Total de productos en la lista: " + listaProductos.size());
        System.out.println("Productos registrados:");
        for (Producto p : listaProductos) {
            System.out.println(" - " + p.getCodigo() + " | " 
                    + p.getDescripcion() + " | $" + p.getPrecio());
        }
    }
}
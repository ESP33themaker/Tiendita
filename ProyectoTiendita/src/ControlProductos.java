
import java.util.ArrayList;
import java.util.List;

public class ControlProductos {
    
    private List<Producto> listaProductos=new ArrayList();
    
    public void inicializar(){
        listaProductos.add(new Producto(1,"Soda",20f));
        listaProductos.add(new Producto(2,"Galletas",15f));
        listaProductos.add(new Producto(3,"Chicle",2.5f));
    }

    void agregar() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void ver() {
        if (listaProductos.isEmpty()) {
        System.out.println("La lista de productos está vacía.");
        return;
    }

    System.out.println("=== LISTA DE PRODUCTOS ===");
    System.out.printf("%-8s %-20s %-10s%n", "CÓDIGO", "DESCRIPCIÓN", "PRECIO");
    System.out.println("----------------------------------------");
    
    for (Producto p : listaProductos) {
        System.out.printf("%-8d %-20s $%.2f%n", 
            p.getCodigo(), 
            p.getDescripcion(), 
            p.getPrecio()
        );
    }
    System.out.println("----------------------------------------");
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


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        throw new UnsupportedOperationException("En construcción."); 
    }

    void buscar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el código del producto a buscar: ");
        int codigoBuscar = teclado.nextInt();
        
        boolean encontrado = false;
        for (Producto p : listaProductos) {
            if (p.getCodigo() == codigoBuscar) {
                System.out.println("----------------------------------------------------------");
                System.out.printf("%-10s | %-25s | %-10s%n", "CÓDIGO", "DESCRIPCIÓN", "PRECIO");
                System.out.println("----------------------------------------------------------");
                System.out.printf("%-10d | %-25s | $%-10.2f%n", 
                                  p.getCodigo(), 
                                  p.getDescripcion(), 
                                  p.getPrecio());
                System.out.println("----------------------------------------------------------");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("❌ Producto con código " + codigoBuscar + " no encontrado.");
        }
    }

    void borrar() {
        throw new UnsupportedOperationException("En construcción."); 
    }
    
    void modificar() {
        throw new UnsupportedOperationException("En construcción."); 
    }
    
    
}

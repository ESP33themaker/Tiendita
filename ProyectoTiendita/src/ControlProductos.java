
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
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\n--- AGREGAR NUEVO PRODUCTO ---");
        
        System.out.print("Ingresa el código (número entero): ");
        int codigo = teclado.nextInt();
        
        // Limpiamos el buffer del teclado
        teclado.nextLine(); 
        
        System.out.print("Ingresa la descripción: ");
        String descripcion = teclado.nextLine();
        
        System.out.print("Ingresa el precio: ");
        float precio = teclado.nextFloat();
        
        // Creamos el objeto y lo agregamos a la lista del proyecto
        Producto nuevo = new Producto(codigo, descripcion, precio);
        listaProductos.add(nuevo);
        
        System.out.println("¡Producto agregado con éxito a la lista!\n");
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

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
        throw new UnsupportedOperationException("En construcción."); 
    }

    void buscar() {
        throw new UnsupportedOperationException("En construcción."); 
    }

    void borrar() {
        throw new UnsupportedOperationException("En construcción."); 
    }
    
    void modificar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del producto a modificar: ");
        int codigoBuscado;
        try {
            codigoBuscado = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un código numérico válido.");
            return;
        }
        Producto productoAEditar = null;
        for (Producto p : listaProductos) {
            if (p.getCodigo() == codigoBuscado) {
                productoAEditar = p;
                break;
            }
        }
        if (productoAEditar == null) {
            System.out.println("No se encontró ningún producto con el código: " + codigoBuscado);
            return;
        }
        System.out.println("\nProducto actual: " + productoAEditar);
        System.out.print("Nueva descripción (Presione Enter para mantener '" + productoAEditar.getDescripcion() + "'): ");
        String nuevaDescripcion = scanner.nextLine();
        if (!nuevaDescripcion.trim().isEmpty()) {
            productoAEditar.setDescripcion(nuevaDescripcion);
        }
        System.out.print("Nuevo precio (Presione Enter para mantener " + productoAEditar.getPrecio() + "): ");
        String nuevoPrecioStr = scanner.nextLine();
        if (!nuevoPrecioStr.trim().isEmpty()) {
            try {
                float nuevoPrecio = Float.parseFloat(nuevoPrecioStr);
                if (nuevoPrecio >= 0) {
                    productoAEditar.setPrecio(nuevoPrecio);
                } else {
                    System.out.println("El precio no puede ser negativo. Se mantiene el precio anterior.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de precio inválido. Se mantiene el precio anterior.");
            }
        }    
        System.out.println("¡Producto modificado exitosamente!\n"); 
    }
    
    
}

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
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el codigo del producto que deseas borrar: ");
        int codigo = teclado.nextInt();
        
        boolean eliminado = listaProductos.removeIf(producto -> producto.getCodigo() == codigo);
        
        if (eliminado) {
            System.out.println("Producto eliminado correctamente.");
        } else { 
            System.out.println("No se encontro un producto con ese codigo."); }
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
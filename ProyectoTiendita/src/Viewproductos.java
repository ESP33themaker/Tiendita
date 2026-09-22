/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enriq
 */

import java.util.List;

public class Viewproductos {
    public static void desplegarlista(List<Producto> productos) {
        if (productos == null || productos.isEmpty()) {
            System.out.println("No hay productos en la lista");
            return;
        }

        System.out.println("               LISTA DE PRODUCTOS               ");
        System.out.printf("%-8s %-25s %-12s%n", "ID", "NOMBRE", "PRECIO");
        System.out.println("------------------------------------------------");

        for (Producto p : productos) {
            System.out.printf("%-8d %-25s $%-11.2f%n",
                    p.getCodigo(),
                    p.getDescripcion(),
                    p.getPrecio());
        }

        System.out.println("================================================");
    }
}
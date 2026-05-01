package Proyecto;

import java.util.Scanner;

public class Proyecto4 {
    public static double calculoTotal(double precio, int cantidad){
        double total=0;
        total = precio *cantidad;
        return total;
    }
    public static double calcularTotalInventario(double[] totales){
        double valorTotal  =0;
        for(int i =0; i<totales.length;i++){
            valorTotal +=totales[i];
        }
        return valorTotal;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();
        String[] nombres = new String[cantidadProductos];
        double[] precio = new double[cantidadProductos];
        int[] cantidad = new int[cantidadProductos];
        double[] totales = new double[cantidadProductos];
        int stock =0;


        for(int i=0; i<cantidadProductos;i++){
            System.out.println("Producto "  + (i+1));
            System.out.println("Nombre: ");
            nombres[i] = scanner.nextLine();
            
            System.out.println("Precio: ");
            precio[i] = scanner.nextDouble();
            
            System.out.println("Cantidad: ");
            cantidad[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("-----------------");
        for(int i=0; i<cantidadProductos;i++){
            totales [i] = calculoTotal(precio[i], cantidad[i]);
            System.out.println(nombres[i] + " - Precio " + precio[i] + " - Cantidad " + cantidad[i] + " - Total " + totales[i]);

        }
        double totalFinal = calcularTotalInventario(totales);
        
        System.out.println("Productos con bajo stock:");
        for(int i=0; i<cantidadProductos;i++){
            if(cantidad[i]<5){
                stock++;
                System.out.println(nombres[i]);
            }

        }
        
        System.out.println("-----------------");
        System.out.println("Valor total del inventario: " + totalFinal);
        System.out.println("Productos con bajo stock: " + stock);

        scanner.close();
    }
    
}

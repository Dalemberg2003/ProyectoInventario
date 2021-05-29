package inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //aqui empieza el codigo
        int maxsize = -1;
        int tempNumber;        
        String tempName;
        int tempQty;
        double tempPrice;
        do {
            try {
                System.out.println("*-------------------------------------------*");
                System.out.println("Ingrese el numero de productos a agregar:");
                System.out.print("Introduzca 0 si no desea agregar productos: ");
                maxsize = in.nextInt();
                if (maxsize < 0) {
                    System.out.println("Valor incorrecto introducido");
                }
            } catch (InputMismatchException a) {
                System.out.println("Tipo de dato incorrecto introducido");
                in.nextLine();
            } catch (Exception e) {
                System.err.println(e);
                in.nextLine();
            }
        } while (maxsize < 0);
        if (maxsize == 0) {
            System.out.println("No se requieren productos");
        } else {
            Product[] productos = new Product[maxsize];
            for (int i = 0; i < maxsize; i++) {
                in.nextLine();
                System.out.print("\n\nIntroduzca en nombre del producto: ");
                tempName = in.nextLine();
                System.out.print("Introduzca la cantidad de existencias de este producto: ");
                tempQty = in.nextInt();
                System.out.print("Introduzca el precio de este producto: ");
                tempPrice = in.nextDouble();
                System.out.print("Introduzca el número de elemento ");
                tempNumber = in.nextInt();
                Product p = new Product(tempNumber, tempName, tempQty, tempPrice);
                productos[i] = p;                                
            }
            for(Product p: productos){
                System.out.println(p.toString());    
            }
        }       
        in.close();
    }//Fin del metodo main
}
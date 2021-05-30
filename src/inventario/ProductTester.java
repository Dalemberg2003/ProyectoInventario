package inventario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ProductTester {

    ArrayList<Product> productos;
    private static ProductTester adm= null;
    private ProductTester() {
        productos =  new ArrayList<>();
    }
    
    public static ProductTester getAdm(){
        if(adm==null){
            adm= new ProductTester();
        } 
        return adm;
    }
    
    
    public int PedirNumProductos() {
        
        int maxsize=-1;
        do {
            try {
                maxsize=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de productos a ingresar:/n"+
                                                                           "Introduzca 0 si no desea agregar productos:" ));
                if (maxsize < 0) {
                    JOptionPane.showMessageDialog(null,"Valor incorrecto introducido");
                }
            } catch (InputMismatchException a) {
                JOptionPane.showMessageDialog(null,"Tipo de dato incorrecto introducido");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        } while (maxsize < 0);
        
        return maxsize;
    }

    public void guardarProducto(String nombre, int cantidad, double precio, int numeroElem) {                    
                Product p = new Product(numeroElem, nombre, cantidad, precio);
                productos.add(p);
    }
    
    public void MostraProductos(JTextArea area){
        String datos="";
        for(Product p: productos){            
          datos+=p.toString();  
        }
        area.setText(datos);
    }
    
    public int numeroProductList(){
        return productos.size();
    }
}
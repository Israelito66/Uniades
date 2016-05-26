/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.uniades.salguero;
import java.util.ArrayList;
import ec.edu.uniades.salguero.cslproducto;
/**
 *
 * @author Usuario
 */
public class EcEduUniadesSalguero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      ArrayList<cslproducto> producto = new ArrayList<>();
       
        cslproducto prod1 = new cslproducto(0, "clavo", 20,cslproducto.unidad.libras);
        cslproducto  prod2 = new cslproducto(1, "thiñer", 103,cslproducto.unidad.litro);
        cslproducto  prod3 = new cslproducto(2, "lija", 120,cslproducto.unidad.metro);
        cslproducto  prod4 = new cslproducto(3, "manila", 100,cslproducto.unidad.libras);
        cslproducto  prod5 = new cslproducto(4, "malla", 20,cslproducto.unidad.metro);
      
        producto.add(prod1);
        producto.add(prod2);
        producto.add(prod3);
        producto.add(prod4);
        producto.add(prod5);
          
    }
        private static void imprimir(ArrayList<cslproducto> prod) {
            
            for (cslproducto producto : prod) {
                
                System.out.print("***************");
                System.out.print("Id:"+producto.Id());
                System.out.print("Nombre: "+ producto.Nombre());
                System.out.print("Valor: "+ producto.Valor());
                System.out.print("Unidad:  "+ producto.Unidad());
                
            }
                
            }
  }
    
    


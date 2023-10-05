
package electronicos;

import java.util.Date;


public class Laptop extends SuperElectronico {
    
   protected int brillo ;
      public Laptop(String marca,double precio, int bateria, int stock, String  fechaFabricacion,int brillo) {
        super(marca, precio, bateria, stock, fechaFabricacion);
        this.brillo = brillo;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }
      
     
    
      

   @Override
   public void cargarBateria(int numero){
    
  super.cargarBateria(numero);
}
   
   @Override
   public void mostrarEstado() {
   
   super.mostrarEstado();
   
   }
   
 
   
   @Override
 public void validarStock() {
 
 super.validarStock();
 
 }
        

   @Override
 public void mostrarCaracteristicas() {
     
   super.mostrarCaracteristicas();
 }

 
   @Override
 public void calcularPrecioDeVenta() {
 
     super.calcularPrecioDeVenta();
 
 }
   
public void subirBrillo(int cantidad){
    
       if (cantidad > 0) {
          brillo = brillo + cantidad ;
        System.out.println("Se aumento  el brillo en " + cantidad + ". El brillo actual es " + brillo);
    } else {
        System.out.println("La cantidad debe ser mayor que cero.");
    }



} 

public void bajarBrillo(int cantidad){
    
     if (cantidad > 0) {
        brillo = brillo - cantidad ;
        System.out.println("Se  bajo el brillo en " + cantidad + ". El brillo actual es " + brillo);
    } else {
        System.out.println("La cantidad debe ser mayor que cero.");
    }

} 
 
 
 
}

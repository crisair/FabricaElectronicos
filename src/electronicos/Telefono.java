
package electronicos;

import java.util.Date;

public class Telefono extends SuperElectronico {
    
   protected double almacenamiento;

    public Telefono(String marca, double precio, int bateria, int stock, String fechaFabricacion,double almacenamiento) {
        super(marca, precio, bateria, stock, fechaFabricacion);
        this.almacenamiento =  almacenamiento;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
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
 
 
public void almacenamientoMaximo(){
    
    if (almacenamiento >= 10 && almacenamiento <= 15) {
        
    System.out.println("No hay espacio suficiente .");

    } else {
    System.out.println("Hay espacio suficiente.");
} 
    
}
 
 
   
    
}

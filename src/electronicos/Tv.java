
package electronicos;




public class Tv extends SuperElectronico{
    
    protected  int volumen ;

    public Tv(String marca, double precio, int bateria, int stock, String  fechaFabricacion,int volumen) {
        super(marca, precio, bateria, stock, fechaFabricacion);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
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
 
 public void subirVolumen(int cantidad){
    
       if (cantidad > 0) {
        volumen = volumen + cantidad;
        System.out.println("Se aumento  el volumen en " + cantidad + ". El brillo actual es " + volumen);
    } else {
        System.out.println("La cantidad debe ser mayor que cero.");
    }
     
    
}
 
  public void bajarVolumen(int cantidad){
    
       if (cantidad > 0) {
        volumen = volumen - cantidad;
        System.out.println("Se bajo el volumen en " + cantidad + ". El volumen actual es " + volumen);
    } else {
        System.out.println("La cantidad debe ser mayor que cero.");
    }   
    
}
 
 
}
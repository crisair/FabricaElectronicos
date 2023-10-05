
package electronicos;




public class RelojDigital extends SuperElectronico {
    
    protected String hora;

    public RelojDigital(String marca, double precio, int bateria, int stock, String  fechaFabricacion, String hora) {
        super(marca, precio, bateria, stock, fechaFabricacion);
        this.hora =hora;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
   

     
  public void actualizarHora(String horaActualizada) {
      
        setHora(horaActualizada);
        System.out.println("la hora actual es : " + horaActualizada);
    }
  
  
 
 
 } 
    
    
    


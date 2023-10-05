
package electronicos;




public class SuperElectronico implements IElectronicos {
    public  String marca ;
    public  double precio;
    public  int bateria;
    protected  int stock;
    protected  String fechaFabricacion;

    public SuperElectronico(String marca, double precio, int bateria, int stock, String fechaFabricacion) {
        this.marca = marca;
        this.precio = precio;
        this.bateria = bateria;
        this.stock = stock;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String  getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String  fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

  

   
    @Override
     public void cargarBateria(int numero){
       
         bateria = bateria + numero;
              
       System.out.println(" el porcentaje de la bateria es " + bateria);
     };

    @Override
    public void mostrarEstado() {
        
        if (bateria == 0 ){
        
          System.out.println("el dispositivo esta apagado");   
        
    }else{
        
       System.out.println("el dispositivo esta encendido");   
    }   
        
        
    }

    @Override
    public void validarStock() {
        
         if (stock == 0){
        
          System.out.println(" el producto esta agotado ");   
        
    }else{
           
        
       System.out.println(" el numero de dispositivos disponibles es "+ stock);   
    }   
        
        
       
    }

    @Override
    public void mostrarCaracteristicas() {
     
     System.out.println("**************************************");
     System.out.println("la marca del dispositivo es: " + marca);
     System.out.println("el precio es : " + precio);
     System.out.println("la bateria esta : " + bateria);
     System.out.println("la catidad actual es  : " + stock);
     System.out.println("la fecha de fabricacion es : " + fechaFabricacion);
     System.out.println("**************************************");
        
    }

    @Override
    public void calcularPrecioDeVenta() {
   
        
        precio = precio * 0.12;
        
       System.out.println(" el precio final es  : " + precio );
        
    }
    
  
    
    
    
}

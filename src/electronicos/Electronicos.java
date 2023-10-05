
package electronicos;


public class Electronicos {

   
    public static void main(String[] args) {
        
  Telefono telefono1 = new Telefono("juan",50000,60,60,"20-01-2023",6);
  Laptop    laptop1 =  new Laptop("sansong",60000,70,30,"20-03-2023",40);
  Tv      tv1 = new Tv("HUANWEY",40000,90,30,"25-05-2023",50);
  RelojDigital  reloj1  = new RelojDigital ("apol",50000,70,8,"20-06-2023","11:30");
     
   
  telefono1.almacenamientoMaximo();
  telefono1.calcularPrecioDeVenta();
  telefono1.cargarBateria(40);
  telefono1.validarStock();
  telefono1.mostrarEstado();
  telefono1.mostrarCaracteristicas();
  
  laptop1.bajarBrillo(3);
  laptop1.subirBrillo(3);
  laptop1.calcularPrecioDeVenta();
  laptop1.cargarBateria(9);
  laptop1.validarStock();
  laptop1.mostrarEstado();
  laptop1.mostrarCaracteristicas();
  
  tv1.bajarVolumen(6);
  tv1.subirVolumen(8);
  tv1.calcularPrecioDeVenta();
  tv1.cargarBateria(30);
  tv1.validarStock();
  tv1.mostrarEstado();
  tv1.mostrarCaracteristicas();
  
  reloj1.actualizarHora("12:10");
  reloj1.calcularPrecioDeVenta();
  reloj1.cargarBateria(9);
  reloj1.validarStock();
  reloj1.mostrarEstado();
  reloj1.mostrarCaracteristicas();
  
  
  
  
  
  
  
  
  
       
    }
    
}

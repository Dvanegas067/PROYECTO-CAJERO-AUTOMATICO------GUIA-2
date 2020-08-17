package proyecto_cajero_automatico;
import java.util.Scanner;


public class PROYECTO_CAJERO_AUTOMATICO {
    
    
    
    public static void main(String[] args) {
    int Saldo = 1000000;
    int depositar, retirar;
    int OPC = 0;
    
    Scanner cajero = new Scanner(System.in);
    
        do{      
        System.out.println("Bienvenidos al cajero arquitectura de software");
        System.out.println("eliga una opcion ");
        System.out.println("1. retirar dinero");
        System.out.println("2. consultar saldo");
        System.out.println("3. Depositar dinero");        
        System.out.println("4. salir");        
        OPC = cajero.nextInt();
        
        switch(OPC){
            case 1:
                System.out.println("Por favor ingrese la cantidad a retirar");
                retirar = cajero.nextInt();
                if (retirar <= Saldo){
                    Saldo = (Saldo - retirar); 
                    System.out.println("su saldo es " +Saldo);
                } else {
                    System.out.println("fondos insuficientes ");
                }
                break;
                
            case 2:
                if (Saldo == Saldo){
                    System.out.println("Su saldo es " +Saldo);
                }
                break;
            case 3:
                System.out.println("Ingresa la cantidad a depositar");
                depositar = cajero.nextInt();
                if (depositar > 0){
                    Saldo = (Saldo + depositar); 
                    System.out.println("su nuevo saldo es " +Saldo);
                }
                break;
            case 4:
                System.out.println("Gracias por usar nuestros cajeros ");
                
                break;
            
                
                }
            System.out.println("Desea realizar otro procedimiento");
            System.out.println("1. Para continuar");
            System.out.println("4. para salir");
            System.out.println("Gracias por usar nuestros cajeros ");
            
            OPC = cajero.nextInt();
          } while (OPC != 4); 
            
    }
    
}         
         
             
        
      
             

    

                
                                                
        
           
    

        
                   
        
        
                
    
    

import java.util.Scanner;

public class Reto4 {
    
    public static void main(String[] args) {
        String nombre;
        int opcion;
        int aleatorio;
        int monto=3000;
        int montoPersona;

        
        Scanner lectura=new Scanner(System.in);
        
     
        System.out.println("Digite su nombre");
        nombre=lectura.nextLine();


        System.out.println("DIGITE CANTIDAD DE DINERO QUE QUIERE APOSTAR");
        montoPersona=lectura.nextInt();

        System.out.println("ELIJA UNA OPCION PIEDRA=1, PAPEL=2, o TIJERA=3");
        opcion=lectura.nextInt(); 


    
        aleatorio=(int) (Math.random()*3)+1;

       

        if(aleatorio==1 && opcion==1){
           
            System.out.println("respuesta de la maquina es piedra");
            monto=montoPersona;
            System.out.println(nombre+" empato"+" su dinero es"+monto    );
        }
        else if(aleatorio==1 && opcion==2){
          
            System.out.println("respuesta de la maquina es piedra");
            monto=monto+montoPersona;
            System.out.println(nombre+" gano"+" su dinero es"+monto  );
       
        }
        else if(aleatorio==1 && opcion==3){
       
            System.out.println("respuesta de la maquina es piedra");
            monto=monto-montoPersona;
            System.out.println(nombre+" perdio"+" su dinero es"+monto  );
        }
        else if(aleatorio==2 && opcion==1){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto-montoPersona;
            System.out.println(nombre+"  perdio"+" su dinero es"+monto  );
        
        }
        else if(aleatorio==2 && opcion==3){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto+montoPersona;
            System.out.println(nombre+" gato"+" su dinero es"+monto  );
        }
        else if(aleatorio==2 && opcion==2){
            
            System.out.println("respuesta de la maquina es papel");
            monto=montoPersona;
            System.out.println(nombre+" empate"+" su dinero es"+monto  );
        }
        else if(aleatorio==3 && opcion==3){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=montoPersona;
            System.out.println(nombre+" gano"+" su dinero es"+monto  );
        
        }
        else if(aleatorio==3 && opcion==1){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=monto+montoPersona;
            System.out.println(nombre+" gano"+" su dinero es"+monto  );
        }
        else if(aleatorio==3 && opcion==3){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=montoPersona;
            System.out.println(nombre+" empate"+" su dinero es"+monto  );
        
        }
        

       lectura.close();
    }

   

}


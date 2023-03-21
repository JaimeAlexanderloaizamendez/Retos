import java.util.Scanner;

public class Reto7 {
    
    public static void main(String[] args) {
        //declarar variables
        String nombre;
        int opcion;
        int aleatorio;
        int monto=3000;
        int cantidad;
        int intentos=100,i;
        int vida=3;

         //clase scanner
        Scanner lectura=new Scanner(System.in);
        
        
        System.out.println("Digite su nombre");
        nombre=lectura.nextLine();
          //imprimir
        System.out.println("usted tiene 3 vidas");


        for(i=0;i<=intentos;i++){

        System.out.println("usted posee una cantidad de dinero de"+monto+" cuanto quiere apostar");
        cantidad=lectura.nextInt();


        System.out.println("ELIJA UNA OPCION PIEDRA=1, PAPEL=2, o TIJERA=3");
        opcion=lectura.nextInt(); 


        aleatorio=(int) (Math.random()*3)+1;

       

        if(aleatorio==1 && opcion==1){
           
            System.out.println("respuesta de la maquina es piedra");
            System.out.println(nombre+" empato"+" su dinero es"+monto    );
        }
        else if(aleatorio==1 && opcion==2){
          
            System.out.println("respuesta de la maquina es piedra");
            monto=monto+cantidad;
            System.out.println(nombre+" gano"+" su dinero es"+monto  );
       
        }
        else if(aleatorio==1 && opcion==3){
       
            System.out.println("respuesta de la maquina es piedra");
            monto=monto-cantidad;
            vida=vida-1;
            System.out.println(nombre+" perdio"+" su dinero es"+monto  );
        }
        else if(aleatorio==2 && opcion==1){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto-cantidad;
            vida=vida-1;
            System.out.println(nombre+"  perdio"+" su dinero es"+monto  );
        
        }
        else if(aleatorio==2 && opcion==2){
           
            System.out.println("respuesta de la maquina es papel");
            monto=monto+cantidad;
            System.out.println(nombre+" gato"+" su dinero es"+monto  );
        }
        else if(aleatorio==2 && opcion==2){
            
            System.out.println("respuesta de la maquina es papel");;
            System.out.println(nombre+" empate"+" su dinero es"+monto  );
        }
        else if(aleatorio==3 && opcion==2){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=monto-cantidad;
            vida=vida-1;
            System.out.println(nombre+" perdio"+" su dinero es"+monto  );
        
        }
        else if(aleatorio==3 && opcion==1){
           
            System.out.println("respuesta de la maquina es tijera");
            monto=monto+cantidad;
            System.out.println(nombre+" gano"+" su dinero es"+monto  );
        }
        else if(aleatorio==3 && opcion==3){
           
            System.out.println("respuesta de la maquina es tijera");
            System.out.println(nombre+" empate"+" su dinero es"+monto  );
        
        }

        System.out.println("le quedan " +vida+" vidas");
       
        if (vida==0) {

            intentos=vida;
            
        } else {   
        } 
        if (monto==0) {

            monto=cantidad;
            System.out.println("usted ya no tiene mas dinero");
            
        } else {
            
        }
        }
        System.out.println(nombre+" a jugado "+i+" veces y la cantidad de dinero es "+monto);

       lectura.close();
    }

   

}

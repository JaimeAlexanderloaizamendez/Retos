import java.util.Scanner;


public class Reto6 {
   
    public static void main(String[] args) {

        int nJugador;
        String jugador;
        int saldoApuesta,saldo = 4000,moneda,i;
        int vida=3;
        int intentos=100;
        
    

            Scanner lectura=new Scanner(System.in);


                System.out.println("CARA Y SELLO");
            

                System.out.println("como es su nombre digitelo por favor"); 
                jugador=lectura.nextLine();

                for(i=0;i<=intentos;i++){

                System.out.println(" cuenta con un saldo de"+saldo+"mil ");
                saldoApuesta=lectura.nextInt();
                System.out.println(" cuanto es su apuesta");
                saldoApuesta=lectura.nextInt();

            

                System.out.println(" sus opciones son:  cara = 1  , sello = 2");
                nJugador=lectura.nextInt();

                moneda=(int) (Math.random()*2)+1;
                

                if (moneda==1 && nJugador==1  ) {
                    saldo = saldo + saldoApuesta;
                    System.out.println(jugador+" saco cara ha ganado");

                }else if (moneda==2 &&  nJugador==2  ) {
                    saldo = saldo + saldoApuesta;
                    System.out.println(jugador+" saco sello ha ganado");

                }else if (moneda==1 &&  nJugador==2  ) {
                    saldo = saldo - saldoApuesta;
                    vida=vida-1;
                    System.out.println(jugador+" Ha perdido ");

                }else if (moneda==2 &&  nJugador==1  ) { 
                    saldo = saldo - saldoApuesta;
                    vida=vida-1;
                        System.out.println(jugador+" Ha perdido "); 
                        
                 
                }
                System.out.println("el numero de vidas es"+vida);
                if (vida==0) {
                    intentos=vida;
                    
                } else {
                    
                }

                if (saldo ==0) {
                   
                    saldo=saldoApuesta;
                    
                } else{

            }
        }
                System.out.println(jugador+" a jugado "+i+" veces y la cantidad de dinero recolectado es "+saldo);
                lectura.close();
    } 
}
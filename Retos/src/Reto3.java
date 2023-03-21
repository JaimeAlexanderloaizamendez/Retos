import java.util.Scanner;


public class Reto3 {
   
    public static void main(String[] args) {

        String nombreJugador;
        int jugador;
        int saldoApuesta,saldo = 4000,moneda;

            Scanner lectura=new Scanner(System.in);


            System.out.println("ESTE ES EL JUEGO CARA Y SELLO ESTA LISTO");
            

            System.out.println("como es su nombre digitelo por favor"); 
            nombreJugador=lectura.nextLine();

            System.out.println(" cuenta con un saldo de 4000mil ");

            System.out.println(" cuanto es su apuesta");
            saldoApuesta=lectura.nextInt();

            

                System.out.println(" sus opciones son:  cara = 1  , sello = 2");
                jugador=lectura.nextInt();

                moneda=(int) (Math.random()*2)+1;
                

                if (moneda==1 && jugador==1  ) {
                    saldoApuesta = saldo + saldoApuesta;
                    System.out.println(nombreJugador+" saco cara ha ganado");

                }else if (moneda==2 && jugador==2  ) {
                    saldoApuesta = saldo + saldoApuesta;
                    System.out.println(nombreJugador+" aco sello ha ganado");

                }else if (moneda==1 && jugador==2  ) {
                    saldoApuesta = saldo - saldoApuesta;
                    System.out.println(nombreJugador+" Ha perdido ");

                }else if (moneda==2 && jugador==1  ) { 
                    saldoApuesta = saldo - saldoApuesta;
                        System.out.println(nombreJugador+" Ha perdido "); 
                        
                 
                }

                


                System.out.println(nombreJugador+"  y tiene un saldo para apostar de "+saldoApuesta);

            System.out.println(nombreJugador+ " Usted tenia 4000 y ahora tiene una cantidad de "+ saldoApuesta);

            System.out.println("GRACIAS");

        lectura.close();
   } 
    }
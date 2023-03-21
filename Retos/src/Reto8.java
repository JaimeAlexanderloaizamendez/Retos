import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        int numeroRandom;
        int numeroDigitado;
        int intentos=10;
        int infinito=10;
        int acerto=0,i;

        Scanner lectura=new Scanner(System.in);

        System.out.println("BIENVENIDO AL JUEGO");
        System.out.println("tiene una cantidad de intentos de 10");
        System.out.println("escriba la cantidad de veces que quiere adivinar el numero");
        intentos=lectura.nextInt();

        if (intentos>10) {
            infinito=0;
            System.out.println("usted ya no tiene mas intentos");  
        } else {
            
        }

        for(i=1;i<=infinito;i++){

            System.out.println("ingrese un numero");
            numeroDigitado=lectura.nextInt();

            numeroRandom=(int)(Math.random()*100)+1;

            if (numeroRandom==numeroDigitado) {
                System.out.println("a acertado el numero");
                acerto=acerto+1;
                
            } else {
                intentos=intentos -1;
                System.out.println("el numero no es");
                System.out.println("le quedan estos intentos: "+intentos);
                
            }if (numeroRandom>numeroDigitado) {
                System.out.println("el numero es mayor que el que escribio que es  "+numeroDigitado);
                
            } else if(numeroRandom<numeroDigitado){
                System.out.println("el  numero es menor que el que escribio que es "+numeroDigitado);
                
            }


            if (intentos==0) {
                infinito=intentos;
                
            } else {
                
            }
            System.out.println("las rondas fueron "+i+" los intentos fueron "+intentos);
        }


        System.out.println("adivino "+acerto+"en estos intentos"+i);
        lectura.close();



    }
    
}

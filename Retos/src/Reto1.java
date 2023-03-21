import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        //asignanado variables
        double gradosFahrenhei=0;
        double gradosCentigrados=0;
        double gardosKelvin=0;


        //instanciar
        Scanner lectura=new Scanner(System.in);
        // haciendo una impresion
        System.out.println("ingrese los grados Farenhei");
        gradosFahrenhei=lectura.nextDouble();


        gradosCentigrados=(int)  (gradosFahrenhei - 32)/1.8;

        gardosKelvin=(int) (gradosCentigrados+273-15);

        System.out.println(" los grados farenhei son:" +gradosFahrenhei+ " en grados centigrados son:" +gradosCentigrados+ " en kelvin son:" +gardosKelvin);


    
        //cerrando el boofer
        lectura.close();

        

    }


}


import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        int producto1=1000;
        int producto2=4000;
        int producto3=2000;
        int producto4=3000;
        int producto5=5000;
        int producto6=2000;
        int numProductos,i;
        int productos;
        int sumaProductos=0;


        Scanner lectura=new Scanner(System.in);

        System.out.println("escriba la cantidad de productos que quiere comprar");
        numProductos=lectura.nextInt();


        for(i=0;i<numProductos;i++){
            System.out.println(" elija productos de los que hay presentes: 1= pasta 1000   2=frijol 4000   3=avena 2000   4=chocolate 3000   5=lentejas 50000   6=maiz 2000");
            productos=lectura.nextInt();

            if (productos==1) {
                System.out.println("el costo de este pruducto es"+producto1);
                sumaProductos=sumaProductos+producto1;
                
            }else if(productos==2) {
                System.out.println("el costo de este pruducto es"+producto2);
                sumaProductos=sumaProductos+producto2;
                
            }else if(productos==3){
                System.out.println("el costo del prudcuto es"+producto3);
                sumaProductos=sumaProductos+producto3;

            }else if(productos==4){
                System.out.println("el costo del producto es"+producto4);
                sumaProductos=sumaProductos+producto4;

            }else if(productos==5){
                System.out.println("el costo del producto es"+producto5);
                sumaProductos=sumaProductos+producto5;

            }else if(productos==6){
                System.out.println("el costo del producto es"+producto6);
                sumaProductos=sumaProductos+producto6;

            }

        }
        System.out.println("el costo de la compra es:  "+sumaProductos);


        lectura.close();


    }
}

import java.util.Scanner;

public class Reto2 {
    
    public static void main(String[] args) {
        int pesosBebe=0;
        int mesesBebe=0;
        int dosisVacuna=0;
        String nombreDoctor;
        int cedulaDoctor;
        String nombreAcudiente;


        Scanner lectura=new Scanner(System.in);
        

        System.out.println("digite el peso del bebe");
        pesosBebe=lectura.nextInt();
        System.out.println("digite los mesese del bebe");
        mesesBebe=lectura.nextInt();
        System.out.println("ingrese el nombre del doctor");
        nombreDoctor=lectura.next();
        System.out.println("ingresar la cedula del doctor");
        cedulaDoctor=lectura.nextInt();
        System.out.println("digite el nombre de el acudiente");
        nombreAcudiente=lectura.next();

        dosisVacuna=(int)(pesosBebe+10)/(mesesBebe*10)*8;
        System.out.println(" la dosis de la vacuna es:"+dosisVacuna+ "  el nombre del doctor es"+nombreDoctor+"  la cedula del doctor es:"+cedulaDoctor+"  el nomber del acudiente es: "+nombreAcudiente);
        

        lectura.close();
    }
}


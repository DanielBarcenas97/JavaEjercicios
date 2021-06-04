     import java.util.Scanner;   
     import java.io.IOException;

     public class meses{

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int Mes;
       System.out.println ("Ingrese el numero del mes del año");
       Mes = sc.nextInt();
       System.out.println(Mes);
     
       switch (Mes)
       {
           case 1: System.out.println("Enero y tiene 31 dias");
           break;
         
           case 2: System.out.println("Febrero y tiene 28 dias");
           break;
         
           case 3: System.out.println("Marzo y tiene 31 dias.");
           break;
         
           case 4: System.out.println("Abril y tiene 30 dias");
           break;
         
           case 5: System.out.println("Mayo y tiene 31 dias");
           break;
         
           case 6: System.out.println("Junio y tiene 30 dias");
           break;
         
           case 7: System.out.println("Julio y tiene 31 dias");
           break;
         
           case 8: System.out.println("Agosto y tiene 31 dias");
           break;
         
           case 9: System.out.println("Septiembre y tiene 30 dias");
           break;
         
           case 10: System.out.println("Octubre y tiene 31 dias");
           break;
         
           case 11: System.out.println("Noviembre y tiene 30 dias");
           break;
         
           case 12: System.out.println("Diciembre y tiene 31 dias");
           break;
           
           default:
           System.out.println("no coincide con ningun dato");
       }
     
    }
   
}
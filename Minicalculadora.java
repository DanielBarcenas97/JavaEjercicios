import java.util.Scanner;   
import java.io.IOException;

public class miniCalculadora{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      char opcion;
      int a;
      int b ;

      System.out.println("Bienvenido a Calculadora Shugar");

      System.out.println("Introduce tu primer numero");
      a = sc.nextInt();

      System.out.println("Introduce tu segundo numero");
      b = sc.nextInt();

      System.out.println("Opciones de la Calculadora");
	System.out.println("+.-Suma");
	System.out.println("-.-Resta");
	System.out.println("*.-Multiplicacion");
	System.out.println("/.-division"); 

      opcion = sc.next().charAt(0);

      switch (opcion) {
      case '+':
           System.out.println("La suma es " + (a+b));
           break;
      case '-':
           System.out.println("La resta es " + (a-b));
           break;
      case '*':
           System.out.println("La multi es " + (a*b));
           break;
      case '/':
            try{
                  System.out.println("La division de los numeros es: " + (a/b));
            }catch(Exception e){
                  System.out.println("No se puede dividir entre cero ");
                  e.printStackTrace();
            }
            break;
      default:
           System.out.println("error" );
           break;
      }
    }
 }
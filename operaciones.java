import java.util.Scanner;   
import java.io.IOException;
import java.lang.Math;

public class operaciones{
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				int opcion;
				int a;


				System.out.println("Bienvenido a Calculadora 2");
				System.out.println("Introduce tu primer numero");
				a = sc.nextInt();

				System.out.println("Opciones ");
				System.out.println("1.- cubo de un numero");
				System.out.println("2.- numero par o impar");
				System.out.println("3.- salir");

				opcion = sc.nextInt();

				switch (opcion) {
				case 1:
									System.out.println("Cubo de un numero");
									System.out.println( "Resultado " + Math.pow(a,2)); 
									break;
				case 2:
									System.out.println("Numero par o impar");
									if (a%2==0)
									    System.out.println("El número es par");
									else{
										System.out.println("El número es impar");
									}
									break;
				case 3:
									System.out.println("Saliendo del programa");
									break;
			
				default:
									System.out.println("error no es numero correcto");
									break;
				}
		}
}
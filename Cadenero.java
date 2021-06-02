import java.io.BufferedReader;
import java.util.Scanner;   
import java.io.IOException;
import java.io.InputStreamReader;

public class Cadenero{
	public static void main(String[] args) {			
		int edad = 0;
		String respuesta = "";
		char sexo = 'M';
		//BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.outargs));
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido a Antro Shugar, ¿Me pueden mostrar sus indentificaciones oficiales? : " );
		
		Scanner sc = new Scanner(System.in);

		try{	
			respuesta = bufferRead.readLine();  // SI NO
		}catch(IOException e){
			e.printStackTrace();
		}

		// 12

		if (respuesta.equals("SI") || respuesta.equals("si")) {

			System.out.println("¿Que edad tienes?");
			
			edad = sc.nextInt();
			
			if(edad >= 20  && edad < 40){
				
				System.out.println("¿Entre mujer y hombre en que genero te identificas?");
				   
				sexo = sc.next().charAt(0);   
				if (sexo == 'M'){
					System.out.println("Puedes pasar Gratis");
				}else if (sexo == 'H'){
					System.out.println("Tienes que pagar cover");
				}else{
					System.out.println("Estas mal tienes que poner H o M");
				}

			}else if(edad > 40){
				System.out.println("Pasa pero paga más");
			}else{
				System.out.println("No puedes pasar por que eres menor de edad de 20");
			}

		}else{
			System.out.println("No pueden pasar" );
		}
		
	}
}
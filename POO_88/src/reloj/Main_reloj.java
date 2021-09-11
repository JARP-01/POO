package reloj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_reloj {

	public static void main(String arg[]) throws IOException, InterruptedException {

		Reloj tiempo = new Reloj();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int opcion = 0;

		do {
			do {
				System.out.println("\nReloj\n ");
				System.out.println("\t1.- Reloj hacia adelante");
				System.out.println("\t2.- Reloj hacia atras");
				System.out.println("\t3.- salir");

				System.out.print("\nIngrese opcion : ");
				opcion = Integer.parseInt(in.readLine());
				System.out.println();
			} while (opcion > 3 || opcion < 1);

			switch (opcion) {
			case 1:
				
				System.out.print("Ingrese la hora: ");
				tiempo.horas = Integer.parseInt(in.readLine( ));
				
				System.out.print("Ingrese el minuto: ");
				tiempo.minutos = Integer.parseInt(in.readLine( ));
				
				System.out.print("Ingrese el segundo: ");
				tiempo.segundos = Integer.parseInt(in.readLine( ));
				
				tiempo.incrementar();

				break;

			case 2:
				
				System.out.print("Ingrese la hora: ");
				tiempo.horas = Integer.parseInt(in.readLine( ));
				
				System.out.print("Ingrese el minuto: ");
				tiempo.minutos = Integer.parseInt(in.readLine( ));
				
				System.out.print("Ingrese el segundo: ");
				tiempo.segundos = Integer.parseInt(in.readLine( ));
				
				tiempo.decrementar();
				

					

				break;


			case 3:

				System.out.println("//////////////////////////////////////// ");
				System.out.println("///Gracias por utilizar este programa/// ");
				System.out.println("//////////////////////////////////////// ");

				break;

			}
		} while (opcion > 3 || opcion < 1);

	}
	
}


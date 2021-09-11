package puntos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_distancia_puntos {

	public static void main(String arg[]) throws IOException {

		Calcula_distancia_puntos puntos = new Calcula_distancia_puntos();

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int opcion = 0;
		int opcion2 = 0;

	do {
		do {
			System.out.println("Este programa le permite calcular la distancia entre dos puntos");

			System.out.println("\n\t1.- Distancia entre dos puntos");
			System.out.println("\t2.- Distancia de un punto de origen");
			System.out.println("\t3.- Salir");
			

			System.out.print("\nIngrese opción : ");
			opcion = Integer.parseInt(in.readLine());
			System.out.println();
		} while (opcion > 3 || opcion < 1);
		
		switch(opcion) {
		case 1:

				System.out.print("Ingrese la cordenada x del primer punto: ");
				puntos.x1 = Double.parseDouble(in.readLine());
				
				System.out.print("Ingrese la cordenada y del primer punto: ");
				puntos.y1 = Double.parseDouble(in.readLine());
				
				System.out.print("Ingrese la cordenada z del primer punto: ");
				puntos.z1 = Double.parseDouble(in.readLine());
				
				System.out.print("Ingrese la cordenada x del segundo punto: ");
				puntos.x2 = Double.parseDouble(in.readLine());
				
				System.out.print("Ingrese la cordenada y del segundo punto: ");
				puntos.y2 = Double.parseDouble(in.readLine());
				
				System.out.print("Ingrese la cordenada z del segundo punto: ");
				puntos.z2 = Double.parseDouble(in.readLine());

				
				System.out.print("la distancia entre los puntos ("+puntos.x1+","+puntos.y1+","+puntos.z1+") y ("+puntos.x2+","+puntos.y2+","+puntos.z2+") es de: ");
				puntos.Calcula_distancia();

			do {	
				do {
				System.out.print("\nDesea mover algun punto? ");
				
					System.out.println("\n\t1.- Mover el punto x1");
					System.out.println("\t2.- Mover el punto y1");
					System.out.println("\t3.- Mover el punto x2");
					System.out.println("\t4.- Mover el punto y2");
					System.out.println("\t5.- Mover el punto (x1,y1,z1)");
					System.out.println("\t6.- Mover el punto (x2,y2,z2)");
					System.out.println("\t7.- Mover el punto z1");
					System.out.println("\t8.- Mover el punto z2");
					System.out.println("\t9.- Salir");
					System.out.print("\nIngrese opcion : ");
					opcion2 = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion2 > 9 || opcion2 < 1);

				switch(opcion2) {
				
				case 1:
				
					System.out.print("Cuantas unidades quieres mover en x1: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_x1();
					
				break;
				
				case 2:
					
					System.out.print("Cuantas unidades quieres mover y1: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_y1();
				break;
				
				case 3:
					
					System.out.print("Cuantas unidades quieres mover x2: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_x2();
				break;
				
				case 4:
					
					System.out.print("Cuantas unidades quieres mover y2: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_y2();
				break;
				
				case 5:
					
					System.out.print("Cuantas unidades quieres mover (x1,y1,z1): ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_x1_y1_z1();
				break;
				
				case 6:
					
					System.out.print("Cuantas unidades quieres mover (x2,y2,z2): ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_x2_y2_z2();
				break;
				
                case 7:
					
					System.out.print("Cuantas unidades quieres mover z1: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_z1();
				break;
				
				case 8:
					
					System.out.print("Cuantas unidades quieres mover z2: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("la distancia entre los puntos es de: ");
					puntos.Movimiento_z2();
				
				case 9:
					

				break;
				
				}
				
			} while (opcion2 > 9 || opcion2 < 1);
				
				break;
				
		case 2:
			
			System.out.print("Ingrese la cordenada x del primer punto: ");
			puntos.x1 = Double.parseDouble(in.readLine());
			
			System.out.print("Ingrese la cordenada y del primer punto: ");
			puntos.y1 = Double.parseDouble(in.readLine());
			
			System.out.print("Ingrese la cordenada z del primer punto: ");
			puntos.z1 = Double.parseDouble(in.readLine());
			
			System.out.print("la distancia entre el punto de origen al punto("+puntos.x1+","+puntos.y1+","+puntos.z1+") es de: ");
			puntos.Calcula_distancia_origen();
			
			do {	
				do {
				System.out.print("\nDesea mover algun punto? ");
				
					System.out.println("\n\t1.- Mover el punto x1");
					System.out.println("\t2.- Mover el punto y1");
					System.out.println("\t2.- Mover el punto z1");
					System.out.println("\t3.- Mover el punto (x1,y1,z1)");
					System.out.println("\t5.- Salir");
					System.out.print("\nIngrese opcion : ");
					opcion2 = Integer.parseInt(in.readLine());
					System.out.println();
				} while (opcion2 > 5 || opcion2 < 1);

				switch(opcion2) {
				
				case 1:
				
					System.out.print("Cuantas unidades quieres mover x1: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("Ahora la distancia entre el punto de origen al punto("+(puntos.x1+puntos.movimiento)+","+puntos.y1+","+puntos.z1+") es de: ");
					puntos.Movimiento_origen_x1();
					
				break;
				
				case 2:
					
					System.out.print("Cuantas unidades quieres mover y1: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("Ahora la distancia entre el punto de origen al punto("+puntos.x1+","+(puntos.y1+puntos.movimiento)+","+puntos.z1+") es de: ");
					puntos.Movimiento_origen_y1();
				break;
				
				case 3:
					
					System.out.print("Cuantas unidades quieres mover z1: ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("Ahora la distancia entre el punto de origen al punto("+(puntos.x1)+","+(puntos.y1)+","+puntos.z1+puntos.movimiento+") es de: ");
					puntos.Movimiento_origen_z1();
				break;
				
				case 4:
					
					System.out.print("Cuantas unidades quieres mover (x1,y1): ");
					puntos.movimiento = Double.parseDouble(in.readLine());
					
					System.out.print("Ahora la distancia entre el punto de origen al punto("+(puntos.x1+puntos.movimiento)+","+(puntos.y1+puntos.movimiento)+","+puntos.z1+puntos.movimiento+") es de: ");
					puntos.Movimiento_origen_x1_y1_z1();
				break;
				
				case 5:
					

				break;
				
				}
				
			} while (opcion2 > 5 || opcion2 < 1);
			
			break;
			
		case 3:
			
			System.out.println("////////////////////////////////////// ");
			System.out.println("///Gracias por utilizar el programa/// ");
			System.out.println("////////////////////////////////////// ");
			
			break;	
			
	}	
	} while (opcion > 3 || opcion < 1);
	}
}

package puntos;

public class Calcula_distancia_puntos {

	double x1;
	double y1;
	double z1;
	double x2;
	double y2;
	double z2;
	double movimiento;
	double distancia;

	void Calcula_distancia() {
		
		distancia = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) + Math.pow((z2 - z1),2));
		
		System.out.print(distancia);
		
	}
	
	void Calcula_distancia_origen() {
		
		distancia = Math.sqrt( Math.pow((x1 - 0),2) + Math.pow((y1 - 0),2) + Math.pow((z1 - 0),2));
		
		System.out.print(distancia);
		
	}
	
	void Movimiento_origen_x1() {
		
		distancia = Math.sqrt( Math.pow(((x1+movimiento) - 0),2) + Math.pow((y1 - 0),2) + Math.pow((z1 - 0),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_origen_y1() {
		
		distancia = Math.sqrt( Math.pow((x1 - 0),2) + Math.pow(((y1+movimiento) - 0),2) + Math.pow((z1 - 0),2));
		
		System.out.print(distancia);
		
	}
	
	void Movimiento_origen_z1() {
		
		distancia = Math.sqrt( Math.pow((x1 - 0),2) + Math.pow(((y1 - 0) - 0),2) + Math.pow((z1 + movimiento),2));
		
		System.out.print(distancia);
		
	}
	
	void Movimiento_origen_x1_y1_z1() {
		
		distancia = Math.sqrt( Math.pow(((x1+movimiento) - 0),2) + Math.pow(((y1+movimiento) - 0),2) + Math.pow((z1 + movimiento),2));
		
		System.out.print(distancia);
		
	}
	
	void Movimiento_x1() {
		
		distancia = Math.sqrt( Math.pow((x2 - (x1+movimiento)),2) + Math.pow((y2 - y1),2) + Math.pow((z2 - z1),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_y1() {
	
		distancia = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - (y1+movimiento)),2) + Math.pow((z2 - z1),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_z1() {
		
		distancia = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - (y1+movimiento)),2) + Math.pow((z2 - (z1+movimiento)),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_x1_y1_z1() {
		distancia = Math.sqrt( Math.pow((x2 - (x1+movimiento)),2) + Math.pow((y2 - (y1+movimiento)),2) + Math.pow((z2 - (z1+movimiento)),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_x2() {
		
		distancia = Math.sqrt( Math.pow(((x2+movimiento) - x1),2) + Math.pow((y2 - y1),2) + Math.pow((z2 - z1),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_y2() {
		
		distancia = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow(((y2+movimiento) - y1),2) + Math.pow((z2 - z1),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_z2() {
		
		distancia = Math.sqrt( Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) + Math.pow(((z2+movimiento) - z1),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_x2_y2() {
		distancia = Math.sqrt( Math.pow(((x2+movimiento) - x1),2) + Math.pow(((y2+movimiento) - y1),2));
		
		System.out.print(distancia);
	}
	
	void Movimiento_x2_y2_z2() {
		distancia = Math.sqrt( Math.pow(((x2+movimiento) - x1),2) + Math.pow(((y2+movimiento) - y1),2) + Math.pow(((z2+movimiento) - z1),2));
		
		System.out.print(distancia);
	}
}

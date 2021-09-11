package reloj;

public class Reloj {

	public int horas;
	public int minutos;
	public int segundos;
	
	
	public void incrementar() throws InterruptedException {
		
	while(true) {	
		
		if(horas<10) {
			System.out.print("0");
		}
		System.out.print(horas+":");
		
		if(minutos<10) {
			System.out.print("0");
		}
		System.out.print(minutos+":");
		
		if(segundos<10) {
			System.out.print("0");
		}
		System.out.println(segundos);
		
		segundos++;
		if(segundos==60) {
			segundos=0;
			minutos++;
			if(minutos==60) {
				minutos=0;
				horas++;
				if(horas==24) {
					horas=0;
				}
			}
		}
		
		Thread.sleep(1000);
	}
  }
	
	public void decrementar() throws InterruptedException {
		
	while(true) {	
		
		if(horas<10) {
			System.out.print("0");
		}
		System.out.print(horas+":");
		
		if(minutos<10) {
			System.out.print("0");
		}
		System.out.print(minutos+":");
		
		if(segundos<10) {
			System.out.print("0");
		}
		System.out.println(segundos);
		
		if(segundos == 0) {
			
			if(minutos == 0) {
				horas--;
				minutos = 59;
			    segundos = 59;
			}else if (minutos != 0) {
				minutos--;
				segundos=59;
			}
			
		}else {
			segundos--;
		}
		
		Thread.sleep(1000);
	}
  }
}

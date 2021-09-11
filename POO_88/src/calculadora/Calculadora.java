package calculadora;

public class Calculadora {

	public double real;
	public double imaginario;
	public double real2;
	public double imaginario2;
	public double x;
	
	public void Suma() {
		
		System.out.println("("+(real+real2)+","+(imaginario+imaginario2)+"i)");
		
	}
	
	public void Resta() {
		
		System.out.println("("+(real-real2)+","+(imaginario-imaginario2)+"i)");
		
	}
	
	public void Multiplicacion() {
		
		System.out.println("("+(real*real2-imaginario*imaginario2)+","+(real*imaginario2+imaginario*real2)+"i)");
		
	}
	
	public void Division() {
		
		System.out.println("("+(real*real2+imaginario*imaginario2)/(real2*real2+imaginario2*imaginario2)+","+(imaginario*real2-real*imaginario2)/(real2*real2+imaginario2*imaginario2)+"i)");
	}
	
	public void Norma() {
		
		x=(Math.sqrt(real*real+imaginario*imaginario));
		System.out.print(x);
		
	}
	
	public void Conjugado() {
		
		System.out.println("("+(real)+","+(imaginario*-1)+"i)");
		
	}
	
	
}

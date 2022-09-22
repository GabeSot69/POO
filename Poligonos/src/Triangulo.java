import java.lang.Math;
public class Triangulo {
	int ladoA;
	int ladoB;
	int ladoC;
	
	Triangulo(){
		ladoA = 3;
		ladoB = 4;
		ladoC = 5;
	}
	public double area() {
		double semiPerimetro = perimetro()/2;
		//Formula de Heron
		double area =  Math.sqrt(semiPerimetro*(semiPerimetro-ladoA)*
		(semiPerimetro-ladoB)*(semiPerimetro-ladoC));
		return area;
	}
	
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}
	
	public double anguloAlfa() {
		double cosAlfa = (Math.pow(ladoB, 2) - Math.pow(ladoA, 2) - Math.pow(ladoC, 2))/(-2*ladoA*ladoC);
		return Math.toDegrees(Math.acos(cosAlfa));
	}
	
	public double anguloBeta() {
		double cosBeta = (Math.pow(ladoC, 2) - Math.pow(ladoA, 2) - Math.pow(ladoB, 2))/(-2*ladoA*ladoB);
		return Math.toDegrees(Math.acos(cosBeta));
	}
	
	public double anguloGama() {
		double cosGama = (Math.pow(ladoA, 2) - Math.pow(ladoB, 2) - Math.pow(ladoC, 2))/(-2*ladoB*ladoC);
		return Math.toDegrees(Math.acos(cosGama));
	}

}

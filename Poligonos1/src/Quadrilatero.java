
public class Quadrilatero {
	int ladoAC;
	int ladoBD;
	
	Quadrilatero() {
		ladoAC = 3;
		ladoBD = 4;
	}
	
	Quadrilatero(int ladoAC, int ladoBD){
		this.ladoAC = ladoAC;
		this.ladoBD = ladoBD;
	}
	
	public double area() {
		return ladoAC*ladoBD;
	}
	
	public double perimetro() {
		return ladoAC*2 + ladoBD*2;
	}
	

}

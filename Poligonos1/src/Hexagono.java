import java.lang.Math;
public class Hexagono {
	int ladoA;
	int ladoB;
    int ladoC;
    int ladoD;
    int ladoE;
    int ladoF;
    
    public Hexagono() {
    	ladoA = 3;
    	ladoB = 3;
    	ladoC = 3;
    	ladoD = 3;
    	ladoE = 3;
    	ladoF = 3;
	}

	public Hexagono(int ladoA, int ladoB, int ladoC, int ladoD, int ladoE, int ladoF) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
		this.ladoE = ladoE;
		this.ladoF = ladoF;
	}
	
	public double area() {
		return (3*Math.pow(ladoA, 2)*Math.sqrt(3))/2;
		
	}
    
	public int perimetro() {
		return ladoA+ladoB+ladoC+ladoD+ladoE+ladoF;
		
	}
    
}

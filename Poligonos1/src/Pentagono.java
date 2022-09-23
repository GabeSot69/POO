import java.lang.Math;
public class Pentagono {
    int ladoA;
    int ladoB;
    int ladoC;
    int ladoD;
    int ladoE;
    int apotema;
    
    Pentagono() {
    	ladoA = 3;
    	ladoB = 3;
    	ladoC = 3;
    	ladoD = 3;
    	ladoE = 3;
    	apotema = 3;
	}
    
    Pentagono(int ladoA, int ladoB, int ladoC, int ladoD, int ladoE, int apotema) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
		this.ladoE = ladoE;
		this.apotema = apotema;
	}

	public double area(){
        return (perimetro()*apotema)/2;

    }
    
    public double perimetro() {
    	return ladoA+ladoB+ladoC+ladoD+ladoE;
		
	}
}

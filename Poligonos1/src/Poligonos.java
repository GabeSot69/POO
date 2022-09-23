import java.util.Scanner;

public class Poligonos {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("MENU");
			System.out.println("1 - Triangulo");
			System.out.println("2 - Quadrilatero");
			System.out.println("3 - Pentagono");
			System.out.println("4 - Hexagono");
			System.out.println("5 - Sair");
			System.out.print("Escolha: ");
			String escolha = scanner.nextLine();
			switch(escolha) {
				case "1":
					calculaTriangulo();
					break;
				case "2":
					calculaQuadrilatero();
					break;
				case "3":
					calculaPentagono();
					break;
				case "4":
					calculaHexagono();
					break;
				case "5":
					System.out.println("Saindo");
					System.exit(0);
				
			}
			scanner.nextLine();
		}
		
		

		
		
	}
	public static void calculaTriangulo() {
		System.out.println("Escreva o valor do lado A");
		int ladoA = scanner.nextInt();
		System.out.println("Escreva o valor do lado B");
		int ladoB = scanner.nextInt();
		System.out.println("Escreva o valor do lado C");
		int ladoC = scanner.nextInt();
		Triangulo t = new Triangulo(ladoA,ladoB,ladoC);
		System.out.println("Area: " + t.area());
		System.out.println("Perimetro: " + t.perimetro());
		System.out.println("Alfa: " + t.anguloAlfa());
		System.out.println("Beta: " + t.anguloBeta());
		System.out.println("Gama: " + t.anguloGama());
	}
	
	public static void calculaQuadrilatero() {
		System.out.println("Escreva o valor dos lados AC");
		int ladoAC = scanner.nextInt();
		System.out.println("Escreva o valor dos lados BD");
		int ladoBD = scanner.nextInt();
		Quadrilatero q = new Quadrilatero(ladoAC,ladoBD);
		System.out.println("Area: " + q.area());
		System.out.println("Perimetro: " + q.perimetro());
	}
	
	public static void calculaPentagono() {
		System.out.println("Escreva o valor do lados A");
		int ladoA = scanner.nextInt();
		System.out.println("Escreva o valor do lado B");
		int ladoB = scanner.nextInt();
		System.out.println("Escreva o valor do lado C");
		int ladoC = scanner.nextInt();
		System.out.println("Escreva o valor do lado D");
		int ladoD = scanner.nextInt();
		System.out.println("Escreva o valor do lado E");
		int ladoE = scanner.nextInt();
		System.out.println("Escreva o valor do apotema");
		int apotema = scanner.nextInt();
		Pentagono p = new Pentagono(ladoA, ladoB, ladoC, ladoD, ladoE, apotema);
		System.out.println("Area: " + p.area());
		System.out.println("Perimetro: " + p.perimetro());
	}
	
	public static void calculaHexagono() {
		System.out.println("Escreva o valor do lados A");
		int ladoA = scanner.nextInt();
		System.out.println("Escreva o valor do lado B");
		int ladoB = scanner.nextInt();
		System.out.println("Escreva o valor do lado C");
		int ladoC = scanner.nextInt();
		System.out.println("Escreva o valor do lado D");
		int ladoD = scanner.nextInt();
		System.out.println("Escreva o valor do lado E");
		int ladoE = scanner.nextInt();
		System.out.println("Escreva o valor do ladoF");
		int ladoF = scanner.nextInt();
		Hexagono h = new Hexagono(ladoA, ladoB, ladoC, ladoD, ladoE, ladoF);
		System.out.println("Area: " + h.area());
		System.out.println("Perimetro: " + h.perimetro());
	}
	
	
}

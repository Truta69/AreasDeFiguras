package principal;

public class Triangulo implements FiguraPlana {

	@Override
	public double calcularArea(int perimetro) {
		double area=0;
		double lado=perimetro/3;
		double altura=lado*(Math.sqrt(3)/2);
		area=(lado*altura)/2;
		return area;
	}
}

package principal;

public class Quadrado implements FiguraPlana {

	@Override
	public double calcularArea(int perimetro) {
		double area=0;
		double lado=perimetro/4;
		area=Math.pow(lado, 2);
		return area;
	}

}

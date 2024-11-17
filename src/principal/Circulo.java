package principal;

public class Circulo implements FiguraPlana{

	@Override
	public double calcularArea(int perimetro) {
		double area=0;
		double raio=(perimetro)/(2*(Math.PI));
		area=Math.PI*(Math.pow(raio, 2));
		return area;
	}
}

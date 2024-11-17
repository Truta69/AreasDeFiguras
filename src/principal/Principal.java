package principal;

public class Principal {

	public static void main(String[] args) {
		int perimetro=4;		
		
		AreasCliente areaQ = areaQuadrado();
		double quadradoA=areaQ.calcularArea(perimetro);
		System.out.println("Area do quadrado2 ="+quadradoA);
		
		areaCirculo(areaQ);
		double circuloA=areaQ.calcularArea(perimetro);
		System.out.printf("Area do circulo =%.2f\n",circuloA);
		
		FiguraPlana triangulo =new Triangulo();
		areaQ.setFigura(triangulo);
		double trianguloA=areaQ.calcularArea(perimetro);
		System.out.printf("Area do triangulo =%.2f\n",trianguloA);
	}

	private static void areaCirculo(AreasCliente areaQ) {
		FiguraPlana circulo=new Circulo();
		areaQ.setFigura(circulo);
	}

	private static AreasCliente areaQuadrado() {
		FiguraPlana quadrado=new Quadrado();
		AreasCliente areaQ= new AreasCliente();
		areaQ.setFigura(quadrado);
		return areaQ;
	}
}

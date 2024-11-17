package principal;

public class AreasCliente {
	private FiguraPlana figura;

	public void setFigura(FiguraPlana figura) {
		this.figura = figura;
	}
	public double calcularArea(int perimetro) { 
		 return figura.calcularArea(perimetro);
	}
}

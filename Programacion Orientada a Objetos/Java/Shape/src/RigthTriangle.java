
public class RigthTriangle extends Shape {
	//Herencia de la clase Shape
	public RigthTriangle(int dimension1, int dimension2, String color) {
		super(dimension1, dimension2, color);
	}
	//Redefinicion de los Metodos de Shape
	public void area(){
		System.out.println("El area del Triangulo es: " + 0.5*getDimension1()*getDimension2());
	}
	public void perimeter(){
		System.out.println("El perimetro del Triangulo es: " + (getDimension1()+2*Math.sqrt(Math.pow(0.5*getDimension1(),2)+getDimension2())));
	}
	/* En este método agregue las operaciones que ese encuentran en la clase Math, como se sabía la altura y la base
	 * el perímetro se hallo por medio de Pitágoras por eso fue necesario la clase Math que ya viene por defecto en
	 * Java */
	public void color(){
		System.out.println("El color del Triangulo es: " + getColor());
	}
}


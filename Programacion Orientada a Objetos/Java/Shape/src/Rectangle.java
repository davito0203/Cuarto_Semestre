
public class Rectangle extends Shape {
	//Herencia de la clase Shape
	public Rectangle(int dimension1, int dimension2, String color) {
		super(dimension1, dimension2, color);
		}
	//Redefinicion de los Metodos de Shape
	public void area(){
		System.out.println("El area del Rectangulo es: " + getDimension1()*getDimension2());
	}
	public void perimeter(){
		System.out.println("El perimetro del Rectangulo es: " + (2*getDimension1()*2*getDimension2()));
	}
	public void color(){
		System.out.println("El color del Rectangulo es: " + getColor());
	}
}

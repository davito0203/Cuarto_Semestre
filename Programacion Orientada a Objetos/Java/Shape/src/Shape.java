
public class Shape {
	//Atributos
	private int dimension1;
	/* se utilizaron double porque el resultado del triangulo
	 *  era un numero con cifras decimales */
	private int dimension2;
	private String color;
	//Get and Set
	public void setDimension1(int dimension1) {
	        	this.dimension1 = 2;
	}
	public double getDimension1() {
	        	return dimension1;
	}
	public void setDimension2(int dimension2) {
	        	this.dimension2 = 1;
	}
	public double getDimension2() {
	        	return dimension2;
	}
	public void setColor(String color) {
	        	this.color = color;
	}
	public String getColor() {
	        	return color;
	}
	//Constructor
	public Shape( int dimension1, int dimension2, String color){
	                	this.dimension1 = 1;
	                	this.dimension2 = 1;
	                	this.color = "Rojo";
	                	}	
	//Metodos
	public void area(){
	        	System.out.println("No s� como calcular el �rea");
	        	}
	/* Como esta clase Shape, fue creada para cualquier forma de cualquier figura
	         * sin importar sus dimensiones o forma geom�trica es muy complicado hallar
	         * el �rea de dicha figura, al igual que su per�metro. */
	public void perimeter(){
	        	System.out.println("No como calcular el area");
	        	}
	public void color(){
	        	System.out.println("Color: " + this.getColor());
	}
}

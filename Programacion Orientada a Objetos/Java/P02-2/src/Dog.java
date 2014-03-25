
public class Dog {
	//Atributos
	private String name, size, race, coat, colorPiel; //tamaño raza pelaje
   	private int age;
   	private boolean dangerous;
   	
   	//Set and Get
   	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getRace() {
		return race;
	}
	public void setCoat(String coat) {
		this.coat = coat;
	}
	public String getCoat() {
		return coat;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}
	public boolean isDangerous() {
		return dangerous;
	}
	//Constructor del Perro.
	public Dog(String name, String race, String size, 
			   String colorPiel, int age, String coat, boolean dangerous){
		this.name = name;
		this.race = race;
		this.size = size;
		this.colorPiel = colorPiel;
		this.age = age;
		this.coat= coat;
		this.dangerous = dangerous;
		}
	//Métodos de Perro.
	public void bark(){
		if(size=="grande"){
			System.out.println("Guauuuu Guauuuu");
			}
		else if(size=="enorme"){
			System.out.println("Guauuuuuuu Guauuuuuuu");
		}
		else if(size=="mediano"){
			System.out.println("Guauu Guauu");
		}
		else if(size=="pequeño"){
			System.out.println("Guau Guau");
		}
		//if(dangerous==false){
			//System.out.println("Hummm Hummm");
		//} //Esta podria ser una parte opcional
		//else{
			//System.out.println("Grrr Grrr");
		//}
	}
	
	public void eat(){
		System.out.println(name + " a comer.");
		}
	public void run(){
		System.out.println(name + " a correr.");
		}
}

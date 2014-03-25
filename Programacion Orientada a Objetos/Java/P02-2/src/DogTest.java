
public class DogTest {
	public static void main(String[] args) {
		Dog a = new Dog("Kraken", "Alaskan Malamute", "grande", "cafe", 7, "liso", true);
		System.out.println(a.getName()+ " tiene " + a.getAge()+ " años, es un " + a.getRace()
				   + " el color de su pelaje es " + a.getColorPiel() + " es peligroso "
				   + a.isDangerous());
		a.bark();
		a.eat();
		a.run();

		Dog b = new Dog("Zero", "Pitbull", "mediano", "blanco con cafe", 8, "liso", true);
		System.out.println("\n" + b.getName()+ " tiene " + b.getAge()+ " años, es un " + b.getRace()
						   + " el color de su pelaje es " + b.getColorPiel() + " es peligroso "
						   + b.isDangerous());
		b.bark();
		b.eat();
		b.run();

		Dog c = new Dog("Osiris", "Labrador", "pequeño", "amrillo", 2, "liso", false);
		System.out.println("\n" + c.getName()+ " tiene " + c.getAge()+ " años, es un " + c.getRace()
				   + " el color de su pelaje es " + c.getColorPiel() + " es peligroso "
				   + c.isDangerous());
		c.bark();
		c.eat();
		c.run();
		
		Dog d = new Dog("Rock", "Rottweiler", "enorme", "negro y amrillo", 5, "liso", true);
		System.out.println("\n" + d.getName()+ " tiene " + d.getAge()+ " años, es un " + d.getRace()
				   + " el color de su pelaje es " + d.getColorPiel() + " es peligroso "
				   + d.isDangerous());
		d.bark();
		d.eat();
		d.run();
		}
	}

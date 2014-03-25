import java.util.Iterator;

public class MyIntCollectionExample {
	public static void main(String[] args) {
		MyIntCollection mic = new MyIntCollection();
		//MyIntCollection2 mic2 = new MyIntCollection2();

		// Add four random integers to our "special" collection.
		mic.add(3);
		mic.add(7);
		mic.add(13);
		mic.add(10);
		Iterator<Integer> b = mic.iterator();
		while (b.hasNext()) {
		      Integer element = b.next();
		      
		    }
		mic.remove(3);

		//mic2.add(32);
		//mic2.add(62);
		//mic2.add(12);
		//mic2.add(92);

		mic.printInfo();
		
		//mic2.printInfo();
		
		//mic.add(3);
		//mic.add(60);
	//	mic2.add(1);
		//mic2.add(9);
		
		
		/*
		Remove the comment
		mic.remove(3);
		mic.remove(1);
		mic.remove(60);
		mic2.remove(1);
		mic2.remove(92);*/
	}
}


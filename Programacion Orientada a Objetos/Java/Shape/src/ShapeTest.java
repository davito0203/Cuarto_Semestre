
public class ShapeTest {
	public static void main(String[] args) {
		Shape s = new Shape(0,0,null);
    	s.area();
        s.perimeter();
        s.color();
        
    	Rectangle r = new Rectangle(0, 0, null);
    	r.area();
    	r.perimeter();
    	r.color();
    	
    	RigthTriangle rt = new RigthTriangle(0, 0, null);
    	rt.area();
    	rt.perimeter();
    	rt.color();
    	}
}

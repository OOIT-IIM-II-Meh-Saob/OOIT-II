package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(5);
		p1.setSelected(true);
		
		System.out.println("X koordinata tacke p1 je: " + p1.getX());
		System.out.println("Y koordinata tacke p1 je: " + p1.getY());
		System.out.println("Tacka je selektovana? " + p1.getSelected());
		
		Point p2 = new Point();
		p2.setX(13);
		p2.setY(15);
		p2.setSelected(true);
		
		System.out.println("Distanca izmedju tacaka p1 i p2 je: " + p1.distance(p2.getX(), p2.getY()));
		p1.setX(p2.getX());
		System.out.println("Distanca izmedju tacaka p1 i p2 je: " + p1.distance(p2.getX(), p2.getY()));
	}

}

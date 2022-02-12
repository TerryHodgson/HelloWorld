import javax.vecmath.Point3d;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Cruel World");
		
		Point3d p = new Point3d(1,2,3);
		System.out.println("The point is: (" + p.x + ", " + p.y + ", " + p.z + ")");
	}

}

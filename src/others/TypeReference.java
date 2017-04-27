package others;

public class TypeReference {

	public static void main(String[] args) {
		Box b = new Box();
		b.width = 10;
		b.height = 20;
		b.depth = 30;
		System.out.println(b.depth + " " + b.width + " " + b.height);
		boxMethod(b);
		System.out.println(b.depth + " " + b.width + " " + b.height);
	}
	
	public static void boxMethod(Box b) {
		b.depth = 100;
		b.height = 200;
		b.width = 300;
	}

}

class Box {
	public int width;
	public int height;
	public int depth;
}

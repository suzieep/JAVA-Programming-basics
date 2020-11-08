package Notes.Ect;
class Calculation {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("주어진 수의 합: " + z);
	}

	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("주어진 수의 차: " + z);
	}
}

public class Extend extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("주어진 수의 곱: " + z);
	}

	public static void main(String args[]) {
		int a = 20, b = 10;
		Extend demo = new Extend();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);
	}
}
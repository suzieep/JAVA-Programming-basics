package Notes.Ect;
interface Animal {
}

class Mammal implements Animal {
}

public class Cat2 extends Mammal {
	public static void main(String args[]) {
		Mammal m = new Mammal();
		Cat2 c = new Cat2();
		System.out.println(m instanceof Animal);
		System.out.println(c instanceof Mammal);
		System.out.println(c instanceof Animal);
	}
}

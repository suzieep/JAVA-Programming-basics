interface Animal {
}

class Mammal implements Animal {
}

public class Cat extends Mammal {
	public static void main(String args[]) {
		Mammal m = new Mammal();
		Cat c = new Cat();
		System.out.println(m instanceof Animal);
		System.out.println(c instanceof Mammal);
		System.out.println(c instanceof Animal);
	}
}

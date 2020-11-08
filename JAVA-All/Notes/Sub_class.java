package 상속;

class Super_class {
	int num = 20;

// super 클래스 메소드 보여주기
	public void display() {
		System.out.println("super 클래스의 display 메소드입니다.");
	}
}

public class Sub_class extends Super_class {
	int num = 10;

// sub 클래스 메소드 보여주기
	public void display() {
		System.out.println("sub 클래스의 display 메소드입니다.");
	}

	public void my_method() {
// sub클래스 인스턴스화
		Sub_class sub = new Sub_class();
//sub클래스 display() 메소드 호출
		sub.display();
//super클래스 display() 메소드 호출
		super.display();
//sub클래스의 num 변수 값 출력
		System.out.println("sub 클래스에서의 num 변수 값: " + sub.num);
//super클래스의 num 변수 값 출력
		System.out.println("sub 클래스에서의 num 변수 값: " + super.num);
	}

	public static void main(String args[]) {
		Sub_class obj = new Sub_class();
		obj.my_method();
	}
}

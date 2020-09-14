public class Cat {
	int catAge;

	public Cat(String name) {
		System.out.println("고양이 이름 :" + name);
	}

	public void setAge(int age) {
		catAge = age;
	}

	public int getAge() {
		System.out.println("고양이의 나이 :" + catAge);
		return catAge;
	}

	public static void main(String[] args) {
		/* 객체 생성 */
		Cat myCat = new Cat("tom");
		/* 클래스의 메소드를 호출하여 고양이의 나이 설정 */
		myCat.setAge(2);
		/* 다른 클래스 메소드를 호출하여 강아지의 나이를 얻습니다 */
		myCat.getAge();
		/* 다음과 같이 인스턴스 변수에 액세스 할 수 있습니다. */
		System.out.println("변수 값 :" + myCat.catAge);
	}
}
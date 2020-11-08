package Notes.Ect;



public class InstanceCounter {
	private static int numInstances = 0; //전역변수

	protected static int getCount() {
		return numInstances;
	}

	private static void addInstance() { //static 변수는 static 함수에서만 쓰
		numInstances++;
	}

	InstanceCounter() {
		InstanceCounter.addInstance(); //클래스 이
	}

	public static void main(String[] arguments) {
		System.out.println("시작 인스턴스 " + InstanceCounter.getCount());
		for (int i = 0; i < 500; ++i) {
			new InstanceCounter(); //인스턴스가 500개 생김 
		}
		System.out.println("만들어진 인스턴스 " + InstanceCounter.getCount());
	}
}
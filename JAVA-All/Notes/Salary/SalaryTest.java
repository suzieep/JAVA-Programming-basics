public class SalaryTest {
	public static void main(String[] args) {
		Salary s = new Salary("김민재", "서울", 3, 3600.00);
		Employee e = new Salary("김민준", "부산", 2, 2400.00);
		System.out.println("Salary 참조 ----------------");
		s.mailCheck();
		System.out.println("\n Employee 참조 ----------------");
		e.mailCheck();
	}
}
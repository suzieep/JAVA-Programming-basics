package test;

public class StaffTest {
	public static void main(String args[]) {
		/* 생성자를 이용하여 두 개의 객체 만들기 */
		Staff stfOne = new Staff("김민준");
		Staff stfTwo = new Staff("이수빈");
// 생성된 각 객체에 대한 메소드 호출
		stfOne.stfAge(26);
		stfOne.stfDesignation("팀장");
		stfOne.stfSalary(1000);
		stfOne.printstfloyee();
		stfTwo.stfAge(21);
		stfTwo.stfDesignation("대리");
		stfTwo.stfSalary(500);
		stfTwo.printstfloyee();
	}
}
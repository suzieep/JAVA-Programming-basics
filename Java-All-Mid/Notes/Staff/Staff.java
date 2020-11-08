package Notes.Staff;

public class Staff {
	String name;
	int age;
	String designation;
	double salary;

	// Staff 클래스의 생성자입니다.
	public Staff(String name) {
		this.name = name;
	}

	// Staff의 나이를 변수로 지정합니다.
	public void stfAge(int stfAge) {
		age = stfAge;
	}

	/* 직책을 변수로 지정합니다. */ public void stfDesignation(String stfDesig) {
		designation = stfDesig;
	}

	/* 급여를 변수로 지정합니다. */
	public void stfSalary(double stfSalary) {
		salary = stfSalary;
	}

	/* Staff의 세부정보를 출력합니다. */
	public void printstfloyee() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("직책:" + designation);
		System.out.println("급여:" + salary);
	}
}

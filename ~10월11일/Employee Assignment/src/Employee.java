public class Employee {
	private String name;
	private int salary;
	private int yearlySalary;

	public Employee(String name) {
		this.name = name;
	}

	public void setMonthlySalary (int salary){
		this.salary = salary;
		System.out.println(this.name + "의 월급은"  + salary + "입니다.");
	}

	public int getYearlySalary() {
		yearlySalary = salary*12;
		System.out.println(this.name + "의 연봉은"  + yearlySalary + "입니다.");
		return yearlySalary;
	}

}
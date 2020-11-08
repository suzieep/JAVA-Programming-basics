package Notes.Salary;
public class Salary extends Employee {
	private double salary; // 연봉

	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}

	public void mailCheck() {
		System.out.println(getName() + " 봉급: " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	public double computePay() {
		System.out.println("계산된 급여 " + getName());
		return salary / 52;
	}
}
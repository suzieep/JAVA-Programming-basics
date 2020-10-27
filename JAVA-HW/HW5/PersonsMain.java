package HW5;

public class PersonsMain {

    public static void main(String[] args) {

        Student[] arrStudents = new Student[5];
        Employee[] arrEmployees = new Employee[5];

        arrStudents[0] = new Student("이수진","19980427","고양시",4.5,"2017112164");
        arrStudents[1] = new Student("이수정","19980426","기양시",3.4,"2017112165");
        arrStudents[2] = new Student("이수방","19980425","가양시",3.7,"2017112166");
        arrStudents[3] = new Student("이수강","19980424","규양시",2.5,"2017112167");
        arrStudents[4] = new Student("이수기","19980423","자양시",4.3,"2017112168");

        arrEmployees[0] = new Employee("이수진","19980427","고양시",450,"2017112164");
        arrEmployees[1] = new Employee("이수정","19980426","기양시",340,"2017112165");
        arrEmployees[2] = new Employee("이수방","19980425","가양시",370,"2017112166");
        arrEmployees[3] = new Employee("이수강","19980424","규양시",250,"2017112167");
        arrEmployees[4] = new Employee("이수기","19980423","자양시",170,"2017112168");
        
        empAvgSalary(arrEmployees);
        stuAvgSalary(arrStudents);
        
    }
    public static void empAvgSalary(Employee [] arrEmployees) {
        int totalSalary = 0;
        double avgSalary = 0;
        for(int i = 0; i < arrEmployees.length; i++) {
        totalSalary = totalSalary + arrEmployees[i].getMonthlySalary(); // 월급의 12배 계산
        avgSalary = totalSalary/arrEmployees.length;
    }
    System.out.println("average Salary is " + avgSalary);

    }

    public static void stuAvgSalary(Student [] arrStudents) {
        double totalGPA = 0;
        double avgGPA = 0;
        for(int i = 0; i < arrStudents.length; i++) {
            totalGPA = totalGPA + arrStudents[i].getGPA(); // 월급의 12배 계산
            avgGPA = totalGPA/arrStudents.length;
    }
    System.out.println("average GPA is " + avgGPA);

    }
}


class Person {
    public String personName;
    public String birthDate;
    public String homeAddress;

    public Person(){
    
    }

    public Person(String n, String date, String address) {
    }

    public String getName() {
        return personName;

    }

    public String getBirthDate(){
        return birthDate;
        }

    public void setName(String personName) {
        this.personName = personName;

    }

    public void setBirthDate(String birthDate) {
        this.birthDate= birthDate;

    }
}

class Employee extends Person {
    String employeeID;
    int salary;

    public Employee(String name, String date, String address, int salary, String id) {
        this.salary = salary;
    }

    int getMonthlySalary() {
        
        return salary;
    }
}

class Student extends Person {
    String studentID;
    double gpa;

    Student(String name, String date, String address, double gpa, String id) {
        this.gpa = gpa;
        this.studentID = id;
    }

    double getGPA() {
        return gpa;

    }
}
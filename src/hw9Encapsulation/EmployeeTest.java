package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Mohammad Islam");
		employee.setAge(27);
		employee.setSex('M');
		employee.setUsCitizen(false);
		System.out.println("The employee information is given below:\nName:" + employee.getName() + "\nAge: "
				+ employee.getAge() + "\nSex: " + employee.getSex() + "\nUS Citizen: " + employee.isUsCitizen());

	}

}

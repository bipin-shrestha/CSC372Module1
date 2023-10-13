
public class Manager extends Employee{

	String department;
	
	public Manager(String firstName, String lastName, int employeeID, double salary, String department) {
		super(firstName, lastName, employeeID, salary);
		this.department = department; 
	}
	
	public void EmployeeSummary() {
		super.EmployeeSummary();
		System.out.println("Department : " + department);
	}
	
}

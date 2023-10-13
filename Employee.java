
public class Employee {
		//Declaring variables
		private String firstName;
		private String lastName;
		private int employeeID;
		private double salary = 0;
		
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public int getEmployeeID() {
			return employeeID;
		}
		
		public void setFirstName(String FirstName) {
			this.firstName = FirstName;
		}
		public void setLastName(String LastName) {
			this.lastName = LastName;
		}
		public void setEmployeeID(int EmployeeID) {
			this.employeeID = EmployeeID;
		}
		public Employee (String firstName, String lastName, int employeeID, double salary) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.employeeID = employeeID;
			this.salary = salary;
		}
		
		public void EmployeeSummary() {
			System.out.println("Employee Summary : ");
			System.out.println("First Name : " + getFirstName());
			System.out.println("Last Name : " + getLastName());
			System.out.println("Employee ID : " + getEmployeeID());
			System.out.println("Salary : $" + salary);
		}
		
}

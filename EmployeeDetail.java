
public class EmployeeDetail {
	public static void main(String[] args) {
				
		Employee employee = new Employee("Clark", "Smith", 1, 25000);
		Employee employee1 = new Employee("Buddha", "Monk", 1, 25000);
		Manager manager = new Manager("Doubluu", "Kent", 1, 45000, "Manager");
		employee.EmployeeSummary();
		System.out.println("\n");
		employee1.EmployeeSummary();
		System.out.println("\n");
		manager.EmployeeSummary();
		System.out.println(employee.getFirstName());
	}
}

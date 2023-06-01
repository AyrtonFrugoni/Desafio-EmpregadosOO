package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;
	private List<Employee> employees = new ArrayList<>();

	public Department() {
	}

	public Department(String name, int payDay) {
		this.name = name;
		this.payDay = payDay;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payroll() {
		double totalSalary = 0.00;
		for (Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		return totalSalary;
	}

	public Department(List<Employee> employees) {
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public void generatePayrollReport() {
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println("Departamento " + name + " = R$ " + payroll());
		System.out.println("Pagamento realizado no dia " + payDay);
		System.out.println("Funcionários:");
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}

	public int getPayDay() {
		return payDay;
	}

}

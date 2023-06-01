import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Adress;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();

		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		Adress adress = new Adress(email, phone);

		// Criando o departamento
		Department department = new Department(name, payDay);

		// Lendo a quantidade de funcionários
		System.out.print("Quantos funcionários tem o departamento? ");
		int numEmployees = sc.nextInt();
		sc.nextLine();

		// Lendo os dados dos funcionários
		for (int i = 1; i <= numEmployees; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			System.out.print("Nome: ");
			String employeeName = sc.nextLine();

			System.out.print("Salário: ");
			Double employeeSalary = sc.nextDouble();
			sc.nextLine();

			Employee employee = new Employee(employeeName, employeeSalary);
			department.addEmployee(employee);
		}

		// Gerando o relatório de folha de pagamento
		showReport(department);

		sc.close();
	}

	private static void showReport(Department department) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
		System.out.println("\nFOLHA DE PAGAMENTO:");
		System.out.println("Departamento " + department.getName() + " = R$ " + decimalFormat.format(department.payroll()));
		System.out.println("Pagamento realizado no dia " + department.getPayDay());
		System.out.println("Funcionários:");
		for (Employee employee : department.getEmployees()) {
			System.out.println(employee.getName());
		}
		System.out.println("Para dúvidas favor entrar em contato: " + Adress.getEmail());
	}
	
}

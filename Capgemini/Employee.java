package com.Capgemini;

import java.util.Scanner;

class EmployeeList {
	private String name;
	private int id;
	private int salary;

	EmployeeList() {

	}

	public EmployeeList(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeList [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeList[] emp = null;
//		EmployeeList emp1=new EmployeeList();
		while (true) {
			System.out.println("Enter 1 for entering employee");
			System.out.println("Enter 2 for displaying the employee");
			System.out.println("Enter 3 for the exit");
			System.out.println("Enter 4 for delete a employee");
			System.out.println("Enter 5 for search a employee");
			System.out.println("Enter 6 Sort the Employee ASC BY Name");
			System.out.println("Enter 7 Sort the Employee DSC By Name");
			System.out.println("Enter 8 Sort the Employee ASC BY Salary");
			System.out.println("Enter 9 Sort the Employee DSC By Salary");
			System.out.println("Enter 10 Minimun paid salary employee");
			System.out.println("Enter 11 maximum salary of employee");
			System.out.println("Enter 12 Avg  and sum of employee Salary");

			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the number of employee");
				int no = sc.nextInt();
				emp = new EmployeeList[no];
				for (int i = 0; i < no; i++) {
					System.out.println("Enter the name for employee " + (i + 1));
					String name = sc.next();
					System.out.println("Enter the id for employee " + (i + 1));
					int id = sc.nextInt();
					System.out.println("Enter the salary for employee " + (i + 1));
					int salary = sc.nextInt();
					emp[i] = new EmployeeList(name, id, salary);
				}
				break;
			}
			case 2: {
				for (int i = 0; i < emp.length; i++) {
					System.out.println(emp[i].toString());
				}
				break;

			}
			case 3: {
				System.exit(0);
				break;
			}
			case 4: {
				boolean f = false;
				System.out.println("Enter the name of emp for deletion");

				String name = sc.next();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getName().equalsIgnoreCase(name)) {
						emp[i] = null;
						f = true;
						break;
					}
				}
				if (f == false)
					System.out.println("No record found");
				break;
			}
			case 5: {
				boolean f = false;
				System.out.println("Enter the id of emp for searching");

				int id = sc.nextInt();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() == id) {
						System.out.println(emp[i]);
						f = true;
						break;
					}
				}
				if (f == false)
					System.out.println("No record found");
				break;
			}
			case 6: {

				for (int i = 0; i < emp.length; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if (emp[i].getName().compareToIgnoreCase(emp[j].getName()) > 0) {
							EmployeeList temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				for (EmployeeList i : emp) {
					System.out.println(i);
				}
				break;
			}
			case 7: {
				for (int i = 0; i < emp.length; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if (emp[i].getName().compareToIgnoreCase(emp[j].getName()) < 0) {
							EmployeeList temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				for (EmployeeList i : emp) {
					System.out.println(i);
				}
				break;
			}
			case 8: {
				for (int i = 0; i < emp.length; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if (emp[i].getSalary() > emp[j].getSalary()) {
							EmployeeList temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				for (EmployeeList i : emp) {
					System.out.println(i);
				}
				break;
			}
			case 9: {
				for (int i = 0; i < emp.length; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if (emp[i].getSalary() < emp[j].getSalary()) {
							EmployeeList temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				for (EmployeeList i : emp) {
					System.out.println(i);
				}
				break;
			}
			case 10: {
				int min = emp[0].getSalary();
				for (int i = 1; i < emp.length; i++) {
					if (emp[i].getSalary() < min) {
						min = emp[i].getSalary();
					}
				}
				System.out.println(min);
				break;
			}
			case 11: {
				int max = emp[0].getSalary();
				for (int i = 1; i < emp.length; i++) {
					if (emp[i].getSalary() > max) {
						max = emp[i].getSalary();
					}
				}
				System.out.println(max);
				break;
			}
			case 12: {
				int sum = 0;
				for (int i = 0; i < emp.length; i++) {
					sum = sum + emp[i].getSalary();
				}
				System.out.println("The sum is " + sum + " The avg is " + (sum / emp.length));
			}
			}
		}
	}
}

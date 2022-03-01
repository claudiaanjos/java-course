package Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		
		Calendar cal = Calendar.getInstance();
		
		for (HourContract c: contracts) {
			//setar no calendário a data do calendário c
			//c.getDate: peguei a data do meu contrato e defini essa data como sendo a do calendário
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH + 1); //mês no Calendar começa com zero
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department departament) {
		this.department = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	
}

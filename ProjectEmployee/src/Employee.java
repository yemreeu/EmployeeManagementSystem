
public class Employee {

//	name : Çalışanın adı ve soyadı
//	salary : Çalışanın maaşı
//	workHours : Haftalık çalışma saati
//	hireYear : İşe başlangıç yılı
	
	// Defining required variables
	String name;
	double salary;
	int workHours;
	int hireYear;
	double taxQuantity = 0;
	int bonusSalary = 0;
	double salaryIncrease = 0;
	double netSalary = 0 ;
	int currentYear = 2022;
	
	// Creating constructor method
	Employee(String name,double salary,int workHours,int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	// Rest of the code contains methods
	public double tax(double salary,double taxQuantity) {
		
		if(salary > 1000) {
			taxQuantity = salary * 0.03;
		}
		
		return taxQuantity;
		
	}
	
	public int bonus(int workHours,int bonusSalary) {

		
		if(workHours > 40) {
			int difference = workHours - 40;
			bonusSalary = difference * 30;
			
		}
		return bonusSalary;
	}
	
	public double raiseSalary(int hireYear,int currentYear) {
		
		
		
		int experience = currentYear - hireYear;
		
		if(experience < 10) {
			salaryIncrease = salary * 0.05;
		}
		else if (experience > 10 && experience <20) {
			salaryIncrease = salary * 0.1;
		}
		else if(experience > 20) salaryIncrease = salary * 0.15;
		
		return salaryIncrease;
	}
	
	public double CalculateNetSalary(int bonusSalary,double taxQuantity) {
		netSalary = salary + bonusSalary - taxQuantity;
		return netSalary;
	}
	
	public double totalSalary() {
		return salary + salaryIncrease + bonusSalary - taxQuantity;
	}
	
	public void toPrint() {
		System.out.println("Adı: " + name);
		System.out.println("Maaşı: " + salary);
		System.out.println("Çalışma Saati: " + workHours);
		System.out.println("Vergi: " + tax( salary, taxQuantity));
		System.out.println("Bonus: " + bonus( workHours, bonusSalary));
		System.out.println("Maaş artışı: " + raiseSalary( hireYear, currentYear));
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + CalculateNetSalary( bonusSalary, taxQuantity));
		System.out.println("Toplam Maaş: " + totalSalary());
	}
	
}

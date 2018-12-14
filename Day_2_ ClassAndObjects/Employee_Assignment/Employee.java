/* write a class employee and different methods */

package Employee_Assignment;
public class Employee {
	private int ID;
	private String Name;
	private static double  monthlyBasic;
	private double PFRate, profTax;
	
	public double getAnnualBasic() {
		return 12*monthlyBasic;
	}

	public double getMonthlyGrossSalary() {
		double HRA=(50*monthlyBasic)/100;
		double medical= 1250;
		double conveyance=800;
		return ( monthlyBasic+HRA+medical+conveyance) ;
	}

	public double getAnnualGrossSalary() {
		return 12*getMonthlyGrossSalary();
	}

	public double getMonthlyDeductions() {
		double pf = (monthlyBasic *PFRate)/100 < 6500 ? (monthlyBasic*PFRate)/100: 6500;
		double ESIC=(monthlyBasic <=5000) ? (monthlyBasic*4.75)/100 : 0;
		double profTax=(getMonthlyGrossSalary() <=10000) ? 50: 100;
		return pf+ ESIC + profTax;
	}

	public double getAnnualTakeHome() {
		return 12*getMonthlyTakeHome();
	}

	public double getMonthlyTakeHome(){
		return getMonthlyGrossSalary() - getMonthlyDeductions();
	}

	public double setPFRate(double PFRate) {
		this.PFRate=PFRate;
		return PFRate;
	}

	public double getPFRate() {
		return PFRate;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic( double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
}

public class MA_Production extends Mitarbeiter{
    
	public MA_Production(String name, String firstName, int bithrYear, String workID, String department, String role,
			int hiredYear) {
		super(name, firstName, bithrYear, workID, department, role, hiredYear);
	}

	public void doYourWork(String flag) {
		
		switch (flag) {
		case "#manufacturing":
			assembleCar();
			break;
		default:
			this.doSomething();
			break;
		}
    }  
	public void assembleCar() {
		System.out.println("Hi, I'm " +super.getFirstName() + " " + super.getName() + " and I'm assembling a car!");		
	}  
}

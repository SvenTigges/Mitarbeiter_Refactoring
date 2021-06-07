public class MA_Advertising extends Mitarbeiter{

    public MA_Advertising(String name, String firstName, int bithrYear, String workID, String department, String role,
			int hiredYear) {
		super(name, firstName, bithrYear, workID, department, role, hiredYear);
	}

	public void doYourWork(String flag) {
		
		switch (flag) {		
		case "#advertising":
			this.postingOnSocialMedia();
			break;
		default:
			this.doSomething();
			break;
    	}
	}
}

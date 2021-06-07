public class MA_Production extends Mitarbeiter{
    
    public MA_Production(String name, String firstName, int i, String role, String workID, String department, int hiredYear) {
        super(role, workID, department, hiredYear);
    }

	public void doYourWork(String flag) {
		
		switch (flag) {
		case "#manufacturing":
			this.assembleCar();
			break;
		case "#accounting":
			this.checkAccount();
			break;			
		case "#advertising":
			this.postingOnSocialMedia();
			break;
		default:
			this.doSomething();
			break;
		}
    }    
}

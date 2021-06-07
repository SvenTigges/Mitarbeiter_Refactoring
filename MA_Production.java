public class MA_Production extends Mitarbeiter{
    
    public MA_Production(String workID, String department, String role) {
        super(workID, department, role);
        
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

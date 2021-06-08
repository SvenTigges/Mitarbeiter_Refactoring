public class MA_Accounting extends Mitarbeiter{
    
public MA_Accounting(String name, String firstName, int bithrYear, String workID, String department, String role,
            int hiredYear) {
        super(name, firstName, bithrYear, workID, department, role, hiredYear);
    }

public void doYourWork(String flag) {
    switch (flag) {
    case "#accounting":
        checkAccount();
        break;			
    default:
        this.doSomething();
        break;
    }
}   
protected void checkAccount() {
    System.out.println("Hi, I'm " + super.getFirstName() + " " + super.getName() + " and I'm checking a customer's account!");		
}
}
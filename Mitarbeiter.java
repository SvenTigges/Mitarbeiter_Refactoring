public class Mitarbeiter extends Person {
	
	public String workID;
	public String department;
	public String role;
	public int hiredYear;
		
	public Mitarbeiter(String name, String firstName, int bithrYear, String workID, String department, String role,
			int hiredYear) {
		super(name, firstName, bithrYear);
		this.workID = workID;
		this.department = department;
		this.role = role;
		this.hiredYear = hiredYear;
		
	}

	/**
	 *  Ausgabe1 // Verhalten Luch
	 */
	public void hasLunch() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm having lunch!");		
	}
	
	/**
	 *  Ausgabe2 //  Verhalten Arbeitsbeginn
	 */

	public void startsWork() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm starting my work!");		
	}
	
	
	/**
	 *  Ausgabe --> accounting
	 */
	protected void checkAccount() {
		System.out.println("Hi, I'm " + super.getFirstName() + " " + super.getName() + " and I'm checking a customer's account!");		
	}
	
	/**
	 *  Ausgabe --> production
	 */
	public void assembleCar() {
		System.out.println("Hi, I'm " +super.getFirstName() + " " + super.getName() + " and I'm assembling a car!");		
	}

	/**
	 *  Ausgabe --> advertising
	 */
	
	protected void postingOnSocialMedia() {
		System.out.println("Hi, I'm " + super.getFirstName() + " " + super.getName() + " and I'm posting a phothograph on IG!");		
	}

	/**
	 *  Ausgabe --> Default
	 */
	protected void doSomething() {
		System.out.println("Hi, I'm doing something.");		
	}
	public int getHiredYear() {
        return hiredYear;
    }
    public void setHiredYear(int hiredYear) {
        this.hiredYear = hiredYear;
    }

	public void tellAboutYou(){
        System.out.println("My name is " + firstName + " " +  name +
         " I was born in  " + birthYear + " I work in this company for about " + Rechner.rechner(hiredYear) + " years");
    
    }
}




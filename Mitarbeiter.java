public class Mitarbeiter extends Person {
	


	private static int bithrYear;
	public String workID;
	public String department;
	public String role;
	public static int hiredYear; 
		


	public Mitarbeiter(String role, String workID, String department, int hiredYear) {
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
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm having lunch!");		
	}
	
	/**
	 *  Ausgabe2 //  Verhalten Arbeitsbeginn
	 */

	public void startsWork() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm starting my work!");		
	}
	
	
	/**
	 *  Ausgabe --> accounting
	 */
	protected void checkAccount() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm checking a customer's account!");		
	}
	
	/**
	 *  Ausgabe --> production
	 */
	public void assembleCar() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm assembling a car!");		
	}

	/**
	 *  Ausgabe --> advertising
	 */
	
	protected void postingOnSocialMedia() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm posting a phothograph on IG!");		
	}

	/**
	 *  Ausgabe --> Default
	 */
	protected void doSomething() {
		System.out.println("Hi, I'm doing something.");		
	}
	
	}

}

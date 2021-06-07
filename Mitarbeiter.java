import java.security.Permission;


public class Mitarbeiter extends Person {
	


	public String workID;
	public String department;
	public String role;

		
	public Mitarbeiter(String workID, String department, String role) {
		super(workID, department, role); 
		this.workID = workID;
		this.department = department;
		this.role = role;
		

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

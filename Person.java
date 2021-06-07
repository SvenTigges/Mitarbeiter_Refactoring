public class Person {

    protected String name;
	protected String firstName;
	private int birthYear;
   
   
   
    public Person(String name, String firstName, String role) {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
    }
	/**
	 * Getter
	 * @return name  // Familienname MA
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Setter
	 * @param name // Familienname MA
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Getter
	 * @return fistName // Vorname MA
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter
	 * @param firstName // Vorname MA
	 * Vorname
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter
	 * @return birthYear // Geburtsjahr MA
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	
	/**
	 * Setter
	 * @param birthYear // Geburtsjahr MA
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
    
    
}

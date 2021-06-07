
public class Person {

    protected  String name;
	protected  String firstName;
	protected  int birthYear;
    
     
   
   
    public Person(String name, String firstName, int bithrYear) {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = bithrYear;
       
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
	public void doYourWork(String string) {
	}
	public void hasLunch() {
	}
	public void startsWork() {
	}
    
}

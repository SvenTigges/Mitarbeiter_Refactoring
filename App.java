public class App {
    public static void main(String[] args) {
		
		MA_Production ma1 = new MA_Production("Müller", "Max", 1965, "ID001" , "production", "worker", 2018);
		MA_Accounting ma2 = new MA_Accounting("Popow", "Oleg", 1974, "ID002" , "accounting", "accountant", 2012);
		MA_Advertising ma3 = new MA_Advertising("Martinelli", "Silvia", 1985, "ID003" , "advertising", "consultant", 2019);
		
		ma1.startsWork();
		ma2.startsWork();
		ma3.startsWork();
		
		System.out.println("--------------------------------");

		ma1.hasLunch();
		ma2.hasLunch();
		ma3.hasLunch();
		
		System.out.println("--------------------------------");

		ma1.doYourWork("#manufacturing");
		ma2.doYourWork("#accounting");			
		ma3.doYourWork("#advertising");	

		System.out.println("--------------------------------");

		ma1.tellAboutYou();
		ma2.tellAboutYou();
		ma3.tellAboutYou();

		
		// System.out.println(ma1.getBirthYear());				
		// ma2.setName("Nossow");
		// System.out.println(ma2.getName());
    
	}
}

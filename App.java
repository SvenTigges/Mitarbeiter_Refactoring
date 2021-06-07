public class App {
    public static void main(String[] args) {
		
		MA_Production ma1 = new MA_Production("Müller", "Max", "ID001");
		Ma_Accounting ma2 = new Ma_Accounting("Popow", "Oleg", "ID002");
		MA_Advertising ma3 = new MA_Advertising("Martinelli", "Silvia", "ID003");
		
		ma1.startsWork();
		ma2.startsWork();
		ma3.startsWork();
		
		ma1.hasLunch();
		ma2.hasLunch();
		ma3.hasLunch();
		
		ma1.doYourWork("#manufacturing");
		ma2.doYourWork("#accounting");			
		ma3.doYourWork("#advertising");	
		
		System.out.println(ma1.getBirthYear());				
		ma2.setName("Nossow");
		System.out.println(ma2.getName());
    }
}

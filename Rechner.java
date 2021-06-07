import java.time.LocalDate;

public class Rechner {
   
    static int rechner (int hiredYear){
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int years = currentYear-hiredYear;
        return years;
}
}
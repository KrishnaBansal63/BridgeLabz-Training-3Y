
import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.now();
        System.out.println("Original Date: " + inputDate);

        LocalDate result = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Modified Date: " + result);
    }
}

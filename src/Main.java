import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        LocalDate firstDateOfMonth = date.minusDays(today - 1);
        DayOfWeek weekday = firstDateOfMonth.getDayOfWeek();
        int value = weekday.getValue();
        LocalDate startDay = firstDateOfMonth;

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 0; i<value; i++) {
            System.out.printf("%3s", " ");
        }
        while(startDay.getMonthValue() == month) {
            System.out.printf("%3d", startDay.getDayOfMonth());

            if (startDay.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            startDay = startDay.plusDays(1);
            if (startDay.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }

    }
}
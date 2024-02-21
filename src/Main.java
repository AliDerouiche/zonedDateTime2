import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        OffsetDateTime odt = OffsetDateTime.parse(data);
        ZonedDateTime zdt = ZonedDateTime.ofInstant(odt.toInstant(), odt.getOffset());

        int zdtYear = zdt.getYear();
        Month zdtMonth = zdt.getMonth();
        DayOfWeek zdtDayOfWeek = zdt.getDayOfWeek();
        int zdtDayOfMonth = zdt.getDayOfMonth();
        int zdtDayOfYear = zdt.getDayOfYear();


        System.out.println("the year is : " + zdtYear);
        System.out.println("the month is : " + zdtMonth);
        System.out.println("the day is : " + zdtDayOfWeek);
        System.out.println("the day of month is : " + zdtDayOfMonth);
        System.out.println("the day of year is : " + zdtDayOfYear);

    }
}
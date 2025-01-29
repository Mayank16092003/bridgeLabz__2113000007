package Day6_29_01_2025.Assignment2.Level2;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class TimeZone {
    public static void main(String[] args) {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("time right now in GMT is: " + gmtTime.format(formatter));
        System.out.println(" time right now in IST is : " + istTime.format(formatter));
        System.out.println(" time right now in PST is : " + pstTime.format(formatter));
    }
}
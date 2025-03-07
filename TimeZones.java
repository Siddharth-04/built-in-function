import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
class TimeZones{
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();

        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime pctTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Indian Standard Time : " + istTime);
        System.out.println("GMT Time : " + gmtTime);
        System.out.println("Pacific Time : " + pctTime);


    }
}
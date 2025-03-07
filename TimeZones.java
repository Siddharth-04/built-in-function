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
/*
    java TimeZones.java
    Indian Standard Time : 2025-03-07T15:28:06.759178600+05:30[Asia/Kolkata]
    GMT Time : 2025-03-07T09:58:06.759178600Z[GMT]
    Pacific Time : 2025-03-07T01:58:06.761175300-08:00[America/Los_Angeles]

*/
package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneIds : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneIds = " + availableZoneIds);
            ZoneId zoneId = ZoneId.of(availableZoneIds);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = zoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}

package chap2_creating_and_destroying_obj.item5_avoid_creating_unnecessary_obj;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {

    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    // DON'T DO THIS!
    public boolean isBabyBoomer() {
        // Unnecessary allocation of expensive object
        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.set(1946, Calendar.JANUARY, 1, 0, 0);
        final Date boomStart = calendar.getTime();
        calendar.set(1965, Calendar.JANUARY, 1, 0, 0);
        final Date boomEnd = calendar.getTime();
        System.out.println(birthDate.toString());
        System.out.println(birthDate.compareTo(boomStart) + ", " + birthDate.compareTo(boomEnd));
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }
}

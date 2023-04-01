package Input;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateHelper {

    public static java.sql.Date getDate(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(
                    "Here is the date string we are trying to forma: " + date);
            java.util.Date javaDate = format.parse(date);
            java.sql.Date sqlDate = new java.sql.Date(javaDate.getTime());
            return sqlDate;
        } catch (ParseException e) {
            System.out.println(e);
            return null;
        }

    }

}

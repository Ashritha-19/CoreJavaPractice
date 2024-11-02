package DateValidation;

import Inheritance.Example3.CheckingAccount;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DateValidationTest {

    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
    }



    Calendar calendar = Calendar.getInstance();

}

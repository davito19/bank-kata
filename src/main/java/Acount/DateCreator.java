package Acount;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateCreator {

    public static Date date(String dateString){
        // DateConverter dateConverter = new DateConverter();
        // Date date = (Date) dateConverter.convertValue(dateString, Date.class);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = format.parse(dateString);
        } catch (ParseException e) {
            date = null;
        }
        return date;
    }

}
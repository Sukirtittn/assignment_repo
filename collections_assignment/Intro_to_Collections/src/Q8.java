import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Q8 {
    public static void main(String[] args)throws ParseException {
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MMMMM-yyyy");
        System.out.println(dt1.format(Calendar.getInstance().getTime()));
    }
}

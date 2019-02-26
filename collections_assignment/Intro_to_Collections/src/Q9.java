import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class Q9 {
    public static void main(String[] args) {
        System.out.println("France Date and Time Format : ");
        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        System.out.println(date);
        Locale locale1 = new Locale("fr", "FR");
        DateFormat dateFormat1 = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale1);
        String date1 = dateFormat1.format(new Date());
        System.out.println(date1);
        System.out.println("Italian Date and Time format: ");
        Locale locale2 = new Locale("it", "ch");
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        String date2 = dateFormat2.format(new Date());
        System.out.println("" + date2);
        Locale locale3 = new Locale("it", "ch");
        DateFormat dateFormat3 = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale3);
        String date3 = dateFormat3.format(new Date());
        System.out.println(date3);
    }
}

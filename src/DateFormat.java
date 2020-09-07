import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        String date="yyyy-MM-yyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(date);
        String dateFor=simpleDateFormat.format(new Date());
        System.out.println(dateFor);

    }
}

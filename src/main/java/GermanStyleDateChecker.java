import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile("([0-9]|[0-2][0-9]|3[0,1]).((0?[0-9])|(1[0-2])).[0-9]{4}");
        return p.matcher(dateString);
    }
}

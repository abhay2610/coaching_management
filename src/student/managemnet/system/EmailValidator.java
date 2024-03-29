package student.managemnet.system;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator {
    private final Pattern pattern;
    private Matcher matcher;

     String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

   
    public boolean validate(String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}
    


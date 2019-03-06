import org.apache.commons.lang3.StringUtils;
public class MainClass {
    static String name;
    public static void main(String[] args) {
//The java.lang.String class offers a limited set of String methods so this is where StringUtils comes in.
//StringUtils provides null-safe methods for handling Strings and is probably the most commonly used class in the Apache Commons project.
        if (StringUtils.isBlank(name)) {
            System.out.println("used StringUtils isBlank() method");
        }
        else
            System.out.println("name is "+name);

    }
}

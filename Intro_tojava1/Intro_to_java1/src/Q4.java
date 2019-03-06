import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4 {
    public void calcu_no_and_percentage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        System.out.println("String to be parsed  : " + str);
        int lowerCount, upperCount, digitCount, specialCount, spaceCount;
        lowerCount = upperCount = digitCount = specialCount = spaceCount = 0;
        DecimalFormat f = new DecimalFormat("###.##");
        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch))
                spaceCount++;
            if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isDigit(ch))
                digitCount++;
            else
                specialCount++;
        }
        specialCount = specialCount - spaceCount;
        String lowerPercentage = f.format((lowerCount * 1.0 / str.length()) * 100);
        String upperPercentage = f.format((upperCount * 1.0 / str.length()) * 100);
        String digitPercentage = f.format((digitCount * 1.0 / str.length()) * 100);
        String specialPercentage = f.format(((specialCount) * 1.0 / str.length()) * 100);
        System.out.println("I have ignored whitespaces");
        System.out.println("Lower Case Count :" + lowerCount + " and %age : " + lowerPercentage);
        System.out.println("Upper Case Count :" + upperCount + " and %age : " + upperPercentage);
        System.out.println("Digit Count :" + digitCount + " and %age : " + digitPercentage);
        System.out.println("Special Case Count :" + specialCount + " and %age : " + specialPercentage);
    }
}
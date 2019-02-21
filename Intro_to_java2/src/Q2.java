public class Q2 {
    String str = "abcde";

    public void sort_str() {
        int i, j;
        char temp;
        char charstr[] = str.toCharArray();
        for (i = 0; i < charstr.length; i++) {

            for (j = i + 1; j < charstr.length; j++) {
                if (charstr[i] < charstr[j]) {
                    temp = charstr[i];
                    charstr[i] = charstr[j];
                    charstr[j] = temp;
                }
            }

        }
        for (int p = 0; p < charstr.length; p++) {
            System.out.println(charstr[p]);
        }
    }
}

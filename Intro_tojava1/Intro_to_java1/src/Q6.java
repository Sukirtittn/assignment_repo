public class Q6 {

    public void find_odd_one_out() {
        int[] arry = { 1, 1, 2, 3, 2, 4, 4};
        for (int i = 0; i < arry.length; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[i]==(arry[j])) {
                    arry[j] = -1;
                    arry[i] = -1;
                }
            }
            if (arry[i] != -1)
                System.out.println("the element which is not in pair is: "+arry[i]);
        }
    }
}

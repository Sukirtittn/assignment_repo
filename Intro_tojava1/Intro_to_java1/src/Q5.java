import java.util.Arrays;
public class Q5 {
    public void findCommon(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
        System.out.println("Common elements in both are : ");
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}


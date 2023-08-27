package JavaProject1;

import java.util.Arrays;

public class CodingTask9 {
    public static void main(String[] args) {

        int a[] = {3,8,11,27,53,74,89,93,99};
        Arrays.sort(a);
        int aa = a[a.length -2 ];
        System.out.println("Second highest number is "+aa);

    }
}

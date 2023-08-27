package JavaProject1;

public class CodingTask3 {
    public static void main(String[] args) {

        int[][] nums =
                {
                        {2, 4, 6, 8, 10, 12, 14},
                        {3, 6, 9, 12, 15, 18, 21},
                        {22, 24, 26, 28, 30, 32, 34},
                        {36, 38, 40, 42, 44, 46, 48}
                };
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] % 2 == 0) {
                    System.out.print(nums[row][col] + " ");
                }
            }

        }System.out.println();
    }
}


package JavaProject1;

public class CodingTask4 {
    public static void main(String[] args) {

        int[][] nums =
                {{5, 10, 15, 20, 25},
                        {30, 35, 40, 45, 50},
                        {55, 60, 65, 70, 75},
                        {80, 85, 90, 95, 100}

                };
        int sumEven = 0;
        int sumOdd = 0;
        for (int row = 0; row < nums.length; row++)
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] % 2 == 0) {
                    sumEven+=nums[row][col];

                }if(nums[row][col] % 2 != 0) {
                    sumOdd+=nums[row][col];


                }

            }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }

}





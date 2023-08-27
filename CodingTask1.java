package JavaProject1;

public class CodingTask1 {
    public static void main(String[] args) {

        int[] temp = {65, 75, 70, 80, 85, 90, 89};


        int largest = temp [0];
        int smallest = temp [0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > largest)
                largest = temp[i];
            else if (temp[i] < smallest)
                smallest = temp[i];
        }



                    System.out.println("Largest Number is : " + largest);
                    System.out.println("Smallest Number is : " + smallest);

                }
                }







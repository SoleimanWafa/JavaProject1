package JavaProject1;

import java.util.Arrays;

public class CodingTask10 {
    public static void main(String[] args) {
        String [] array = {"apple", "orange", "pineapple", "grapes", "melon",
                "watermelon", "orange", "grapes", "peach", "strawberry", "orange", "apricot", "fig"};
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if((i+1)==array.length || !array[i].equals(array[(i+1)])){
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+" ");
            }
        }
    }

}
